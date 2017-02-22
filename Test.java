import javax.print.DocFlavor.STRING;


public class Test {
public static void main(String[] args) {	
	Test.Merge("1110000000000000000000000000000000000000000","00000000000000000000000000000000000000");
	}

public static String Merge(String... rightValues) {
	int a=rightValues.length;
	String result=rightValues[0];
	
	for(int i=0;i<a;i++){
		result = String.valueOf(Test.one(result, rightValues[i]));		
	}
	//System.out.println(result);
	return result;
}
public static String one(String a,String b){
	
		String ac="";
		String bc="";
	     int a1=0;
	     int c=a.length()>b.length()?a.length():b.length();
	     System.out.println(c+"c");
	     String result = null;
		if(a.length()>b.length()){
			 a1=a.length()-b.length();
			for(int i=1;i<=a1;i++){
				b="0"+b;
			}	
		}else{
			a1=b.length()-a.length();
			for(int i=1;i<=a1;i++){
				a="0"+a;
			}
		}
		System.out.println(a+"jjj"+b);
		for (int j=0;j<c;j++){
            //两条数据依次比较
            String aa=a.substring(j,j+1);
            String bb=b.substring(j,j+1);
            if (!aa.equals(bb)){
                //比对出结果
            	a=a.substring(0,j)+"1"+a.substring(j+1);          	
            }else if((bb.equals(0))&&(aa.equals(0))){
            	a=a.substring(0,j)+"0"+a.substring(j+1);
            }
        	
        }
	//返回结果
	return a;
}

}