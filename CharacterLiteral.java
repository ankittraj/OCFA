public class CharacterLiteral {
    public static void main(String[] args) {
        char a='h';  //Character Lietral
        //char a='hi';  //error
        //char a="h";  //error
        char b='@';  //Character Lietral
        char c='+';  //Character Lietral
        char d='4';  //Character Lietral
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        char x=104; //ASCII Code Range[0-255]
        char y='\u0068'; //UNI Code Range[0-65535]
        System.out.println(x);
        System.out.println(y);
    }
}