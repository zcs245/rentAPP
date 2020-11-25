package com.zcs.service;

import com.zcs.dao.HouseMapper;
import com.zcs.dao.ReleasesMapper;
import com.zcs.entity.Commodity;
import com.zcs.entity.House;
import com.zcs.entity.Releases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {

    @Autowired
    HouseMapper houseMapper;

    @Autowired
    ReleasesMapper releasesMapper;

    /**添加房源信息*/
    public void addHouse(House house,String uPhone){
        houseMapper.insertSelective(house);

        /**
         * 相当于
         * insert into house () values ();
         */

        /**向外键表加入相关信息，建立关联*/
        Releases releases = new Releases();
        releases.setuPhone(uPhone);
        releases.sethId(house.gethId());
        releasesMapper.insertSelective(releases);

        /**
         * 相当于
         * insert into releases () values ();
         */
    }

    /**修改房源信息*/
    public void updateHouse(House house){
        System.out.println(house);
        houseMapper.updateByPrimaryKeySelective(house);
    }

    /**房源详细信息*/
    public House houseDetails(Integer hId){
        return houseMapper.selectByPrimaryKey(hId);
    }

    /**所有房源信息*/
    public List<House> houses(){
        return houseMapper.selectByExample(null);
    }
}
