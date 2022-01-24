package com.example.prime.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="Logs")
public class Log {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="timestamp")
	private Timestamp timestamp;
	@Column(name="range")
	private int[] range;
	@Column(name="numberOfPrimes")
	private int numberOfPrimes;
	@Column(name="elapsedTime")
	private double elapsedTime;
	@Column(name="strategy")
	private String strategy;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public int[] getRange() {
		return range;
	}
	public void setRange(int[] range) {
		this.range = range;
	}
	public int getNumberOfPrimes() {
		return numberOfPrimes;
	}
	public void setNumberOfPrimes(int numberOfPrimes) {
		this.numberOfPrimes = numberOfPrimes;
	}
	public double getElapsedTime() {
		return elapsedTime;
	}
	public void setElapsedTime(double elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	public String getStrategy() {
		return strategy;
	}
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}
	

}
