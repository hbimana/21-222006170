class compoun{
    public  double calc(int i,int t,int r, int n){
        
    return (i*((1+((r/100)/n))^(n*t)));
    }
}
class labr{
    public static void main(String[] args) {
        compoun mycompoun=new compoun();
        double answer=mycompoun.calc(500000,18,3,12);
        System.out.println("answer:" +answer);
    }
}
 
    
}
