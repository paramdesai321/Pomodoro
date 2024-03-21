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
        }

        public void printtable() {
            remaining_hours = total_hours - completed_hours; // Update remaining_hours here
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

        list[n] = activity;
        n++;
    }

    public void printlist(){

    	for(int i=0;i<n;i++){

    		System.out.println((i+1)+". "+list[i].activity_name);
    	}
    }

    public void rename(Node node){

    		Scanner	scan= new Scanner(System.in);
    		System.out.print("Please Rename the Activity: ");
    		node.activity_name = scan.next();

    }

    public void total_hours(Node node,int total_hours){


    }

    public void options(){

    	Scanner scan  = new Scanner(System.in);

    	printlist();
    	System.out.print("Choose an activity from above: ");
    	int choice = scan.nextInt();
    	System.out.println("----------Options-----");
    	System.out.println("-----------------------");
    	System.out.println("1. Rename the Activity");
    	System.out.println("2. Change Total Hours");
    	System.out.println("3. Change Completed Hours");
    	System.out.println("4. Add an activity");
    	System.out.println("5. Delete an activity");
    	System.out.println("6. Quit");
    	int option = scan.nextInt();

    	switch(option){

    	case 1:
    		rename(list[choice]);
    	default:
    		System.out.println("Not a valid choice, try again!");


    	}
    }

    public static void main(String[] args) {
        App app = new App();

        app.printlist();
    }
}
