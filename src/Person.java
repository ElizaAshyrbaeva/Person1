public class Person {
    private  int id;
    private String firstName,lastName,email,phoneNumber;
    private byte age;


    public Person(int id,String firstName,String lastName,String email,String phoneNumber,byte age){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        if(email.contains("@")){
        this.email=email;
            }else {
            System.out.println("@ jaz");
        }
                if(phoneNumber.contains("+996") && phoneNumber.length()==13){
                    this.phoneNumber=phoneNumber;
                }else {
                    System.out.println("kyrgyz number kabyl alynat");
                }
            if(age <127 && age >0){
             this.age=age;
                System.out.println();
            }else {
                System.out.println("Jash tuura emes");
            }

        }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public byte getAge(){
        return age;
    }
    public void setAge(byte age){
        this.age=age;
    }

            public Address placeOfWork(){
        return null;
            }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
