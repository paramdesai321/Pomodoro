import java.util.Scanner;

public class App {

    public class Node {
        String activity_name;
        int index;
        int total_hours;
        int completed_hours;
        int remaining_hours;

        public Node(int index) {
            this.index = index;
            total_hours = 0;
            completed_hours = 0;
            activity_name = null;
            remaining_hours = total_hours - completed_hours; // Update remaining_hours here
        }

        public void printtable() {
            System.out.println(index + ":");
            System.out.println("Activity Name: " + activity_name);
            System.out.println("Total Hours: " + total_hours);
            System.out.println("Completed Hours: " + completed_hours);
            System.out.println("Remaining Hours: " + remaining_hours);
        }
    }

    public Node[] list = new Node[10];
    public int n = 0;

    public void adding() {
        Scanner scan = new Scanner(System.in);
        Node activity = new Node(n);
        System.out.print("Activity Name: ");
        activity.activity_name = scan.nextLine();
        System.out.print("Total Hours: ");
        activity.total_hours = scan.nextInt();
        System.out.print("Completed Hours: ");
        activity.completed_hours = scan.nextInt();
        System.out.print("Remaining Hours: "+ activity.remaining_hours);

        list[n] = activity;
        n++;
    }

    public static void main(String[] args) {
        App app = new App();
        app.adding();
        app.list[0].printtable();
    }
}
