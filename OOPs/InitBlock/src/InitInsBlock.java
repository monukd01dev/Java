public class InitInsBlock {
    int x;//instance variable
    {
        x=12;
        System.out.println(x);
        x++;
    }
    InitInsBlock(){
        System.out.println("Constructor output");
    }
    {
        System.out.println(x);
    }
    InitInsBlock(int x){
        System.out.println("Final constructor : "+ x );
    }

    public static void main(String[] args) {
        new InitInsBlock();
        new InitInsBlock(14);

    }
}
