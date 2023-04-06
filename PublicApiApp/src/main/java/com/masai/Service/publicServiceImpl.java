package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exceptions.publicException;
import com.masai.Model.CategoryDTO;
import com.masai.Model.Publicapci;
import com.masai.Repository.PublicDao;
@Service
public class publicServiceImpl implements PublicService {
    
	@Autowired
	private PublicDao dao;
	
	@Override
	public Publicapci addData(Publicapci data) {
		Publicapci saveData=dao.save(data);
		return saveData;
	}

	@Override
	public Publicapci getRandom(Integer id) throws publicException {
		Optional<Publicapci>  opt=dao.findById(id);
	
		if(opt.isPresent()) {
			return opt.get();
		}
		else {
			throw new publicException("noDataFound");
		}
	}

	@Override
	public boolean checkHealth() throws publicException {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public List<Publicapci> getAllData() throws publicException {
		List<Publicapci> list=dao.findAll();
		if(list.size()>0) {
			return list;
		}
		else {
			throw new publicException("no data found");
		}
		
	}

	
	@Override
	public List<CategoryDTO> getAllCategory() throws publicException {
		List<CategoryDTO>  categoryList=dao.getAllCategory();
		if(categoryList.size()>0) {
			return categoryList;
		}
		else {
			throw new publicException("there is no data found");
		}
	}
	

}
