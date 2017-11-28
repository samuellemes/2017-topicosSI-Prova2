package br.edu.univas.si8.ta.ejb.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "shopping_order")
@SequenceGenerator(name="seq_shopping_order", sequenceName = "seq_shopping_order", allocationSize = 1)
public class Shopping {
	
	@Id
	@GeneratedValue(generator = "seq_shopping_order", strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String description;
	
@Column(name="order_time")
	private String orderTime;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
