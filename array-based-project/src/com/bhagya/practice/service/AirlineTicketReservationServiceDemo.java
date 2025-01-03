package com.bhagya.practice.service;
import com.bhagya.practice.model.BillingAndCancellation;
import com.bhagya.practice.model.Flight;
import com.bhagya.practice.model.Passenger;
import com.bhagya.practice.model.Ticket;

import java.util.Scanner;
public class AirlineTicketReservationServiceDemo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;

        PassengerService passengerService = new PassengerService();
        Passenger passenger = passengerService.acceptPassenger();

        FlightService flightService = new FlightService();
        Flight flight = flightService.FlightInformation();

        TicketService ticketService = new TicketService();
        Ticket ticketbooking = ticketService.TicketBooking();

        BillingAndCancellationService billingAndCancellationService = new BillingAndCancellationService();
        BillingAndCancellation billingAndCancellation= billingAndCancellationService.BillingService();


        do {
            System.out.println("1. Passenger Registration");
            System.out.println("2. information About Flight");
            System.out.println("3. book your Ticket here");
            System.out.println("4. Billing And Ticket Cancellation Details");
            System.out.println("0. Exit ");

            option = Integer.parseInt(scanner.nextLine());


            switch (option) {
                case 1:
                    System.out.println("Passenger Details:" + passenger);
                    break;
                case 2:
                    System.out.println("Flight Information" + flight);
                    break;
                case 3:
                    System.out.println("Book Your Ticket" + ticketbooking);
                    break;

                    case 4:
                    System.out.println("Billing And Ticket Cancellation Details" + billingAndCancellation);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Option");

            }

        } while (option != 0);





    }
}
