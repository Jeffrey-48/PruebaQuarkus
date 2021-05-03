package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-resteasy")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        return "Hello la lista es: " + '\n' + numeros();
    }

    /**
     * Metodo que retorna 100 numeros fila por fila con tres tipos de condiciones
     *  Condicion 1: Si un numero es multiplo de tres este se remplaza por la palabra "Tres"
     *  Condicion 2: Si un numero es multiplo de cinco este se remplaza por la palabra "Cinco"
     *  Condicion 3: Si un numero es multiplo de tres y de cinco este se remplaza por la palabra "TresCinco"
     * @return
     * @return
     */
    public String numeros(){
        String numeros="";
        int i = 1;
        for (i = 1; i<=100;i++){
            if (i%3==0&&i%5==0){
                numeros+="TresCinco"+"\n";
            }else if (i%3==0){
                numeros+="Tres"+"\n";
            }else if(i%5==0){
                numeros+="Cinco"+"\n";
            }else {
                numeros += i +"\n";
            }
        }
        return numeros;
    }
}