package com.capg.entity;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="shows")

public class Shows {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name ="show_id")
	private long id;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="hall_id")
	private Hall hall;
	
	@ManyToMany
	@JoinTable(name = "booking_show",
	 		   joinColumns = @JoinColumn(name = "show_id"),
	           inverseJoinColumns = @JoinColumn(name = "booking_id"))
	private Set<Booking> bookings = new HashSet<>();

	public Shows(long id, Hall hall, Set<Booking> bookings) {
		super();
		this.id = id;
		this.hall = hall;
		this.bookings = bookings;
	}

	public long getId() {
		return id;
	}

	public Hall getHall() {
		return hall;
	}

	public Set<Booking> getBookings() {
		return bookings;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	
	
	
	
//	@OneToOne
//	@JoinColumn(name="booking_id")
//	private Booking booking;
	
//	@Column(name="showTime")
//	private LocalTime showTime;
	

	
//	@ManyToOne
//	@JoinColumn(name="movie_id")
//	private Movies movie;
//	
	
	

	
	
	

}