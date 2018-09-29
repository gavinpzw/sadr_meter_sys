package com.sadr.dao;

import com.sadr.domain.Companys;
import com.sadr.domain.CompanysExample;
import com.sadr.domain.Users;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanysMapper {
    long countByExample(CompanysExample example);

    int deleteByExample(CompanysExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Companys record);

    int insertSelective(Companys record);

    List<Companys> selectByExample(CompanysExample example);

    Companys selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Companys record, @Param("example") CompanysExample example);

    int updateByExample(@Param("record") Companys record, @Param("example") CompanysExample example);

    int updateByPrimaryKeySelective(Companys record);

    int updateByPrimaryKey(Companys record);

    //add
	List<Companys> getCompany();
}