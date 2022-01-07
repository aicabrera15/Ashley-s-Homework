package InterfaceNumberTwo;


interface BabyClothing{

    String size = "0-3";
    void pink();


}
public class One implements BabyClothing{

    public static void main(String[] args) {
        System.out.println(size);

        One ex = new One();
        ex.pink();


    }

    @Override
    public void pink() {
        System.out.println("It is pink");




    }

}
