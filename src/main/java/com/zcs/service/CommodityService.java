package com.zcs.service;

import com.zcs.dao.CommodityMapper;
import com.zcs.entity.Commodity;
import com.zcs.entity.CommodityExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityService {

    @Autowired
    CommodityMapper commodityMapper;

    /**
     * 添加商品
     */
    public void addCommunity(Commodity commodity) {
        commodityMapper.insertSelective(commodity);

        /**
         * 相当于
         * insert into commodity () values ();
         */
    }

    /**
     * 按商品标签查询商品信息
     */
    public List<Commodity> comByTag(Commodity commodity) {
        CommodityExample commodityExample = new CommodityExample();
        CommodityExample.Criteria criteria = commodityExample.createCriteria();
        criteria.andCClassificationEqualTo(commodity.getcClassification());
        return commodityMapper.selectByExample(commodityExample);
        /**相当于
         * select * from community where c_classification =(传过来的标签值)
         */
    }

    /**
     * 根据名字模糊查询
     */
    public List<Commodity> comByVague(Commodity commodity) {
        CommodityExample commodityExample = new CommodityExample();
        CommodityExample.Criteria criteria = commodityExample.createCriteria();
        criteria.andCNameLike("%" + commodity.getcName() + "%");
        return commodityMapper.selectByExample(commodityExample);
        /**相当于
         * select * from community where c_name like (传过来的标签值)
         */
    }

    /**
     * 获取商品详情
     */
    public Commodity comDetails(Integer cId) {
        return commodityMapper.selectByPrimaryKey(cId);
        /**相当于
         * select * from community where c_id=(传过来的值)
         */
    }

    /**
     * 显示所有商品
     */
    public List<Commodity> commodities() {
        return commodityMapper.selectByExample(null);
        /**相当于
         * select * from community
         */
    }
}
