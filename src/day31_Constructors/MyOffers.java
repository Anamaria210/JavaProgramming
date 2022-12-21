package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offers offer1= new Offers();
        offer1.setInfo("VA", "Amazon Inc", "SDET", 110000, true, true, true, true);

        Offers offer2 = new Offers();
        offer2.setInfo("CA", "Sony Inc", "QA", 120000, true, false, false, true);

        Offers offer3 = new Offers();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);

        Offers offer4 = new Offers();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false, false, true, true);

        Offers offer5 = new Offers();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        System.out.println("---------------------------------------------------");

        Offers [] myOffers={offer1,offer2,offer3,offer4,offer5};
        ArrayList<Offers> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p->!p.isFullTime); // remove if te offer is not full time
        System.out.println(fullTimeOffers.size());
        System.out.println("-------------------------------------------------");
        ArrayList<Offers> localOffers= new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p->!p.location.equals("VA") || p.location.equals("CA")); // remove the offer if the offer is not from Local area
        System.out.println(localOffers.size());

        for (Offers eachLocalOffer : localOffers) {
            System.out.println(eachLocalOffer.companyName+": " +eachLocalOffer.salary);
        }
    }
}
