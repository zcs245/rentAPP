package com.zcs.dao;

import com.zcs.entity.Privacy;
import com.zcs.entity.PrivacyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrivacyMapper {
    long countByExample(PrivacyExample example);

    int deleteByExample(PrivacyExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(Privacy record);

    int insertSelective(Privacy record);

    List<Privacy> selectByExample(PrivacyExample example);

    Privacy selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") Privacy record, @Param("example") PrivacyExample example);

    int updateByExample(@Param("record") Privacy record, @Param("example") PrivacyExample example);

    int updateByPrimaryKeySelective(Privacy record);

    int updateByPrimaryKey(Privacy record);
}