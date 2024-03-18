package objectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human punith = new Human(23, "punith babu");
        Human twin = (Human)punith.clone();

        twin.arr[0]=100;
        System.out.println(punith.toString());

        System.out.println(twin.toString());
    }
}
