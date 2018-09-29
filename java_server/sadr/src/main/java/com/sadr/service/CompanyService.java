package com.sadr.service;

import java.util.List;

import com.sadr.domain.Companys;
import com.sadr.domain.ElecMeterHub;
import com.sadr.domain.ElecMeterInfo;
import com.sadr.domain.ElecMeters;
import com.sadr.domain.EngineRooms;

public interface CompanyService {
	public List<Companys> getCompany();

	public List<EngineRooms> selectByCompanysId(EngineRooms er);
	
	public int selectByCompanysIdCount(EngineRooms er);

	public List<ElecMeterHub> gethub(ElecMeterHub hub);
	
	public int gethubCount(ElecMeterHub hub);
	
	public List<ElecMeters> getmeters(ElecMeters meter);

	public int getmetersCount(ElecMeters meter);
	
	public ElecMeters searchmeters(ElecMeters meter);

	public ElecMeterInfo getmetersinfo(ElecMeters meter);

	public List<ElecMeters> getMeters(EngineRooms er);

	public int getMetersCount(EngineRooms er);

	public EngineRooms searchmeters(EngineRooms er);
}
