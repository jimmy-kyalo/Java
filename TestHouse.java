public class TestHouse {
    public static void main(String[] args) {
        House house1 = new House(1, 1750.50);
        House house2 = (House) house1.clone();
        House house3 = new House(3, 1234.56);

        System.out.println(house2.toString());
        System.out.println(house3.toString());
    }

}