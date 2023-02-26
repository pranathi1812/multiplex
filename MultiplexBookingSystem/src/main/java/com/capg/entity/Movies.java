package com.capg.entity;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="movies")

public class Movies {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name ="movie_id")
	private long id;
	
	@Column(name="movie_name")
	private String name;
	@DateTimeFormat
	@Column(name="from_date")
	private LocalDate fromDate;
	@DateTimeFormat
	@Column(name="to_date")
	private LocalDate toDate;
	
	@OneToMany
	@JoinColumn(name="show_id")
	private Set<Shows> shows;
	
	@DateTimeFormat
	private LocalTime time;
	
	public Movies() {}

	

	public Movies(long id, String name, LocalDate fromDate, LocalDate toDate, Set<Shows> shows, LocalTime time) {
		super();
		this.id = id;
		this.name = name;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.shows = shows;
		this.time = time;
	}
	



	public long getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public LocalDate getFromDate() {
		return fromDate;
	}



	public LocalDate getToDate() {
		return toDate;
	}



	public Set<Shows> getShows() {
		return shows;
	}



	public LocalTime getTime() {
		return time;
	}



	public void setId(long id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}



	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}



	public void setShows(Set<Shows> shows) {
		this.shows = shows;
	}



	public void setTime(LocalTime time) {
		this.time = time;
	}



	@Override
	public String toString() {
		return "Movies [id=" + id + ", name=" + name + ", fromDate=" + fromDate + ", toDate=" + toDate + ", shows="
				+ shows + ", time=" + time + "]";
	}
	
	
	
	
	}
	
	
	
	
	
//	@Id
//	@GeneratedValue(strategy= GenerationType.AUTO)
//	@Column(name ="movie_id")
//	private long id;
//	
//	@Column(name="movie_name")
//	private String name;
//	
//	@Column(name="from_date")
//	private LocalDate fromDate;
//	
//	@Column(name="to_date")
//	private LocalDate toDate;
//	
//	@OneToMany
//	@JoinColumn(name="show_id")
//	private Shows shows;
//	
//	public Movies() {}
//
//	public Movies(long id, String name, LocalDate fromDate, LocalDate toDate, Shows shows) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.fromDate = fromDate;
//		this.toDate = toDate;
//		this.shows = shows;
//	}
//
//	public long getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public LocalDate getFromDate() {
//		return fromDate;
//	}
//
//	public LocalDate getToDate() {
//		return toDate;
//	}
//
//	public Shows getShows() {
//		return shows;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setFromDate(LocalDate fromDate) {
//		this.fromDate = fromDate;
//	}
//
//	public void setToDate(LocalDate toDate) {
//		this.toDate = toDate;
//	}
//
//	public void setShows(Shows shows) {
//		this.shows = shows;
//	}
//
//	@Override
//	public String toString() {
//		return "Movies [id=" + id + ", name=" + name + ", fromDate=" + fromDate + ", toDate=" + toDate + ", shows="
//				+ shows + "]";
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Id
//	@GeneratedValue(strategy= GenerationType.AUTO)
//	@Column(name ="movie_id")
//	private long id;
//	
//	@Column(name="movie_name")
//	private String name;
//	
////	@OneToMany(mappedBy="movie")
////	private Set<Shows> shows;
//	
//	@ManyToOne
//	@JoinColumn(name="show_id")
//	private Shows show;
//
//	public long getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public Set<Shows> getShows() {
//		return shows;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setShows(Set<Shows> shows) {
//		this.shows = shows;
//	}
//
//	@Override
//	public String toString() {
//		return "Movies [id=" + id + ", name=" + name + ", shows=" + shows + "]";
//	}
	

	

	

	
	

