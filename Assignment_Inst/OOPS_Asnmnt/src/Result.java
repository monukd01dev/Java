import java.util.Scanner;

class Result {
    int roll_no;
    String name;
    int arr[];

    {
        arr = new int[3];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Roll no. : ");
        roll_no = sc.nextInt();
        System.out.print("Enter your name: ");
        name = sc.next();
        System.out.print("Enter your marks in all subjects respectively : ");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

    }

    void show() {
        System.out.println("Roll no.      : " + roll_no);
        System.out.println("Name          : "+name);
        System.out.println("English Marks : "+arr[0]);
        System.out.println("Maths Marks   : "+arr[1]);
        System.out.println("Science Marks : "+arr[2]);
    }

    int total() {
        return arr[0]+arr[1]+arr[2];
    }

    int average() {
        return (arr[0]+arr[1]+arr[2])/3;
    }

    public static void main(String[] args) {
        Result r = new Result();
        r.input();
        r.show();
        System.out.println("Total Marks   : "+r.total());
        System.out.println("Average Marks : "+r.average());
    }
}

