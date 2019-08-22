package web2.ejemplo1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import web2.ejemplo1.model.Persona;

/**
 *
 * @author rmpalacio
 */
@WebServlet("")
public class InicioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Persona yo = new Persona();
        
        yo.setApellido("PENTUCCI");
        yo.setNombre("MARTIN");
        yo.setEdad(38);
        yo.setNumeroDocumento(284842214);

        req.setAttribute("persona", yo);
        req.getRequestDispatcher("/secciones/inicio.jsp").forward(req, resp);
    }

}
