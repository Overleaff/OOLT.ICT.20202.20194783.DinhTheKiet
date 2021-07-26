public class equation1 {

    public int a = 1, b = 1;
    public void resolve (){
			if (( a == 0) && ( b == 0 )) System.out.print("infiinite solutions");
			if (( a == 0) && ( b != 0 )) System.out.println("no solutions");
			if (( a != 0) && ( b != 0 )) System.out.println(" x=" + (float)(-b/a));
    }

    public static void main(String[] Strings) {
      equation1 eq = new equation1();
      eq.resolve();
    }

}