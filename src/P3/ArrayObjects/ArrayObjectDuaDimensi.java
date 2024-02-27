package P3.ArrayObjects;

public class ArrayObjectDuaDimensi {    
    public static void main(String[] args) {
        MyClass[][] myArray = new MyClass[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                myArray[i][j] = new MyClass(i * 3 + j);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(myArray[i][j].data + " ");
            }
            System.out.println();
        }
    }
}

class MyClass {
    int data;

    public MyClass(int data) {
        this.data = data;
    }
}
