package app;
import io.jooby.annotations.*;
import io.jooby.exception.*;

public class Soma{
    @Path ( "/soma/{b}/{m}")
    @GET 
    public String rotaDaSoma(@PathParam String b, @PathParam String m){
        try {
            // os números estão sendo passados para realizar a soma
            double s = Double.parseDouble(b) + Double.parseDouble(m);
            return String.format("%.1f", s);
        } 
        catch (NumberFormatException nfe) {
            // se o valor informado não for uma string, aparecerá uma mensagem informando paracolocar um parâmetro válido
     throw new BadRequestException(String.format(" É preciso informar um parâmetro válido"));
        }
        
    }

    public Integer so(String string) {
        return null;
    }
}