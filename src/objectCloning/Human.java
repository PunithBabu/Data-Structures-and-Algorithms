package objectCloning;

import java.util.Arrays;

public class Human implements Cloneable{

    private int age;
    private String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{2,4,6,8};
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    public Object clone() throws CloneNotSupportedException{

//        return super.clone();     shallow cloning

        Human twin=(Human)super.clone();

        twin.arr = new int[twin.arr.length];             // deep cloning
        for(int i=0 ; i<twin.arr.length ; i++){
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }
}
