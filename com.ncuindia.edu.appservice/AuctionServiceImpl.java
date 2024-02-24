package com.ncuindia.edu.appservice;
import com.ncuindia.edu.springbootapplication.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class AuctionServiceImpl implements AuctionService {

    private final BidRepository bidRepository;

    public AuctionServiceImpl(BidRepository bidRepository) {
        this.bidRepository = bidRepository;
    }

    @Override
    public void createAuction(String item) {
        // Implementation for creating auction
    }

    @Override
    public void placeBid(long auctionId, Bid bidder, double amount) {
        // Implementation for placing bid
    }

    @Override
    public void getAuctionDetails(long auctionId) {
        // Implementation for getting auction details
    }
}
