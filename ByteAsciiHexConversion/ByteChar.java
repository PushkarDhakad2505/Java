
package ByteAsciiHexConversion;


class Conversion{
    
    public void byteTOchar(byte ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.println((char)ar[i]); 
        }       
    }
}
public class ByteChar {

    public static void main(String args[]){
        Conversion c=new Conversion();
        byte []ar={97,98};

        c.byteTOchar(ar);
    }
}
