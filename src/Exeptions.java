
public class Exeptions {
    public void exeption1(String a) {
        if ((a.contains("1") || a.contains("2") || a.contains("3") || a.contains("4") || a.contains("5") || a.contains("6") || a.contains("7") || a.contains("8") || a.contains("9")) && ((a.contains("X") || a.contains("I") || a.contains("V")))){
            System.out.println("throws Exeptions");
          System.exit(0);
        }
    }
  	
  	public String exeption2(String a, int d){
      
        if(d == 10){
		a = "X";
        }else if(d == 1){
		a = "I";
		}else if(d == 2){
		a = "II";
        }else if(d == 3){
		a = "III";
        }else if(d == 4){
		a = "IV";
        }else if(d == 5){
		a = "V";
        }else if(d == 6){
		a = "VI";
        }else if(d == 7){
		a = "VII";
        }else if(d == 8){
		a = "VIII";
        }else if(d == 9){
		a = "IX";
        }else{
          a="throws Exeptions";
        }

    return a;
    }
}

