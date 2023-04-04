public class TestNestedTry {
    public static void main(String[] args) {

//        outer try
        try{
            try{
                int x = 10/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                int[] arr = new int[3];
                arr[3] = 2;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            try{
                String name = "monu";
                int b = Integer.parseInt(name);
            }
            catch(NumberFormatException e){
                System.out.println(e);
            }
            String read = null;
            System.out.println(read.length());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
