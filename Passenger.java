import java.util.Scanner;

public class Passenger extends Seat{
    public Passenger(){
        
    }
    
    public static void main (String[] args){
        Passenger A = new Passenger();
        A.setSeats();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to Airline Ticket Purchase Machine! \nWhat would you like to do today? \n Q - Quit \n A - Add Seats");
        String keyword = scan.next();
        
        if (keyword.equals("q") || keyword.equals("Q"))
        {
            System.out.println("Quiting program.");
        }
        
        else if (keyword.equals("add") || keyword.equals("A") || keyword.equals("a"))
        {
            System.out.println("What class would you like? First or Economy class. \n F - First \n E - Economy");
            String planeClass = scan.next();
            
            if (planeClass.equals("first") || planeClass.equals("First") || planeClass.equals("f") || planeClass.equals("F"))
            {
                A.setFirstClass();
                System.out.println("How many passengers are attending? 2 passenger max");
                int numOfPass = scan.nextInt();
                
                for(int i = 0; i < numOfPass; i++){
                    System.out.println("Would you like an 'Aisle' seat or 'Window' Seat? \n A - Aisle \n W - Window");
                    String seatPos = scan.next();

                    if (seatPos.equals("A") || seatPos.equals("a"))
                    {
                        A.addFirstAisleSeats();
                        A.viewSeats();
                    } 

                    else if (seatPos.equals("W") || seatPos.equals("w"))
                    {
                        A.addFirstWindowSeats();
                        A.viewSeats();
                    }
                }
                //EDIT SEATS
                System.out.println("Are you comfortable with this seat? Would you like to change it? \n E - Edit \n Q - Quit");
                String action = scan.next();

                if (action.equals("q") || action .equals("Q"))
                {
                    System.out.println("Thank You for your purchase! Good Bye!");
                }

                else if (action.equals("e") || action.equals("E"))
                {
                    System.out.println("What is your current row number?");
                    int oldRow = scan.nextInt();

                    System.out.println("Where is your current seat preference? \n Left: \t 1 - Window\t 2 - Aisle \t\t Right: \t 3 - Aisle\t 4 - Window");
                    int oldSeat = scan.nextInt();

                    System.out.println("Which seat would you like? (Please Enter Row number ONLY)");
                    int rowNumber = scan.nextInt();

                    System.out.println("Please enter new position if desired. \n Left: \t 1 - Window\t 2 - Aisle \t\t Right: \t 3 - Aisle\t 4 - Window");
                    int seating = scan.nextInt();

                    switch (seating){
                        case 1: A.editFirstSeats(oldRow -1, oldSeat -1, rowNumber -1, seating -1);
                        case 2: A.editFirstSeats(oldRow -1, oldSeat -1, rowNumber -1, seating -1);
                        case 3: A.editFirstSeats(oldRow -1, oldSeat -1, rowNumber -1, seating -1);
                        case 4: A.editFirstSeats(oldRow -1, oldSeat -1, rowNumber -1, seating -1);
                    }
                    A.viewSeats();
                }
            }
            //ECONOMY
            else if(planeClass.equals("economy") || planeClass.equals("Economy") || planeClass.equals("E") || planeClass.equals("e"))
            {
                A.setEcoClass();
                System.out.println("How many economy seats are you purchasing?");
                int numOfSeats = scan.nextInt();

                for (int i = 0; i < numOfSeats; i++){
                    System.out.println("Would you like an 'Aisle' seat. 'Center' seat, or 'Window' Seat? \n A - Aisle\n C - Center\n W - Window");
                    String seatPos = scan.next();

                    if (seatPos.equals("A") || seatPos.equals("a")){
                        A.addEcoAisleSeats();
                        A.viewSeats();
                    }
                    else if (seatPos.equals("W") || seatPos.equals("w"))
                    {
                        A.addEcoWindowSeats();
                        A.viewSeats();
                    }
                    else if (seatPos.equals("C") || seatPos.equals("c"))
                    {
                        A.addEcoCenterSeats();
                        A.viewSeats();
                    }
                }
                //EDIT SEATS
                System.out.println("Are you comfortable with this seat? Would you like to change it? \n E - Edit \n Q - Quit");
                String action = scan.next();

                if (action.equals("q") || action .equals("Q"))
                {
                    System.out.println("Thank You for your purchase! Good Bye!");
                }

                else if (action.equals("e") || action.equals("E"))
                {
                    System.out.println("What is your current row number?");
                    int oldRow = scan.nextInt();

                    System.out.println("Please enter new position if desired. \n Left: \t 1 - Window\t 2 - Center\t 3 - Aisle \t\t Right: \t 4 - Aisle\t 5 - Center\t 6 - Window");
                    int oldSeat = scan.nextInt();

                    System.out.println("Which seat would you like? (Please Enter Row number ONLY)");
                    int rowNumber = scan.nextInt();

                    System.out.println("Please enter new position if desired. \n Left: \t 1 - Window\t 2 - Center\t 3 - Aisle \t\t Right: \t 4 - Aisle\t 5 - Center\t 6 - Window");
                    int seating = scan.nextInt();

                    switch (seating){
                        case 1: A.editEcoSeats(oldRow -1, oldSeat -1, rowNumber -1, seating -1);
                        case 2: A.editEcoSeats(oldRow -1, oldSeat -1, rowNumber -1, seating -1);
                        case 3: A.editEcoSeats(oldRow -1, oldSeat -1, rowNumber -1, seating -1);
                        case 4: A.editEcoSeats(oldRow -1, oldSeat -1, rowNumber -1, seating -1);
                        case 5: A.editEcoSeats(oldRow -1, oldSeat -1, rowNumber -1, seating -1);
                        case 6: A.editEcoSeats(oldRow -1, oldSeat -1, rowNumber -1, seating -1);
                    }
                    A.viewSeats();    
                }
            }
        }  
        else
        {
            System.out.println("You did not type 'first' or 'economy' class. Quitting Program. Hope to see you again!");
        }
    }
}

