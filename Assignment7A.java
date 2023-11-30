import java.util.Scanner;

public class Assignment7A {
    public static void main(String []args){
        int choice = 0;
        Scanner sc = new Scanner (System.in);  //Initalizing new scanner

        System.out.println("[SVG Class]");
        System.out.println("Rectangle width: ");
            float w = sc.nextFloat();
        System.out.println("Rectangle height: ");
            float h = sc.nextFloat();
        System.out.println("Fill color: ");
            String fC = sc.nextLine();
            fC = sc.nextLine();
        System.out.println("Stroke color: ");
            String sC = sc.nextLine();

        SVGRect rectangle = new SVGRect(w, h, fC, sC);  //Creating new SVGRect Object w/ given paramaters

        do {
            System.out.println("What would you like to do?");
            System.out.println("1) Change the Rectangle size");
            System.out.println("2) Update the Fill and Stroke settings");
            System.out.println("3) Move the Rectangle");
            System.out.println("4) Print valid XML");
            System.out.println("5) Quit");
            System.out.println("Option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a width: ");
                        float x = sc.nextFloat();
                    System.out.println("Enter a height: ");
                        float y = sc.nextFloat();
                    rectangle.setDimensions(x, y);  //Sends to boolean method: Completes if true, does not complete if false.
                    break;                          //Messages are added to the method itself (meaning i don't have to write it every time)

                case 2:
                    System.out.println("Enter a new fill color: ");
                        String fill = sc.nextLine();  //additional scanner reading (because sometimes it will register your last 'Enter" first and skip)
                        fill = sc.nextLine();
                    System.out.println("Enter a new stroke color: ");
                        String stroke = sc.nextLine();
                    System.out.println("Enter a new stroke width: ");
                        float sWidth = sc.nextFloat();
                    rectangle.set_fill_and_stroke(fill, stroke, sWidth);  //boolean to see whether Width is valid, then sets width and new colors
                    break;

                case 3:
                    System.out.println("Enter a new offset x: ");
                        x = sc.nextFloat();
                    System.out.println("Enter a new offset y: ");
                        y = sc.nextFloat();
                    rectangle.SetOffsets(x, y); //Updates rectangle offset
                    System.out.println("Rectangle updated!");
                    break;

                case 4:
                    rectangle.Print_XML(); //Prints the XML File
                    break;

                case 5:
                    break; //Quits

            }
        }
        while (choice != 5);
        System.out.println("Closing!"); //End message prints only after do/while loop is finished
    }
}
