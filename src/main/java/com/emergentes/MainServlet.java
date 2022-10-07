package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MainServlet", urlPatterns = {"/MainServlet"})
public class MainServlet extends HttpServlet {



   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        //tipo de documento a devolver
        response.setContentType("text/html;charset=UTF-8");
        //obtener un canal de salida para el texto
        PrintWriter salida =  response.getWriter();
        salida.println("<!DOCTYPE html>");
        salida.println("<html>");
        salida.println("<title>Primer Servlet</title>");  
        salida.println("</head>");
        salida.println("<body>");
        salida.println("<h1>HOLA "+nombre+" A JAVA</h1>");
        salida.println("</body>");
        salida.println("</html>");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
