package Pages;

import locators.Page2;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class SecondPage {
    public static void secondPage(){
        Page2.locateBus(4);
        Page2.selectedBus.click();
        Page2.locateSeat(5);
        Page2.selectedSeat.click();
        System.out.println("Total Number of seats:"+ Page2.totalSeats.size());
        System.out.println("Total Number of available seats:"+Page2.availableSeats.size());
        System.out.println("Available seats:");
        for (WebElement seat : Page2.availableSeats){
            System.out.println(Objects.requireNonNull(seat.getAttribute("aria-label")).split(", ")[0]);
        }
        Page2.locateNextPageButton();
        Page2.button.click();
    }
}
