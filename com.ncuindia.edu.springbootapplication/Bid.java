package com.ncuindia.edu.springbootapplication;
import org.springframework.beans.factory.annotation.*;

public class Bid {
	
	    private Long id;
	    private String bidder;
	    private double amount;
	    private long timestamp;

	    // Constructors

	    public Bid(Long id, String bidder, double amount, long timestamp) {
			super();
			this.id = id;
			this.bidder = bidder;
			this.amount = amount;
			this.timestamp = timestamp;
		}
        public Bid() {
        	
        }
	    // Getter methods
	    public Long getId() {
	        return id;
	    }

		public String getBidder() {
	        return bidder;
	    }

	    public double getAmount() {
	        return amount;
	    }

	    public long getTimestamp() {
	        return timestamp;
	    }

	    // Setter methods
	    public void setId(Long id) {
	        this.id = id;
	    }

	    public void setBidder(String bidder) {
	        this.bidder = bidder;
	    }

	    public void setAmount(double amount) {
	        this.amount = amount;
	    }

	    public void setTimestamp(long timestamp) {
	        this.timestamp = timestamp;
	    }

		@Override
		public String toString() {
			return "Bid [id=" + id + ", bidder=" + bidder + ", amount=" + amount + ", timestamp=" + timestamp + "]";
		}
	    
	}
