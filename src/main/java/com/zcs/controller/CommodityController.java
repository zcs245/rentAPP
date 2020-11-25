package com.zcs.controller;

import com.zcs.entity.Commodity;

import javax.servlet.http.HttpServletRequest;

import com.zcs.service.CommodityService;
import com.zcs.utils.Msg;
import com.zcs.utils.UpdateFile;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@CrossOrigin
@Controller
public class CommodityController {

    @Autowired
    CommodityService commodityService;

    /**添加商品*/
    @ResponseBody
    @RequestMapping(value = "/addCommunity",method = RequestMethod.POST)
    public Msg addCommunity(Commodity commodity,MultipartFile[] upload) throws IOException {

        /** ************************ 文件上传部分 **************************************** */

        /**创建一个数组保存获取到的图片路径*/
        String[] img = new String[3];
        Integer mark  = 1;
        /**先获取到要上传的文件目录*/
        String path ="http://47.115.46.222:8081/tupian/uploads/communities/";

        /**调用文件上传类*/
        UpdateFile updateFile  = new UpdateFile();
        img = updateFile.file(img,path,upload,mark);

        /** ************************ 其他数据 **************************************** */
        String imgs = StringUtils.join(img,",");
        commodity.setcImg(imgs);
        commodityService.addCommunity(commodity);
        return Msg.success();

    }

    /**按商品标签查询商品信息*/
    @ResponseBody
    @RequestMapping(value = "/comByTag",method = RequestMethod.POST)
    public Msg comByTag(@RequestBody Commodity commodity) {
        List<Commodity> commodities = commodityService.comByTag(commodity);
        return Msg.success().add("Info",commodities);
    }

    /**模糊查询*/
    @ResponseBody
    @RequestMapping(value = "/comByVague",method = RequestMethod.POST)
    public Msg comByVague(@RequestBody Commodity commodity){
        List<Commodity> commodities = commodityService.comByVague(commodity);
        return Msg.success().add("Info",commodities);
    }

    /**商品详情*/
    @ResponseBody
    @RequestMapping(value = "/comDetails/{cId}",method = RequestMethod.GET)
    public Msg comDetails(@PathVariable("cId") Integer cId) {
        Commodity commodities = commodityService.comDetails(cId);
        return Msg.success().add("Info", commodities);
    }

    /**显示所有商品*/
    @ResponseBody
    @RequestMapping(value = "/communities",method = RequestMethod.GET)
    public Msg communities(){
        List<Commodity> commodity = commodityService.commodities();
        return Msg.success().add("Info",commodity);
    }
}
