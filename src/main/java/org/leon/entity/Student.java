package org.leon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String no;
	/**
	 * @param id
	 * @param name
	 * @param no
	 */
	
}
