import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.nio.charset.Charset;

public class Main extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.getWriter().print("PRUEBA 1 DE CLOUD COMPUTING (OPSTATIVA4)! Charset: " + Charset.defaultCharset());
  }
}
