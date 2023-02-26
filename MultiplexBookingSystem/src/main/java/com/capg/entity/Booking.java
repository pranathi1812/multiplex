package com.capg.entity;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name="booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="booking_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User users;
	

	@ManyToMany(mappedBy = "bookings")
	private Set<Shows> shows = new HashSet<>();

	// getters and setters

	
//	@ManyToMany
//	@JoinColumn(name="show-id")
//	private Shows shows;
	private LocalDate date;
	private LocalTime time;
	

//	@JsonDeserialize(using = LocalDateDeserializer.class)
//	@JsonSerialize(using = LocalDateSerializer.class)
//	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd")
//	@Column(name="date")
//	private LocalDate date;
//	
//	@Column(name="show_date")
//	private LocalDate showDate;
//	
//	//@JoinColumn(name="show_time")
//	//private Shows shows;
	
	

	
}
