import java.util.Scanner;

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("[Guess the Color Model]");
  System.out.println("How many channels does your image have?") 
      int channels = sc.nextInt();  //Starting with channels as the case condition

  switch(channels) {
    case 1:
    case 2: //Greyscale is 1-2 channels. Stacks allow me to consider both without retyping
        System.out.println("It is a greyscale image.")
        break;
    case 3:
        System.out.println("It is an RGB image.");
        break;
    case 4:
        System.out.println("What is it's BPC value?")
            int BPC = sc.nextInt();
        if (BPC == 8 || BPC == 16) {
            System.out.println("What image format is it?")
                String format = sc.nextLine();
            if (format.equals("PNG")) {
                System.out.println("It is a PNG image.")
                break; //Breaks the switch statement as well
            }
            else if (format.equals("TIFF")) {
                System.out.println("It is a CMYK image.")
                  break;
            }
            else if (format.equals("BMP")) {
                  System.out.println("This image’s color mode can not be determined.");
                  break;
            }
            else {
                  System.out.println("This is invalid input. Please run the program again.");
                    break;
            }
        }
        else if (BPC == 32) {
            System.out.println("It is an RGB image.");
            break;
        }
      case 5:
          System.out.println("It is a CMYK image.");
          break;
      default:
          System.out.println("This is invalid input. Please run the program again.");
          break;
    }
  }
}
