public abstract class Home {
    private int id,price,maxGuest;
    private String title,address;
    private Person[] people;

    public Home(int id, int price, int maxGuest, String title, String address, Person [] people) {
        this.id = id;
        if(price < 0){
        this.price = price;}
        if(maxGuest < 0){
        this.maxGuest = maxGuest;}
        this.title = title;
        this.address = address;
        this.people = people;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person [] people) {
        this.people = people;
    }

    public  abstract  void  service();

    @Override
    public String toString() {
        return "Home{" +
                "id=" + id +
                ", price=" + price +
                ", maxGuest=" + maxGuest +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", people=" + people +
                '}';
    }
}
