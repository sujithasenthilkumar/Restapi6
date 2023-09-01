package com.day6.paginationandsorting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day6.paginationandsorting.model.Baby;
import com.day6.paginationandsorting.repository.BabyRepository;



@Service
public class BabyService {
	@Autowired
	private BabyRepository babyRepository;

	public Baby add(Baby baby) {
		// TODO Auto-generated method stub
		return babyRepository.save(baby);
	}

	public List<Baby> addList(List<Baby> baby) {
		// TODO Auto-generated method stub
		return babyRepository.saveAll(baby);
	}

	public List<Baby> show() {
		// TODO Auto-generated method stub
		return babyRepository.findAll();
	}

	public List<Baby> pagination(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		Page<Baby> page=babyRepository.findAll(PageRequest.of(pageNo, pageSize));
		return page.getContent();
	}
	
	/*
    public void deletebyid(int id)
    {
    	cr.deleteById(id);
    }*/

	public List<Baby> sorting(int pageNo, int pageSize, String field) {
		Page<Baby> page=babyRepository.findAll(PageRequest.of(pageNo, pageSize,Sort.by(field)));
		return page.getContent();
	}

	public Baby update(Baby baby) {
		// TODO Auto-generated method stub
		return babyRepository.saveAndFlush(baby);
	}

	public String updateById(int id, Baby baby) {
		// TODO Auto-generated method stub
		babyRepository.saveAndFlush(baby);
		if(babyRepository.existsById(id))
    	{
    		return "updated";
    	}
    	else
    	{
    		return "Invalid Id";
    	}
	}

	public void delete(Baby baby) {
		// TODO Auto-generated method stub
		babyRepository.delete(baby);
	}

	public void deletebById(int id) {
		// TODO Auto-generated method stub
		babyRepository.deleteById(id);
	}
	
}
