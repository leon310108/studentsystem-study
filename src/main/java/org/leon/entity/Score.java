package org.leon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Score {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int shuxue;
	private int yuwen;
	private int yingyu;
	
	public int getAverage() {
		return getSum()/3;
	}
	
	public int getSum() {
		return shuxue+yuwen+yingyu;
	}

	/**
	 * @param id
	 * @param name
	 * @param shuxue
	 * @param yuwen
	 * @param yingyu
	 */
	public Score(Long id, String name, int shuxue, int yuwen, int yingyu) {
		this.id = id;
		this.name = name;
		this.shuxue = shuxue;
		this.yuwen = yuwen;
		this.yingyu = yingyu;
	}
}
