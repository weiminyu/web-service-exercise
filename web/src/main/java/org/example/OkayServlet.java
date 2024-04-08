package org.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OkayServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException {
    response.getOutputStream().println("Blah from Servlet-" +
        HttpServlet.class.getPackage().getSpecificationVersion() +
        " with " + OkayServlet.class);
  }
}
