
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeRegister recipes = new RecipeRegister();
        
        System.out.print("File to read: ");
        try(Scanner scan = new Scanner(Paths.get(scanner.nextLine()))) {
            while (scan.hasNextLine()) {
                ArrayList<String> inter = new ArrayList<>();
                while(true) {
                    String row = scan.nextLine();
                    if (scan.hasNextLine()) {
                        if (row.isEmpty()) {
                            break;
                        }
                    } else {
                        break;
                    }
                    inter.add(row);
                }
                ArrayList inter2 = new ArrayList<>();
                for (int i = 2; i < inter.size(); i++) {
                    inter2.add(inter.get(i));
                }
                recipes.add(new Recipe(inter.get(0), Integer.valueOf(inter.get(1)), inter));
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("\nCommands:\n" + "list - lists the recipes\n" + "stop - stops the program\n" + "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" + "find ingredient - searches recipes by ingredient\n");
        while (true) {
            System.out.print("Enter command: ");
            String answer = scanner.nextLine();
            if (answer.equals("stop")) {
                break;
            } else if (answer.equals("list")) {
                System.out.println("\nRecipes: ");
                System.out.println(recipes.toString());
            } else if (answer.equals("find name")) {
                System.out.print("Searched word: ");
                answer = scanner.nextLine();
                System.out.println("\nRecipes: ");
                for (Recipe recipe : recipes.getRegister()) {
                    if (recipe.getName().contains(answer)) {
                        System.out.println(recipe.toString());
                    }
                }
                System.out.println("");
            } else if (answer.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int temp = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes: ");
                for (Recipe recipe : recipes.getRegister()) {

                    if (recipe.getTime() <= temp) {
                        System.out.println(recipe.toString());
                    }
                }
                System.out.println();
                
            } else if (answer.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                answer = scanner.nextLine();
                System.out.println("\nRecipes: ");
                for (Recipe recipe : recipes.getRegister()) {
                    if (recipe.getIngredients().contains(answer)) {
                        
                        System.out.println(recipe.toString());
                    }
                }
                System.out.println();
            }
        }
    }
    
    

}
