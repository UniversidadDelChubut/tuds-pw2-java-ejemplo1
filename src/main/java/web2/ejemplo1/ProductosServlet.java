package web2.ejemplo1;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rmpalacio
 */
@WebServlet("/productos")
public class ProductosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Map> productos = Productos.obtenerTodos();

        String resultado = "producto;precio\n";
        
        for (Map item : productos) {
            resultado += String.format("%s;%s\n", item.get("nombre"), item.get("precio"));
        }

        resp.setContentType("text/plain; charset=utf8");
        resp.setHeader("Content-disposition", "attachment; filename=archivo.txt");
        resp.getWriter().write(resultado);

    }

}
