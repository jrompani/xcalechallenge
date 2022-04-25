package com.xcalechallenge.app.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate sendAt;
	
    @OneToOne
    @JoinColumn
	private Message message;
	
    @ManyToOne
    @JoinColumn(name = "to_id")
	private Contact contactTo;
	
	public Notification(Contact to, Message message) {
		this.contactTo = to;
		this.message = message;
	}
}
