package com.ncuindia.edu.springbootapplication;
import java.util.List;

public interface BidRepository {
	
	    Bid save(Bid bid);
	    Bid findById(long id);
	    List<Bid> findAll();
	    void delete(long id);
	}
