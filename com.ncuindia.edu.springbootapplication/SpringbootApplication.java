package com.ncuindia.edu.springbootapplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ncuindia.edu.appservice.AuctionService;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
	
		ApplicationContext context=SpringApplication.run(SpringbootApplication.class, args);
		BidRepository bidrepository = context.getBean(BidRepository.class);
		Bid b=new Bid();
		
		bidrepository.save(b);
		bidrepository.findById(1);
		AuctionService a=context.getBean(AuctionService.class);
		a.createAuction("Auction1");
		a.placeBid(1,b, 12.3);
		a.getAuctionDetails(1);
		
	}

}
