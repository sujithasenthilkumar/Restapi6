package com.day6.paginationandsorting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day6.paginationandsorting.model.Baby;
import com.day6.paginationandsorting.service.BabyService;

@RestController
public class BabyController {
	@Autowired
	BabyService babyService;
	@PostMapping("/add")
	public Baby add(@RequestBody Baby baby) {
		return babyService.add(baby);
	}
	
	@PostMapping("/addlist")
	public List<Baby> addList(@RequestBody List<Baby> baby){
		return babyService.addList(baby);
	}

	@GetMapping("/show")
	public List<Baby>show(){
		return babyService.show();
	}
	
	@GetMapping("/pagination/{pageNo}/{pageSize}")
    public List<Baby> pagination(@PathVariable int pageNo,@PathVariable int pageSize){
		return babyService.pagination(pageNo, pageSize);
    }
	
    @GetMapping("sorting/{pageNo}/{pageSize}/{field}")
    public List<Baby> sorting(@PathVariable int pageNo,@PathVariable int pageSize,@PathVariable String field){
    	return babyService.sorting(pageNo, pageSize, field);
    	
    }
    
    @PostMapping("/update")
    public Baby update(@RequestBody Baby baby){
   	 	return babyService.update(baby);
   	 	
    }
    
    @PostMapping("/updatebyid/{id}")
    public String updateById(@PathVariable int id,Baby baby){
    	return babyService.updateById(id, baby);
    }
    
    @DeleteMapping("/delete")
    public void delete(@RequestBody Baby baby){
    	babyService.delete(baby);
    }
    @DeleteMapping("/deletebyid/{id}")
    public void deleteById(@PathVariable int id)
    {
   	 babyService.deletebById(id);
    }
}
