public class decimalToBinary {

    public static void main(String[] args) {
        //Decimal to binary in java////
        //First we initialize a String value//
        String binary ="";
        //Then initialize a decimal value that you want to convert binary
        int decimal = 16;
        //This is our while loop when decimal variable is 1 while loop
        //will break
        if(decimal == 1){
            binary="1";
        }
        else if (decimal ==0){
            binary ="0";
        }
        else if(decimal<0){
            System.out.println("This program converts only positive decimal values");
        }
        else{
        while(decimal!=1)
        {
            //First we find mod value of the decimal value
            int mod = decimal %2;
            //this step divides the decimal value by 2
            double z = decimal;
            z = z/2;
            int k = (int)z;
            decimal = k;
            //////////////////////////////////////////
            //convert the mod value to a String value
            String s=Integer.toString(mod);
            //Add the mod value to binary value
            binary = s+binary ;


            if(decimal==1){
                binary = "1" + binary ;
                break;
            }
        }
        }
        //By the way last variable(binary) is a String
        System.out.println(binary);
    }
}
