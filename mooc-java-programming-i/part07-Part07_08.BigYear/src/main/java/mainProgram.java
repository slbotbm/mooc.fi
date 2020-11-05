
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdRegister register = new BirdRegister();
        while (true) {
            System.out.print("? ");
            String answer = scan.nextLine();
            if (answer.equals("Quit")) {
                break;
            } else if (answer.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scan.nextLine();
                Bird bird = new Bird(name, latin);
                register.add(bird);
            } else if (answer.equals("Observation")) {
                System.out.print("Bird? ");
                answer = scan.nextLine();
                if (register.getBirdNames().contains(answer)) {
                    for (Bird bird : register.getList()) {
                        if (answer.equals(bird.getName())) {
                            bird.increaseObservation();
                            break;
                        }
                    } 
                    
                } else {
                    System.out.println("Not a bird!");
                }
            } else if (answer.equals("All")) {
                System.out.println(register.toString());
            } else if (answer.equals("One")) {
                System.out.print("Bird? ");
                answer = scan.nextLine();
                System.out.println(register.getBird(answer));
                }
            } 
        }

    }


