package Pages;

import locators.Page2;

public class SecondPage {
    public static void secondPage(){
        Page2.locateBus(4);
        Page2.slectedBus.click();
        Page2.locateSeat(5);
        Page2.selectedSeat.click();
        Page2.locateNextPageButton();
        Page2.button.click();
    }
}
