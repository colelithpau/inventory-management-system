import java.util.ArrayList;

public class DonationManager {
    ArrayList<Donation> list = new ArrayList<>();

    public void addDonation(Donation d) {
        list.add(d);
    }

    public void showAll() {
        for (Donation d : list) {
            System.out.println(d.foodItem + " - " + d.quantity + " units");
        }
    }
}
