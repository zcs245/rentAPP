package com.zcs.utils;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class UpdateFile {

    public String[] file(String[] img, String path, MultipartFile[] upload,Integer j) throws IOException {

        /**循环便利上传上来的文件*/
        for (int i = 0; i < upload.length; i++) {

            /** 获取到上传文件的名称 */
            String fileName = upload[i].getOriginalFilename();

            /** 获取后缀  */
            String suffixName = fileName.substring(fileName.lastIndexOf("."));

            /**用UUid生成文件名*/
            String uuid = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase().substring(0, 5);

            /** 把文件的名称唯一化*/
            fileName = uuid + suffixName;
            System.out.println(fileName);
            /**上传文件*/
            Client client = Client.create();
            WebResource webResource = client.resource(path+fileName);
            webResource.put(upload[i].getBytes());
            /**保存图片路径*/
            if(j==1) {
                img[i] = "/uploads/communities/" + fileName;
            }
            else{
                img[i] = "/uploads/houses/" + fileName;
            }
        }
        return img;
    }
}
