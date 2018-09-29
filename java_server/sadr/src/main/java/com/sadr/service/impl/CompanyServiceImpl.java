package com.sadr.service.impl;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadr.dao.CompanysMapper;
import com.sadr.dao.ElecMeterHubMapper;
import com.sadr.dao.ElecMeterInfoMapper;
import com.sadr.dao.ElecMetersMapper;
import com.sadr.dao.EngineRoomsMapper;
import com.sadr.domain.Companys;
import com.sadr.domain.ElecMeterHub;
import com.sadr.domain.ElecMeterInfo;
import com.sadr.domain.ElecMeters;
import com.sadr.domain.EngineRooms;
import com.sadr.service.CompanyService;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanysMapper companysMapper;
	@Autowired
	private EngineRoomsMapper engineRoomsMapper;
	@Autowired
	private ElecMeterHubMapper elecMeterHubMapper;
	@Autowired
	private ElecMetersMapper elecMetersMapper;
	@Autowired
	private ElecMeterInfoMapper elecMeterInfoMapper;

	@Override
	public List<Companys> getCompany() {
		return companysMapper.getCompany();
	}

	@Override
	public List<EngineRooms> selectByCompanysId(EngineRooms er) {
		return engineRoomsMapper.selectByCompanysId(er);
	}

	@Override
	public int selectByCompanysIdCount(EngineRooms er) {
		// TODO Auto-generated method stub
		return engineRoomsMapper.selectByCompanysIdCount(er);
	}

	@Override
	public List<ElecMeterHub> gethub(ElecMeterHub hub) {
		return elecMeterHubMapper.gethub(hub);
	}
	
	@Override
	public int gethubCount(ElecMeterHub hub) {
		return elecMeterHubMapper.gethubCount(hub);
	}
	
	@Override
	public List<ElecMeters> getmeters(ElecMeters meter) {
		return elecMetersMapper.getmeters(meter);
	}
	
	@Override
	public int getmetersCount(ElecMeters meter) {
		return elecMetersMapper.getmetersCount(meter);
	}

	@Override
	public ElecMeters searchmeters(ElecMeters meter) {
		return elecMetersMapper.selectByPrimaryKey(meter.getId());
	}

	@Override
	public ElecMeterInfo getmetersinfo(ElecMeters meter) {
		// TODO Auto-generated method stub
		int id = 0;
		try {
			id = change(meter.getIdHub(),meter.getIdMeter());
			System.out.println(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(id != 0){
			return elecMeterInfoMapper.selectByUniqueId(id);
		} 
		return null;
	}
	
	public int change(int idHub, int idMeter) throws Exception{
//		String idHubStr = Integer.toHexString(idHub);
//		
//	 	DecimalFormat format = new DecimalFormat("00");
//		
//		StringBuilder sb = new StringBuilder(idHubStr);
//		sb.append(format.format(idMeter));
//		
//		String resultStr = sb.toString();
//		System.out.println(resultStr);
//		int result = Integer.parseInt(resultStr,16);
		
		int result = idHub  + idMeter;
		return result;
	}

	@Override
	public List<ElecMeters> getMeters(EngineRooms er) {
		return elecMetersMapper.getMeters(er);
	}

	@Override
	public int getMetersCount(EngineRooms er) {
		return elecMetersMapper.getMetersCount(er);
	}

	@Override
	public EngineRooms searchmeters(EngineRooms er) {
		// TODO Auto-generated method stub
		return engineRoomsMapper.selectByPrimaryKey(er.getId());
	}
}
