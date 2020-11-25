package com.zcs.dao;

import com.zcs.entity.Releases;
import com.zcs.entity.ReleasesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReleasesMapper {
    long countByExample(ReleasesExample example);

    int deleteByExample(ReleasesExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(Releases record);

    int insertSelective(Releases record);

    List<Releases> selectByExample(ReleasesExample example);

    Releases selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") Releases record, @Param("example") ReleasesExample example);

    int updateByExample(@Param("record") Releases record, @Param("example") ReleasesExample example);

    int updateByPrimaryKeySelective(Releases record);

    int updateByPrimaryKey(Releases record);
}