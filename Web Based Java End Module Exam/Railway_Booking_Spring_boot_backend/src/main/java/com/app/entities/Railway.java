package com.app.entities;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="railway")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Railway {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=50, nullable=false)
	private String name;
	
	@Column(length=50, nullable=false)
	private CATEGORY category;
	
	@Column()
	private LocalTime startTime;
	
	@Column
	private LocalTime endTime;
	
	@Column(length=50, nullable=false)
	private String source;
	
	@Column(length=50, nullable=false)
	private String destination;
	
	@Column(length=50, nullable=false)
	private String stationCode;
	
	@Column
	private Double distance;
	
	@Column(length=50, nullable=false)
	private String frequency;
	
}
