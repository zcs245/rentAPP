package com.zcs.controller;

import com.zcs.entity.House;
import com.zcs.service.HouseService;
import com.zcs.utils.Msg;
import com.zcs.utils.UpdateFile;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@CrossOrigin
@Controller
public class HouseController {

    @Autowired
    HouseService houseService;

    /**
     * 添加房源
     */
    @ResponseBody
    @RequestMapping(value = "/addHouse", method = RequestMethod.POST)
    public Msg addCommunity(House house, String uPhone, HttpServletRequest request, MultipartFile[] upload) throws IOException {

        /** ************************ 文件上传部分 **************************************** */

        /**创建一个数组保存获取到的图片路径*/
        String[] img = new String[3];
        Integer mark  = 2;
        /**先获取到要上传的文件目录*/
        String path = "http://47.115.46.222:8081/tupian/uploads/houses/";

        /**调用文件上传类*/
        UpdateFile updateFile = new UpdateFile();
        img = updateFile.file(img, path, upload,mark);

        /** ************************ 其他数据 **************************************** */
        String imgs = StringUtils.join(img, ",");
        house.sethImg(imgs);
        System.out.println(uPhone);
        houseService.addHouse(house, uPhone);
        return Msg.success();
    }

    /**
     * 修改房源信息
     */
    @ResponseBody
    @RequestMapping(value = "/house/{hId}", method = RequestMethod.PUT)
    public Msg updateHouse(House house) {
        System.out.println(house.gethId());
        System.out.println(house.gethMeasure());
        houseService.updateHouse(house);
        return Msg.success();
    }

    /**
     * 查看房子详细信息
     */
    @ResponseBody
    @RequestMapping(value = "/houseDetails/{hId}",method = RequestMethod.GET)
    public House houseDetails(@PathVariable("hId") Integer hId){
        return houseService.houseDetails(hId);
    }

    /**
     * 查看所有房源
     */
    @ResponseBody
    @RequestMapping(value = "/houses",method = RequestMethod.GET)
    public Msg houses(){
        List<House> houses = houseService.houses();
        return Msg.success().add("Info",houses);
    }
}

