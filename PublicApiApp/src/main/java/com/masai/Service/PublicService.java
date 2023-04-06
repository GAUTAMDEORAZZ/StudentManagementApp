package com.masai.Service;

import java.util.List;

import com.masai.Exceptions.publicException;
import com.masai.Model.CategoryDTO;
import com.masai.Model.Publicapci;

public interface PublicService {
	public Publicapci  addData(Publicapci data);
	public List<Publicapci> getAllData()throws publicException;
	public Publicapci  getRandom(Integer id)throws publicException;
	public boolean  checkHealth()throws publicException;
	public List<CategoryDTO> getAllCategory()throws publicException;

}
