package app;
import io.jooby.annotations.*;
import io.jooby.exception.*;
import io.jooby.exception.BadRequestException.*;


public class Soma{
    @Path("/soma/{op}/{ap}")
    @GET
    public String Soma (@PathParam String op, @PathParam String ap){
        // Converter op e ap para double (verificar erros)
        try{
            double sqrt = Math.sqrt (Double.parseDouble(op) + Double parseDouble(ap));
        // Retornar soma op+ap 
            return String.format("%s.2d",sqrt);
        }catch (NumberFormaException nfe){
            throw new BadRequestException(String.format("Inválido:\"%s\"",op, ap));
        }
       
    }
}