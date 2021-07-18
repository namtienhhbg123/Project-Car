/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "AddProductControl", urlPatterns = {"/AddProductControl"})
public class AddProductControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DAO d = new DAO();
        String productName = request.getParameter("productname");
        int categoryID =Integer.parseInt(request.getParameter("categoryid"));
        int unitsInStock = Integer.parseInt(request.getParameter("unitsinstock"));
        int unitsOnOrder =Integer.parseInt(request.getParameter("unitsonorder"));
        float unitsPrice =Float.parseFloat(request.getParameter("unitsprice"));
        
        String img1 = request.getParameter("img1");
        String img2 = request.getParameter("img2");
        String img3 = request.getParameter("img3");
        String img4 = request.getParameter("img4");
        d.addNewProduct(productName, categoryID, unitsInStock, unitsOnOrder, unitsPrice, img1);
        int productID = d.getIDProduct(productName, img1);
        String yearOfMan = request.getParameter("namsanxuat");
        String hopso = request.getParameter("hopso");
        int hso = 0;
        if(hopso.equalsIgnoreCase("Automatic")){
            hso = 1;
        }else{
            hso = 0;
        }
        String tinhtrang = request.getParameter("tinhtrang");
        int ttrang =0 ;
        if(hopso.equalsIgnoreCase("new")){
           ttrang = 1;
        }else{
            ttrang = 0;
        }
        String xuatxu = request.getParameter("xuatxu");
        String color = request.getParameter("color");
        String nhienlieu = request.getParameter("nhienlieu");
        int soghe =Integer.parseInt(request.getParameter("soghe"));
        d.addNewProductDesctiption(productID, img1, img2, img3, img4,null,null, yearOfMan,hso ,ttrang, xuatxu, color, nhienlieu, soghe);
        response.sendRedirect("ManagerAllProductControl");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
