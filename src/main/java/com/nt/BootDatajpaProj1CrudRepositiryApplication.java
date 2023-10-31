package com.nt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.Doctor;

import com.nt.service.IDoctorService;

@SpringBootApplication
public class BootDatajpaProj1CrudRepositiryApplication {

	public static void main(String[] args) {
		//get ioc container
	ApplicationContext ctx=	SpringApplication.run(BootDatajpaProj1CrudRepositiryApplication.class, args);
	 
	IDoctorService service=ctx.getBean("doctorService",IDoctorService.class);
	
	try {//creat  doctor class object 
		        
		Doctor doctor= new Doctor();
		doctor.setDocName("Ram Sitanshu Singh");
		doctor.setSpecialization("MD-cardio");
		doctor.setIncome(890000.0);
		//invoke the b.logic
		String resultMsg=service.registerDoctor(doctor);
		
		System.out.println(resultMsg);
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	}

}
