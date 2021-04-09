public class BonusMilesService {
    public int calculate (int price) {
        price = 10_000;
        int cost  = 20;
        int miles = price / cost;
        return miles;

    }
}
