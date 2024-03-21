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




        
    }


    App app = new App();


        // in this section we will work on making a list of activities
    App.Node[] list = new App.Node[10];
    int n=0;


    public static void adding(Node activity){


            list[n] = activity; 

    }




    public static void main(String[] args) {
        App app = new App(); // Create an instance of the outer class
        App.Node node = app.new Node(4); // Create an instance of the inner class using the outer class instance

        // Accessing instance variables through the instance of the inner class
        System.out.println("index: " + node.index);
    }
}
