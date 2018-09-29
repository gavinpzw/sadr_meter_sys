package com.sadr.dao;

import com.sadr.domain.ElecMeterInfo;
import com.sadr.domain.ElecMeterInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElecMeterInfoMapper {
    long countByExample(ElecMeterInfoExample example);

    int deleteByExample(ElecMeterInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ElecMeterInfo record);

    int insertSelective(ElecMeterInfo record);

    List<ElecMeterInfo> selectByExample(ElecMeterInfoExample example);

    ElecMeterInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ElecMeterInfo record, @Param("example") ElecMeterInfoExample example);

    int updateByExample(@Param("record") ElecMeterInfo record, @Param("example") ElecMeterInfoExample example);

    int updateByPrimaryKeySelective(ElecMeterInfo record);

    int updateByPrimaryKey(ElecMeterInfo record);
    
    ElecMeterInfo selectByUniqueId(Integer uniqueId);
}