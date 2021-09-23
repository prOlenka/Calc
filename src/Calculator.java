import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Calculator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String[] arr = new String [2];

        if(a.contains("+")){
            arr = (a.split("\\+"));
        }if(a.contains("-")){
            arr = (a.split("-"));
        }if(a.contains("*")){
            arr = (a.split("\\*"));
        }if(a.contains("/")){
            arr = (a.split("/"));
        }

        Exeptions one = new Exeptions();
        one.exeption1(a);

        Solution solution = new Solution();
        int b = solution.Calc(0, arr);
        int c = solution.Calc(1, arr);

      	int d = solution.count(a, b, c);
      
      	if (a.contains("X") || a.contains("I") || a.contains("V")) {
        	System.out.println(one.exeption2(a, d));
        }if(d<0){
          System.out.println("throws Exeptions");
        }else
          System.out.println(d);
    }

}
