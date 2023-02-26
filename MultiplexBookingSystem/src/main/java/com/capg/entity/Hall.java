package com.capg.entity;
import javax.persistence.*;
@Entity

@Table(name="hall")
public class Hall {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name ="hall_id")
	private long id;
	
	@Column(name="seats_available")
	private int seatsAvailable;
	@OneToOne(cascade = CascadeType.MERGE)
	private Movies movies;
	
	public Hall() {}

	public Hall(long id, int seatsAvailable, Movies movies) {
		super();
		this.id = id;
		this.seatsAvailable = seatsAvailable;
		this.movies = movies;
	}

	public long getId() {
		return id;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public Movies getMovies() {
		return movies;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	public void setMovies(Movies movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Hall [id=" + id + ", seatsAvailable=" + seatsAvailable + ", movies=" + movies + "]";
	}
	

	
	
//	@Id
//	@GeneratedValue(strategy= GenerationType.AUTO)
//	@Column(name ="hall_id")
//	private long id;
//	
//	@Column(name="seat_number")
//	private int seatNumber;
//	
	
	
//	@OneToMany(mappedBy="hall")
//	private Set<Shows> shows;
	
	

	

}
