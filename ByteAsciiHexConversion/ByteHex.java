
package ByteAsciiHexConversion;

class Conversion{
    
    public void byteTOhex(byte ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.println(String.format("%02X",ar[i] )); 
        }       
    }
    
//    public void hexTObyte(String s) throws Exception{
//        
//        byte []ar=new byte[s.length()/2];
//        if(s.length() %2==1){
//            throw new Exception("Enter in even characters") ;
//        }
//        for(int i=0;i<ar.length;i=i+2){
//            
//            String sub=s.substring(i, i+2);        
//            int firstDigit = Character.digit(c1,16);
//            //int firstDigi=toDigit(sub[0]);
//            int SecondDigi=Character.digit(sub[2],16);
//            
//        }    
//        int i=Integer.parseInt(s, 16);
//        System.out.println(i);
        
//    }
    
}
public class ByteHex {
    public static void main(String []args){
    

        Conversion c=new Conversion();
        //int []ar=new int[]{10,20};
         byte [] ar ={ 1,2,3,4,5,6,7,8,9,10,11,23,34}; 
        //c.byteTOhex(ar);
        
       // c.hexTObyte("1D08A");
        
        
    }
}
