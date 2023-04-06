package com.masai.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.Model.CategoryDTO;
import com.masai.Model.Publicapci;

@Repository
public interface PublicDao extends JpaRepository<Publicapci,Integer> {
	
	@Query("select new com.masai.Model.CategoryDTO(p.category) from PublicApci p")
	public List<CategoryDTO> getAllCategory();

}


