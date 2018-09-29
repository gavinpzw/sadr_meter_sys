package com.sadr.dao;

import com.sadr.domain.ElecMeterHub;
import com.sadr.domain.ElecMeterHubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElecMeterHubMapper {
    long countByExample(ElecMeterHubExample example);

    int deleteByExample(ElecMeterHubExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ElecMeterHub record);

    int insertSelective(ElecMeterHub record);

    List<ElecMeterHub> selectByExample(ElecMeterHubExample example);

    ElecMeterHub selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ElecMeterHub record, @Param("example") ElecMeterHubExample example);

    int updateByExample(@Param("record") ElecMeterHub record, @Param("example") ElecMeterHubExample example);

    int updateByPrimaryKeySelective(ElecMeterHub record);

    int updateByPrimaryKey(ElecMeterHub record);
    
    List<ElecMeterHub> gethub(ElecMeterHub hub);

	int gethubCount(ElecMeterHub hub);
}