package pe.edu.cibertec.aplicacionprueba;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.edu.cibertec.aplicacionprueba.service.MensajeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = 
                new ClassPathXmlApplicationContext("classpath:/SpringXmlConfig.xml");
        MensajeService mserv = ctx.getBean(MensajeService.class);
        mserv.publicar("Prueba 1");
    }
}
