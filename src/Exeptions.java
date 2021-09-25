public class Exeptions {
    public void exeption1(String a) {
        if ((a.contains("1") || a.contains("2") || a.contains("3") || a.contains("4") || a.contains("5") || a.contains("6") || a.contains("7") || a.contains("8") || a.contains("9")) && ((a.contains("X") || a.contains("I") || a.contains("V")))){
            System.out.println("throws Exeptions");
            System.exit(0);
        }
    }

    public String exeption2(int d){
        String a = "";
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
        }else if(d == 20){
            a = "XX";
        }else if(d == 30){
            a = "XXX";
        }else if(d == 40){
            a = "XL";
        }else if(d == 50){
            a = "L";
        }else if(d == 60){
            a = "LX";
        }else if(d == 70){
            a = "LXX";
        }else if(d == 80){
            a = "LXXX";
        }else if(d == 90){
            a = "XC";
        }else if(d == 100){
            a = "C";
        }else{
            a="throws Exeptions";
        }

        return a;
    }

    public String exeption3( int d){
        String a = "";

        if((d>10)&&(d<20)){
            d = d - 10;
            a = "X" + exeption2(d);
        }else if((d>20)&&(d<30)){
            d = d - 20;
            a = "XX" + exeption2(d);
        }else if((d>30)&&(d<40)){
            d = d - 30;
            a = "XXX" + exeption2(d);
        }else if((d>40)&&(d<50)){
            d = d - 40;
            a = "XL" + exeption2(d);
        }else if((d>50)&&(d<60)){
            d = d - 50;
            a = "L" + exeption2(d);
        }else if((d>60)&&(d<70)){
            d = d - 60;
            a = "LX" + exeption2(d);
        }else if((d>70)&&(d<80)){
            d = d - 70;
            a = "LXX" + exeption2(d);
        }else if((d>80)&&(d<90)){
            d = d - 80;
            a = "LXXX" + exeption2(d);
        }else if((d>90)&&(d<100)){
            d = d - 90;
            a = "XC" + exeption2(d);
        }else
            a = exeption2(d);

        return a;
    }
}
