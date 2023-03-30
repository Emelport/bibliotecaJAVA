
package com.funciones;
import com.login.biblio_funciones;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpRequest.BodyPublishers;

/**
 *
 * @author osman
 */
public class Api {
    
    private  String url_api = "http://localhost:5000";
    HttpClient client;
    public Api(){
        client = HttpClient.newHttpClient();
    }
    
    
//    ejemplo de ruta ===> ruta = /insertar_autor
//    ejemplo de json ===> String json = "{\"nombre\": \"" + autor_nombre + "\" }";

    public  void insertar(String json,String ruta){
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(this.url_api + ruta))
            .header("Content-Type", "application/json")
            .POST(BodyPublishers.ofString(json))
            .build();
        try {
            HttpResponse<String> response = this.client.send(request, BodyHandlers.ofString());
            biblio_funciones.mensaje(response.body(),"insertar" , 1);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }       
    }
    
    public void modificar(String json,String ruta){
         HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(this.url_api + ruta))
            .header("Content-Type", "application/json")
            .method("PUT",BodyPublishers.ofString(json))
            .build();
        try {
            HttpResponse<String> response = this.client.send(request, BodyHandlers.ofString());
            biblio_funciones.mensaje(response.body(),"modificado" , 1);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }       
    }
    
}
