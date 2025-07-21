package third_type_conversion;
public class Demo {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = num1; // Type Conversion
        System.out.println("Original Value: "+num1);
        System.out.println("Converted Value: "+num2);

        double num3 = 3.14;   
        int num4 = (int) num3 ; // Type mismatch: cannot convert from double to int 
        // you need to do manual conversion    
        System.out.println("Original Value: "+num3);
        System.out.println("Converted Value: "+num4);

        // Incompatible Conversions
        int zip = 500081;
        // String str_zip = (String)zip; //Cannot cast from int to String
        String str_zip = String.valueOf(zip);
        System.out.println("Original Value: "+zip);
        System.out.println("Converted Value: "+str_zip);
        System.out.println(str_zip+5); // Concat // String & int you cannot concat
        
        String str_zip_new = "500081";
        // String str_zip_new = "five lakh eighty one";
        int zip_new = Integer.parseInt(str_zip_new);
        System.out.println("Original Value: "+str_zip_new);
        System.out.println("Converted Value: "+zip_new);
        System.out.println(zip_new+5);

        // might not be possible
        int num6 = 100;
        // boolean boolValue = (boolean)num6;

    }
}
