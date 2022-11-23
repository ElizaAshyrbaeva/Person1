public class House extends  Home{
    public House(int id, int price, int maxGuest, String title, String address, Person [] people) {
        super(id, price, maxGuest, title, address, people);
    }
    public  void house(){
        System.out.println("dnjkfb");
    }

    @Override
    public void service() {
        System.out.println("njkn");

    }
}
