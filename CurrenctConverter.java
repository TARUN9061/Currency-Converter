import java.util.*;
import java.text.DecimalFormat;
public class CurrenctConverter {
    public static void main(String[] args) {
        double rupee,doller,pound,euro,kwd;
        DecimalFormat f=new DecimalFormat("##.###");
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter currency code:");
        int code=obj.nextInt();

        if(code==1){
            System.out.println("Enter amount in rupees: ");
            rupee=obj.nextDouble();
            doller=rupee/77.34;
            System.out.println("Doller: "+f.format(doller));
            pound=rupee/94.46;
            System.out.println("Pound: "+f.format(pound));
            euro=rupee/80.36;
            System.out.println("Euro :"+f.format(euro));
            kwd=rupee/251.92;
            System.out.println("Kuwaiti :"+f.format(kwd));
        }else if(code==2){
            System.out.println("Enter amount in doller: ");
            doller=obj.nextDouble();
            rupee=doller*77.34;
            System.out.println("Rupees: "+f.format(rupee));
            pound=doller*0.82;
            System.out.println("Pound: "+f.format(pound));
            euro=doller*0.96;
            System.out.println("Euro :"+f.format(euro));
            kwd=doller*0.31;
            System.out.println("Kuwaiti :"+f.format(kwd));
        }else if(code==3){
            System.out.println("Enter amount in pounds: ");
            pound=obj.nextDouble();
            rupee=pound*94.43;
            System.out.println("Rupees: "+f.format(rupee));
            doller=pound*1.22;
            System.out.println("Doller: "+f.format(doller));
            euro=pound*1.17;
            System.out.println("Euro :"+f.format(euro));
            kwd=pound*0.374;
            System.out.println("Kuwaiti :"+f.format(kwd));
        }else if(code==4){
            System.out.println("Enter amount in euro: ");
            euro=obj.nextDouble();
            rupee=euro*80.43;
            System.out.println("Rupees: "+f.format(rupee));
            doller=euro*1.04;
            System.out.println("Doller: "+f.format(doller));
            pound=euro*0.85;
            System.out.println("Pound :"+f.format(pound));
            kwd=euro*0.3189;
            System.out.println("Kuwaiti :"+f.format(kwd));
        }else if(code==5){
            System.out.println("Enter amount in Kuwaiti: ");
            kwd=obj.nextDouble();
            rupee=kwd*251.96;
            System.out.println("Rupees: "+f.format(rupee));
            doller=kwd*3.26;
            System.out.println("Doller: "+f.format(doller));
            pound=kwd*2.67;
            System.out.println("Pound :"+f.format(pound));
            euro=kwd*3.13;
            System.out.println(" Euro:"+f.format(euro));
        }else{
            System.out.println("Invalid code!!!");
        }
    }
    
}