/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APICalls;
import java.net.URI;
import java.net.http.*;

/**
 *
 * @author HP
 */
public class SettingConnections {
    
    public static void main(String args[]) {
        try{
            
            String url="https://covid19.mathdro.id/api";
            
            var req=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
            var client=HttpClient.newBuilder().build();
            var response=client.send(req,HttpResponse.BodyHandlers.ofString());
            
            System.out.println(response.statusCode());
            
            System.out.println(response.body());
            
            
            
            
        }
        catch(Exception e){
        System.out.println(e);
        
        
        }
    }
    
    
    
    
    
}
