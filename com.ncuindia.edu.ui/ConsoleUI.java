package com.ncuindia.edu.ui;
import com.ncuindia.edu.appservice.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleUI implements CommandLineRunner {

    private final AuctionService auctionService;

    @Autowired
    public ConsoleUI(AuctionService auctionService) {
        this.auctionService = auctionService;
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create Auction");
            System.out.println("2. Place Bid");
            System.out.println("3. View Auction Details");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createAuction();
                    break;
                case 2:
                    placeBid();
                    break;
                case 3:
                    viewAuctionDetails();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private void createAuction() {
        // Implement logic to create an auction
    }

    private void placeBid() {
        // Implement logic to place a bid
    }

    private void viewAuctionDetails() {
        // Implement logic to view auction details
    }
}
