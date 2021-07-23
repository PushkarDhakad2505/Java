
package ByteAsciiHexConversion;

class Conversion{
    public StringBuilder hex = new StringBuilder();
    public void asciiTOhex(String s){
        char []ar=s.toCharArray();
        for(int i=0;i<ar.length;i++){
                int x=(int)ar[i];
                System.out.println(x+" "+Integer.toHexString(x));
                hex.append(Integer.toHexString(x));
                
            
            }System.out.println(hex);
             
        }
    
    public StringBuilder asciiStr = new StringBuilder();
    public void hexTOascii(String s){
    
        
        for(int i=0;i<s.length();i=i+2)
        {
            String sub=s.substring(i, i+2);
            asciiStr.append(Integer.parseInt(sub, 16)+" "+(char)Integer.parseInt(sub, 16)+" ");
            
            
        }
    System.out.println(asciiStr);
    
    }
    
    
    
    
}
public class AsciiHex {
    public static void main(String []args){
        Conversion c=new Conversion();
        c.asciiTOhex("abcd");
       c.hexTOascii("2154ae");
    
    }
    
}
