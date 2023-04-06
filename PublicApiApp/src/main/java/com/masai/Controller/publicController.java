package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exceptions.publicException;
import com.masai.Model.CategoryDTO;
import com.masai.Model.Publicapci;
import com.masai.Service.PublicService;

@RestController
public class publicController {
	
	@Autowired
	private PublicService publicserviec;
	
	@PostMapping("/postPeople")
	public ResponseEntity<Publicapci> addDataController(@RequestBody Publicapci data){
		Publicapci saveData= publicserviec.addData(data);
		return new ResponseEntity<Publicapci>(saveData,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/entries")
	public ResponseEntity<List<Publicapci>> getAllDataController()throws publicException{
		List<Publicapci> list=publicserviec.getAllData();
		return new ResponseEntity<List<Publicapci>>(list,HttpStatus.OK);
		
	}
	
	@GetMapping("/random/{id}")
	public ResponseEntity<Publicapci> getRandomController(@PathVariable("id")  Integer id)throws publicException{
		Publicapci random=publicserviec.getRandom(id);
		return new ResponseEntity<Publicapci>(random,HttpStatus.OK);
	}
	
	@GetMapping("/category")
	public ResponseEntity<List<CategoryDTO>> getCategoryListController()throws publicException{
		List<CategoryDTO> list=publicserviec.getAllCategory();
		return new ResponseEntity<List<CategoryDTO>>(list,HttpStatus.OK);
	}

}
