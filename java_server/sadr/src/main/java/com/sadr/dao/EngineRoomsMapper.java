package com.sadr.dao;

import com.sadr.domain.EngineRooms;
import com.sadr.domain.EngineRoomsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngineRoomsMapper {
    long countByExample(EngineRoomsExample example);

    int deleteByExample(EngineRoomsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EngineRooms record);

    int insertSelective(EngineRooms record);

    List<EngineRooms> selectByExample(EngineRoomsExample example);

    EngineRooms selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EngineRooms record, @Param("example") EngineRoomsExample example);

    int updateByExample(@Param("record") EngineRooms record, @Param("example") EngineRoomsExample example);

    int updateByPrimaryKeySelective(EngineRooms record);

    int updateByPrimaryKey(EngineRooms record);
    
    List<EngineRooms> selectByCompanysId(EngineRooms er);

	int selectByCompanysIdCount(EngineRooms er);
}