package enumeration;

enum Months implements Notify{
    Jan, Feb, Mar, Aprl, May;

    @Override
    public void message() {
        System.out.println("interface call in enumeration");
    }
}
public class Main {
    public static void main(String[] args) {
        Months month;
        month = Months.Mar;


        for(Months list:Months.values()){
            System.out.println(list);
        }
        System.out.println(month.ordinal());

    }
}
