package com.tnsif.spring_annotations.Spring_Annotations.app;

import org.springframework.context.annotation.Bean;
public class AppConfig {
	@Bean
	public MusicTeacher getTeacherInfo() {
		// TODO Auto-generated method stub
		return new MusicTeacher();
	}
}
