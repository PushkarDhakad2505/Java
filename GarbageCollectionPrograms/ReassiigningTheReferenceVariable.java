
package GarbageCollectionPrograms;

public class ReassiigningTheReferenceVariable {
    
    
        
    public static void main(String[]args){
        ReassiigningTheReferenceVariable n1=new ReassiigningTheReferenceVariable();//this will be eligible for garbage collection
        ReassiigningTheReferenceVariable n2=new ReassiigningTheReferenceVariable();
        n1=new ReassiigningTheReferenceVariable();//reassigning the reference variable
        
    }   
}
 