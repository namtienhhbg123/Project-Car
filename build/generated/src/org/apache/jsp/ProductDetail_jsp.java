package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProductDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>BOOTIN</title>\n");
      out.write("    <script src=\"https://kit.fontawesome.com/d3fa3cecaa.js\"></script>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Mulish:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,200;1,300;1,400;1,500;1,600;1,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Merriweather:ital,wght@0,300;0,400;0,700;0,900;1,300;1,400;1,700;1,900&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"libs/bootstrapv4.5/css/bootstrap.css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"libs/bootstrapv4.5/js/bootstrap.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/product.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <section class=\"sectional header\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"#\"><img src=\"C:\\Users\\admin\\Desktop\\JAVA_WEB\\ON_Class\\NTAuto\\web\\img\\Breadcumd.jpg\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("                    <li><a href=\"#\" style=\"color: #f86d72;border-bottom: 1px solid #f86d72\">Home</a></li>\n");
      out.write("                    <li><a href=\"#\">Shop</a></li>\n");
      out.write("                    <li><a href=\"#\">Blog</a></li>\n");
      out.write("                    <li class=\"dropdows\">\n");
      out.write("                        <a href=\"#\">Categorys<i class=\"fas fa-chevron-down\" style=\"margin-left: 5px;font-size: 0.6em;\"></i></a>\n");
      out.write("                        <div class=\"dropdows-menu\">\n");
      out.write("                            <div class=\"dropdows-item\"><a href=\"#\">Calendars</a></div>\n");
      out.write("                            <div class=\"dropdows-item\"><a href=\"#\">Diary</a></div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"menu_seach\">\n");
      out.write("                    <li><a href=\"#\"><i class=\"fas fa-search\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"far fa-user-circle\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fas fa-shopping-bag\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <section class=\"sectional slide1\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"breadcrumbb\">\n");
      out.write("                    <img src=\"imgs/Breadcumd.jpg\"/>\n");
      out.write("                    <div class=\"breadcrumb_content\">\n");
      out.write("                        <h1>Product Details</h1>\n");
      out.write("                        <a href=\"#\">Home / </a>\n");
      out.write("                        <a href=\"#\"> Shop </a>\n");
      out.write("                        <span class=\"delimiter\">\n");
      out.write("                            / Name product\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <section class=\"sectional slide2\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"product-details\">\n");
      out.write("                    <div class=\"product_left\">\n");
      out.write("                        <img src=\"imgs/Image-14.jpg\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product_right\">\n");
      out.write("                        <div class=\"name_product\">\n");
      out.write("                            <h2>Delicious Place</h2>\n");
      out.write("                            <div class=\"star\">\n");
      out.write("                                <i>x x x x x</i>\n");
      out.write("                                <p>(2 customer reviews)</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"price\">$35.00</div>\n");
      out.write("                        </div>\n");
      out.write("                        <hr style=\"margin-top: 120px\">\n");
      out.write("                        <div class=\"check\">\n");
      out.write("                            <div class=\"check_icon\">\n");
      out.write("                                <i class=\"fas fa-check-circle\" style=\"margin-left: 1px;margin-top: 1px\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <span>In Stock</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"description\">\n");
      out.write("                            <p>Phasellus sed volutpat orci. Fusce eget lore mauris vehicula elementum gravida nec dui. Aenean aliquam varius ipsum, non ultricies tellus sodales eu. Donec dignissim viverra nunc, ut aliquet magna posuere eget.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"add-to-cart\">\n");
      out.write("                            <a href=\"#\">ADD TO CART</a>\n");
      out.write("                            <a href=\"#\" style=\"padding: 15px\"><i class=\"far fa-heart\" style=\"font-size: 1.3em;margin-top: 3px\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                        <hr style=\"margin-top: 35px\">\n");
      out.write("                        <div class=\"product-meta\">\n");
      out.write("                            <h4>Designer: <a href=\"#\">Duong Ngt</a></h4>\n");
      out.write("                            <h4>Size: <a href=\"#\">30x30x30x30</a></h4>\n");
      out.write("                            <h4>Category: <a href=\"#\">Calendar</a></h4>\n");
      out.write("                            <h4>Share:\n");
      out.write("                                <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fab fa-google-plus-g\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fab fa-invision\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                            </h4>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"related-products\">\n");
      out.write("                    <h2 style=\"\">Related Products</h2>\n");
      out.write("                    <div style=\"margin-bottom: 20px\" class=\"h2_gach\"></div>\n");
      out.write("                    <div class=\"col-xl-3 new_product\">\n");
      out.write("                        <div class=\"img_product\">\n");
      out.write("                            <img src=\"imgs/Image-27.jpg\" class=\"image_1\"/>\n");
      out.write("                            <div class=\"product_hover\">\n");
      out.write("                                <img src=\"imgs/Image-14.jpg\" class=\"image\"/>\n");
      out.write("                                <div class=\"product_hover_a\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fas fa-cart-arrow-down a\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fas fa-search a\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"far fa-heart a\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"#\">Delicious Place</a>\n");
      out.write("                        <h3><i>by</i> <a href=\"#\"> Coco Simon</a></h3>\n");
      out.write("                        <p>$35.00</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-3 new_product\">\n");
      out.write("                        <div class=\"img_product\">\n");
      out.write("                            <img src=\"imgs/Image-27.jpg\" class=\"image_1\"/>\n");
      out.write("                            <div class=\"product_hover\">\n");
      out.write("                                <img src=\"imgs/Image-14.jpg\" class=\"image\"/>\n");
      out.write("                                <div class=\"product_hover_a\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fas fa-cart-arrow-down a\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fas fa-search a\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"far fa-heart a\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"#\">Delicious Place</a>\n");
      out.write("                        <h3><i>by</i> <a href=\"#\"> Coco Simon</a></h3>\n");
      out.write("                        <p>$35.00</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-3 new_product\">\n");
      out.write("                        <div class=\"img_product\">\n");
      out.write("                            <img src=\"imgs/Image-27.jpg\" class=\"image_1\"/>\n");
      out.write("                            <div class=\"product_hover\">\n");
      out.write("                                <img src=\"imgs/Image-14.jpg\" class=\"image\"/>\n");
      out.write("                                <div class=\"product_hover_a\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fas fa-cart-arrow-down a\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fas fa-search a\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"far fa-heart a\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"#\">Delicious Place</a>\n");
      out.write("                        <h3><i>by</i> <a href=\"#\"> Coco Simon</a></h3>\n");
      out.write("                        <p>$35.00</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-3 new_product\">\n");
      out.write("                        <div class=\"img_product\">\n");
      out.write("                            <img src=\"imgs/Image-27.jpg\" class=\"image_1\"/>\n");
      out.write("                            <div class=\"product_hover\">\n");
      out.write("                                <img src=\"imgs/Image-14.jpg\" class=\"image\"/>\n");
      out.write("                                <div class=\"product_hover_a\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fas fa-cart-arrow-down a\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fas fa-search a\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"far fa-heart a\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"#\">Delicious Place</a>\n");
      out.write("                        <h3><i>by</i> <a href=\"#\"> Coco Simon</a></h3>\n");
      out.write("                        <p>$35.00</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"reviews\">\n");
      out.write("                    <h2 style=\"\">Reviews</h2>\n");
      out.write("                    <div style=\"margin-bottom: 20px\" class=\"h2_gach\"></div>\n");
      out.write("                    <div class=\"review-item\">\n");
      out.write("                        <div class=\"avartar\">\n");
      out.write("                            <i class=\"far fa-user\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"comment\">\n");
      out.write("                            <div class=\"time_star\">\n");
      out.write("                                <h3 class=\"user\">D??ng Ng-<p class=\"time\">October 4, 2018</p></h3>\n");
      out.write("                                <div class=\"box-star\"><div class=\"star\"></div></div>\n");
      out.write("                            </div>\n");
      out.write("                            <p>Mauris cursus arcu neque, nec bibendum lorem convallis vel. Nulla ac tincidunt est.\n");
      out.write("                                Praesent sodales nisi diam. Etiam ullamcorper turpis erat,\n");
      out.write("                                eu malesuada turpis pulvinar sed.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
