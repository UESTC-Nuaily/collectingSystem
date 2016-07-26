package edu.uestc.lib.MSStudio.collecting.service;

import java.util.List;

import edu.uestc.lib.MSStudio.collecting.model.Information;

public interface InformationService extends OriginService {
	public Information getInformation(String id);

	public boolean save(Information record);

	List<Information> listAllInformation(String num, String size);

}
