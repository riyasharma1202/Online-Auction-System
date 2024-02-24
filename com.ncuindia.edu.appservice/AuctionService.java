package com.ncuindia.edu.appservice;
import com.ncuindia.edu.springbootapplication.*;

public interface AuctionService {
	
	    void createAuction(String item);
	    void placeBid(long auctionId, Bid b,double amount);
	    void getAuctionDetails(long auctionId);
	    
}
