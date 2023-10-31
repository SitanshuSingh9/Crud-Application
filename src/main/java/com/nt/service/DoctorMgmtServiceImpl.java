package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepo;
@Service("doctorService")
public class DoctorMgmtServiceImpl implements IDoctorService {
    @Autowired   
	private IDoctorRepo doctorRepo;
    
	public String registerDoctor(Doctor doctor) {
           
		System.out.println("docid(before save:)"+doctor.getDocid());
               Doctor doc=doctorRepo.save(doctor);
               
		           return "doctor object is saved with id value:"+doc.getDocid();
	}

}
