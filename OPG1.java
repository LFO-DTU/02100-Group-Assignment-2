public class OPG1 {
     
    public static void main(String[] args)
    {
        
        for(String input : args){
            
            int number = Integer.parseInt(input);
            if(number>=4000 || number<=0)
            {
                System.out.println("Number " + number + " is out of range 1-3999");
                break;
            }
        
            int index = 0;
            String[] numerals = {"M","CM","D","CD","C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            int[] values =  {1000,900,500,400,100, 90, 50, 40, 10, 9, 5, 4, 1};
            int compNum; 
            String result = "";
            System.out.println("The Roman numeral for " + number + " is:");
            do{
                compNum = values[index];
                while(number>=compNum)
                {
                    
                    result = result.concat(numerals[index]);
                    number -= compNum;
                   
                
                }
                index++;
            }while(number>0);
            
            System.out.println(result);
        
            System.out.println();
        }
    }
    
}
