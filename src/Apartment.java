public class Apartment extends Home{

    public Apartment(int id, int price, int maxGuest, String title, String address, Person [] people) {
        super(id, price, maxGuest, title, address, people);
    }
        public  void  apartment(){
            System.out.println("bhfhre");
        }
    @Override
    public void service() {
        System.out.println("Service Method");
    }
}
