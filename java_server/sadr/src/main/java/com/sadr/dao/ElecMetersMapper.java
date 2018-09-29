package com.sadr.dao;

import com.sadr.domain.ElecMeters;
import com.sadr.domain.ElecMetersExample;
import com.sadr.domain.EngineRooms;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElecMetersMapper {
    long countByExample(ElecMetersExample example);

    int deleteByExample(ElecMetersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ElecMeters record);

    int insertSelective(ElecMeters record);

    List<ElecMeters> selectByExample(ElecMetersExample example);

    ElecMeters selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ElecMeters record, @Param("example") ElecMetersExample example);

    int updateByExample(@Param("record") ElecMeters record, @Param("example") ElecMetersExample example);

    int updateByPrimaryKeySelective(ElecMeters record);

    int updateByPrimaryKey(ElecMeters record);
    
    
    List<ElecMeters> getmeters(ElecMeters meter);

	int getmetersCount(ElecMeters meter);

	List<ElecMeters> getMeters(EngineRooms er);

	int getMetersCount(EngineRooms er);
}