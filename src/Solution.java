class Solution {
    public int Calc(int i, String[] arr) {
        int a = 0;

        if(arr[i].contains("10")||arr[i].contains("X")){
            a = 10;
        }else if(arr[i].contains("1")||arr[i].contains("I")){
                    a = 1;
                }else if(arr[i].contains("2")||arr[i].contains("II")){
                    a = 2;
                }else if(arr[i].contains("3")||arr[i].contains("III")){
                    a = 3;
                }else if(arr[i].contains("4")||arr[i].contains("IV")){
                    a = 4;
                }else if(arr[i].contains("5")||arr[i].contains("V")){
                    a = 5;
                }else if(arr[i].contains("6")||arr[i].contains("VI")){
                    a = 6;
                }else if(arr[i].contains("7")||arr[i].contains("VII")){
                    a = 7;
                }else if(arr[i].contains("8")||arr[i].contains("VIII")){
                    a = 8;
                }else if(arr[i].contains("9")||arr[i].contains("IX")){
                    a = 9;
                }

        return a;
    }

    public int rezultat(String a, int b, int c){
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