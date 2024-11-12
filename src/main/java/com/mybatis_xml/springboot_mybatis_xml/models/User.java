package com.mybatis_xml.springboot_mybatis_xml.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
	Integer id;
	String name;
	String email;
}
