class Solution {
 public int Calc(int i, String[] arr) {
        int a = 0;

        if(arr[i].equals("10")||arr[i].equals("X")){
            a = 10;
        }else if(arr[i].equals("1")||arr[i].equals("I")){
                    a = 1;
                }else if(arr[i].equals("2")||arr[i].equals("II")){
                    a = 2;
                }else if(arr[i].equals("3")||arr[i].equals("III")){
                    a = 3;
                }else if(arr[i].equals("4")||arr[i].equals("IV")){
                    a = 4;
                }else if(arr[i].equals("5")||arr[i].equals("V")){
                    a = 5;
                }else if(arr[i].equals("6")||arr[i].equals("VI")){
                    a = 6;
                }else if(arr[i].equals("7")||arr[i].equals("VII")){
                    a = 7;
                }else if(arr[i].equals("8")||arr[i].equals("VIII")){
                    a = 8;
                }else if(arr[i].equals("9")||arr[i].equals("IX")){
                    a = 9;
                }

        return a;
    }

    public int count(String a, int b, int c){
        int rez = 0;
        if(a.contains("+")){
            rez = b+c;
        }if(a.contains("-")){
            rez = b-c;
        }if(a.contains("*")){
            rez = b*c;
        }if(a.contains("/")){
            rez = b/c;
        }
        return rez;
    }

}
