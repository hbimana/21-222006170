class compoun{//class name
    public  double calc(int p,int t,int r, int n){//declaration
        
    return (p*((1+((r/100)/n))^(n*t)));//formila to return answer
    }
}
class labriry{ //class object
    public static void main(String[] args) {//mandatory linew
        compoun mysimple=new compoun();//calling class
        double answer=mysimple.calc(500000,18,3,12);//entering values used for returning answers
        System.out.println("answer:" +answer);//clousing my project
    }
}




    
    

