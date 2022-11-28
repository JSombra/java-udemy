package modulo15.application;

import modulo15.model.entities.Reservation;
import modulo15.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            System.out.print("Check-In date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out date: ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);

            System.out.println(reservation);
            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println(reservation);
        }
        catch (ParseException err) {
            System.out.println("Invalid date format.");
        }
        catch (DomainException err){
            System.out.println("Error in reservations: " + err.getMessage());
        }
        catch (RuntimeException err) {
            System.out.println("Unexpecxted error");
        }

        sc.close();
    }
}
