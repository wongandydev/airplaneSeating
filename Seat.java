
public class Seat extends planeClass{
    
    char [][] first = new char [5][4]; //First Class 2D Array
    char [][] economy = new char [30][6]; //Economy Class 2D Array
    
    public Seat(){
    
    }
    
    public void addFirstWindowSeats(){
         int count = 0;
            for (int i = 0; i < first.length - 1; i++){ //Column
             for (int j = 0; j < first[i].length + 1; j++){//Row
                if (i == 0 || i == 4){ 
                    if (first[j][i] != 'X'){
                        if (count < 1){
                            first[j][i] = 'X';
                            count++;
                        }
                    }       
                }
            }     
        }
    } 
    public void addFirstAisleSeats(){
        int count = 0;
            for (int i = 0; i < first.length - 1; i++){ //Column
             for (int j = 0; j < first[i].length + 1; j++){//Row
                if (i == 1 || i == 2){ 
                    if (first[j][i] != 'X'){
                        if (count < 1){
                            first[j][i] = 'X';
                            count++;
                        }
                    }       
                }
            }     
        }
    }
    
    public void addEcoAisleSeats(){
         int count = 0;
            for (int i = 0; i < economy.length - 1; i++){ //Column
             for (int j = 0; j < economy[i].length + 1; j++){//Row
                if (i == 2 || i == 3){ 
                    if (economy[j][i] != 'X'){
                        if (count < 1){
                            economy[j][i] = 'X';
                            count++;
                        }
                    }       
                }
            }     
        }
    }
    
    public void addEcoCenterSeats(){
        int count = 0;
            for (int i = 0; i < economy.length - 1; i++){ //Column
             for (int j = 0; j < economy[i].length + 1; j++){//Row
                if (i == 1 || i == 4){ 
                    if (economy[j][i] != 'X'){
                        if (count < 1){
                            economy[j][i] = 'X';
                            count++;
                        }
                    }       
                }
            }     
        }
    }
    
            
    public void addEcoWindowSeats(){
        int count = 0;
            for (int i = 0; i < economy.length - 1; i++){ //Column
             for (int j = 0; j < economy[i].length + 1; j++){//Row
                if (i == 0 || i == 5){ 
                    if (economy[j][i] != 'X'){
                        if (count < 1){
                            economy[j][i] = 'X';
                            count++;
                        }
                    }       
                }
            }     
        }
    }
    
    public void setSeats(){
        for (int i = 0; i < first.length; i++){
            for(int g = 0; g < first[i].length; g++){
                first[i][g] = '-';
            }
        }
        
        for (int e = 0; e < economy.length; e++){
            for(int o = 0; o < economy[e].length; o++){
                economy[e][o] = '-';
            }
        }
    }
    
    public void editFirstSeats(int oldRow,int oldPos,int newRow, int newPos){
        if (first[newRow][newPos] == 'X'){
            first[oldRow][oldPos] = 'X';
            System.out.println("Error! Seat Taken! Transaction Cancelled. \n Seat has not been changed.");
        }
        else if(first[newRow][newPos] != 'X'){
            first[newRow][newPos] = 'X';
        }
        first[oldRow][oldPos] = '-';
    }
    
    public void editEcoSeats(int oldRow,int oldPos,int newRow, int newPos){
        if (economy[newRow][newPos] == 'X'){
            economy[oldRow][oldPos] = 'X';
            System.out.println("Error! Seat Taken! Transaction Cancelled. \n Seat has not been changed.");
        }
        else if(economy[newRow][newPos] != 'X'){
            economy[newRow][newPos] = 'X';
        }
        economy[oldRow][oldPos] = '-';
    }
    
    public void viewSeats(){

        System.out.println("First");
        System.out.print("\t");
        for (int i = 1; i <= 4; i++){
            
            if(i == 2 || i == 3){
                System.out.printf("\t%s\t", "Aisle");
            }
            else if (i == 1 || i == 4){
                System.out.printf("\t%s\t", "Window");
            }
        }
        System.out.println("");
        for (int f = 0; f < first.length ; f++){
            System.out.printf("%d",f + 1);
            System.out.print("\t");
            for(int g = 0; g < first[f].length; g++){
                System.out.print("\t"+ first[f][g] + "\t");
            }
            System.out.println("");
        }

        System.out.println("Economy");
        for (int e = 1; e <= 6; e++){
            if (e == 1 || e == 6){
                System.out.printf("\t%s\t", "Window");
            }
            else if(e == 2 || e == 5){
                System.out.printf("\t%s\t", "Center");
            }
            else if(e == 3 || e == 4){
                System.out.printf("\t%s\t", "Aisle");
            }
        }
        System.out.println("");
        for (int c = 0; c < economy.length; c++){
            System.out.printf("%d",c + 1);
            for(int o = 0; o < economy[c].length; o++){
                System.out.print("\t" + economy[c][o] + "\t");
            }
            System.out.println("");
        }
    }
}

