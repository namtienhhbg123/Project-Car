package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Shop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Shop</title>\n");
      out.write("    <script src=\"https://kit.fontawesome.com/d3fa3cecaa.js\"></script>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Mulish:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,200;1,300;1,400;1,500;1,600;1,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Merriweather:ital,wght@0,300;0,400;0,700;0,900;1,300;1,400;1,700;1,900&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"libs/bootstrapv4.5/css/bootstrap.css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"libs/bootstrapv4.5/js/bootstrap.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/shop.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <section class=\"sectional header\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"#\"><img src=\"imgs/logo.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("                    <li><a href=\"#\" style=\"color: #f86d72;border-bottom: 1px solid #f86d72\">Home</a></li>\n");
      out.write("                    <li><a href=\"#\">Shop</a></li>\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("\n");
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
      out.write("                    \n");
      out.write("                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("     \n");
      out.write("                    <li><a href=\"#\"><i class=\"fas fa-shopping-bag\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <section class=\"sectional slide1\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"breadcrumbb\">\n");
      out.write("                    <img src=\"\"/>\n");
      out.write("                    <div class=\"breadcrumb_content\">\n");
      out.write("                        <h1>Shop</h1>\n");
      out.write("                        <a href=\"ShopControl\" onclick=\"removeSes()\">Home</a>\n");
      out.write("                        <span class=\"delimiter\">\n");
      out.write("                            / Shop\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <section class=\"sectional slide2\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xl-3 slide2_left\">\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <form name=\"search\" method=\"post\" action=\"SearchControl\">\n");
      out.write("                            ");
 HttpSession ses = request.getSession(); 
      out.write("\n");
      out.write("                            <select id=\"se\" name=\"theloai\">\n");
      out.write("                                <option value=\"loaixe\">Type</option>\n");
      out.write("                                <option value=\"ProductName\">Product Name</option>\n");
      out.write("                                <option value=\"namsanxuat\">Year</option>\n");
      out.write("                                <option value=\"xuatxu\">Country of car</option>\n");
      out.write("                                <option value=\"mausac\">Color</option>\n");
      out.write("                                <option value=\"UnitsPrice <\">Price (<)</option>\n");
      out.write("                                <option value=\"UnitsPrice >\">Price (>)</option>\n");
      out.write("                            </select>   \n");
      out.write("                            \n");
      out.write("                            <input type=\"text\" class=\"form-control input_search\" placeholder=\"Search...\" aria-label=\"Recipient's username\" aria-describedby=\"button-addon2\" name=\"txtSearch\" \n");
      out.write("                                   value=\"");
      out.print((String)ses.getAttribute("txtSearch"));
      out.write("\">\n");
      out.write("                            <div class=\"input-group-append\" style=\"width: 20%;\">\n");
      out.write("                                <button class=\"btn btn-outline-secondary button_search\" type=\"submit\" id=\"button-addon2\" onclick=\"m()\"><i class=\"fas fa-search\"></i></button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"input-group mb-3\">\n");
      out.write("                        <!--              sap xep-->\n");
      out.write("                        <form action=\"OrderByControl\" method=\"get\">\n");
      out.write("                            <div id =\"sort\" class=\"input-group input-group-lg\">\n");
      out.write("                                <span class=\"input-group-text\" id=\"inputGroup-sizing-lg\">Sort by</span>\n");
      out.write("                                <select id=\"listSapXep\" name=\"orderby\" style=\"width: 70%\">\n");
      out.write("                                    <option value=\"ProductName\">Product Name</option>\n");
      out.write("                                    <option value=\"namsanxuat\">Year</option>\n");
      out.write("                                    <option value=\"UnitsPrice\">Prices range from cheap to expensive</option>\n");
      out.write("                                    <option value=\"UnitsPrice desc\">Prices range from expensive to cheap</option>\n");
      out.write("                                </select> \n");
      out.write("                                <button type=\"submit\" class=\"btn btn-success\" onclick=\"orderBy()\">Sort</button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"categories\">\n");
      out.write("                        <h2 style=\"font-size: 16px;border-bottom:1px solid rgba(248,109,114,.25);\">Categories</h2>\n");
      out.write("                        <div style=\"margin-bottom: 30px\" class=\"h2_gach\"></div>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Business </a>(3)</li>\n");
      out.write("                            <li><a href=\"#\">Business </a>(3)</li>\n");
      out.write("                            <li><a href=\"#\">Business </a>(3)</li>\n");
      out.write("                            <li><a href=\"#\">Business </a>(3)</li>\n");
      out.write("                            <li><a href=\"#\">Business </a>(3)</li>\n");
      out.write("                            <li><a href=\"#\">Business </a>(3)</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"price\">\n");
      out.write("                        <h2 style=\"font-size: 16px;border-bottom:1px solid rgba(248,109,114,.25);\">Price</h2>\n");
      out.write("                        <div style=\"margin-bottom: 30px\" class=\"h2_gach\"></div>\n");
      out.write("                        <input type=\"number\" name=\"years\" placeholder=\"Min\"/>\n");
      out.write("                        <span>-</span>\n");
      out.write("                        <input type=\"number\" name=\"years\" placeholder=\"Max\"/>\n");
      out.write("                        <button class=\"btn btn-outline-secondary button_search\" type=\"button\"><i class=\"fas fa-search\"></i></button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"designer\">\n");
      out.write("                        <h2 style=\"font-size: 16px;border-bottom:1px solid rgba(248,109,114,.25);\">Designer</h2>\n");
      out.write("                        <div style=\"margin-bottom: 30px\" class=\"h2_gach\"></div>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Anna Hillton </a>(3)</li>\n");
      out.write("                            <li><a href=\"#\">Business </a>(3)</li>\n");
      out.write("                            <li><a href=\"#\">Business </a>(3)</li>\n");
      out.write("                            <li><a href=\"#\">Business </a>(3)</li>\n");
      out.write("                            <li><a href=\"#\">Business </a>(3)</li>\n");
      out.write("                            <li><a href=\"#\">Business </a>(3)</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sale\">\n");
      out.write("                        <img src=\"imgs/Image-1-2.jpg\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tags\">\n");
      out.write("                        <h2 style=\"font-size: 16px;border-bottom:1px solid rgba(248,109,114,.25);\">Tags</h2>\n");
      out.write("                        <div style=\"margin-bottom: 30px\" class=\"h2_gach\"></div>\n");
      out.write("                        <button class=\"btn btn-outline-secondary button_tags\" type=\"button\">classic</button>\n");
      out.write("                        <button class=\"btn btn-outline-secondary button_tags\" type=\"button\">kids</button>\n");
      out.write("                        <button class=\"btn btn-outline-secondary button_tags\" type=\"button\">classic</button>\n");
      out.write("                        <button class=\"btn btn-outline-secondary button_tags\" type=\"button\">classic</button>\n");
      out.write("                        <button class=\"btn btn-outline-secondary button_tags\" type=\"button\">classic</button>\n");
      out.write("                        <button class=\"btn btn-outline-secondary button_tags\" type=\"button\">kids</button>\n");
      out.write("                        <button class=\"btn btn-outline-secondary button_tags\" type=\"button\">classic</button>\n");
      out.write("                        <button class=\"btn btn-outline-secondary button_tags\" type=\"button\">classic</button>\n");
      out.write("                        <button class=\"btn btn-outline-secondary button_tags\" type=\"button\">classic</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xl-9 slide2_right\">\n");
      out.write("<!--                    san pham-->\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <section class=\"sectional slide7\">\n");
      out.write("        <div class=\"container-fluid\" style=\"padding: 0 80px\">\n");
      out.write("            <div class=\"col-xl-3 slide7_content\">\n");
      out.write("                <div class=\"new_arrivals h2\">\n");
      out.write("                    <h2 style=\"font-size: 16px;\">Contact Us</h2>\n");
      out.write("                    <div style=\"margin-bottom: 20px\" class=\"h2_gach\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide7-content\">\n");
      out.write("                    <i class=\"fas fa-map-marker-alt\"></i>\n");
      out.write("                    <p>1998 Wall Street 707, Washington DC, USA</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide7-content\">\n");
      out.write("                    <i class=\"far fa-envelope\"></i>\n");
      out.write("                    <p>    bookmart@domain.com<br/>\n");
      out.write("                        support@gmail.com</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide7-content\">\n");
      out.write("                    <i class=\"fas fa-mobile-alt\"></i>\n");
      out.write("                    <p>    ( 84) 0123 456 789<br/>\n");
      out.write("                        ( 84) 00123 456 789</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 slide7_content\">\n");
      out.write("                <div class=\"new_arrivals h2\">\n");
      out.write("                    <h2 style=\"font-size: 16px;\">Information</h2>\n");
      out.write("                    <div style=\"margin-bottom: 20px\" class=\"h2_gach\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide7-content\" style=\"margin-bottom: 15px\">\n");
      out.write("                    <a href=\"#\">Contact Us</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide7-content\" style=\"margin-bottom: 15px\">\n");
      out.write("                    <a href=\"#\">Site Map</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide7-content\" style=\"margin-bottom: 15px\">\n");
      out.write("                    <a href=\"#\">Privacy Policy</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide7-content\" style=\"margin-bottom: 15px\">\n");
      out.write("                    <a href=\"#\">About Us</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide7-content\" style=\"margin-bottom: 15px\">\n");
      out.write("                    <a href=\"#\">Costumer Service</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 slide7_content\">\n");
      out.write("                <div class=\"new_arrivals h2\">\n");
      out.write("                    <h2 style=\"font-size: 16px;\">My Account</h2>\n");
      out.write("                    <div style=\"margin-bottom: 20px\" class=\"h2_gach\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide7-content\" style=\"margin-bottom: 15px\">\n");
      out.write("                    <a href=\"#\">Sign In</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide7-content\" style=\"margin-bottom: 15px\">\n");
      out.write("                    <a href=\"#\">View Cart</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide7-content\" style=\"margin-bottom: 15px\">\n");
      out.write("                    <a href=\"#\">My Wishtlist</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide7-content\" style=\"margin-bottom: 15px\">\n");
      out.write("                    <a href=\"#\">Track My Order</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide7-content\" style=\"margin-bottom: 15px\">\n");
      out.write("                    <a href=\"#\">Help</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 slide7_content\">\n");
      out.write("                <div class=\"new_arrivals h2\">\n");
      out.write("                    <h2 style=\"font-size: 16px;\">Instagram</h2>\n");
      out.write("                    <div style=\"margin-bottom: 20px\" class=\"h2_gach\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide7_contact\">\n");
      out.write("                    <img src=\"imgs/Image-1-720x484.jpg\"/>\n");
      out.write("                    <img src=\"imgs/Image-1-720x484.jpg\"/>\n");
      out.write("                    <img src=\"imgs/Image-1-720x484.jpg\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"time\">\n");
      out.write("                    7 Days A Week From 8.00 Am To 5 Pm\n");
      out.write("                </div>\n");
      out.write("                <div class=\"contact\">\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-google-plus-g\"></i></a>\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-invision\"></i></a>\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("</body>\n");
      out.write("    <script>\n");
      out.write("//        l?u gúa tr? khi ch?n th? lo?i tìm ki?m\n");
      out.write("        function  m(){\n");
      out.write("          var selecteTypeCar = document.getElementById('se').value;\n");
      out.write("          // Kh?i t?o sesionStorage\n");
      out.write("          sessionStorage.setItem('select', selecteTypeCar);  \n");
      out.write("        }\n");
      out.write("        function removeSes(){\n");
      out.write("//            xóa h?t các sessionStorange \n");
      out.write("           sessionStorage.clear();\n");
      out.write("        }\n");
      out.write("//        l?y giá tr? ch?n c?a dánh sách s?p x?p\n");
      out.write("        function orderBy(){\n");
      out.write("//            l?y ra giá tr? c?a cái mình ch?n\n");
      out.write("          var selecteOrder = document.getElementById('listSapXep').value;\n");
      out.write("          // Kh?i t?o sesionStorage\n");
      out.write("          sessionStorage.setItem('orderby', selecteOrder); \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        if(sessionStorage.getItem('select')==null && sessionStorage.getItem('orderby')==null){          \n");
      out.write("           document.getElementById('se').value = 'loaixe';\n");
      out.write("           document.getElementById('listSapXep').value = 'ProductName';\n");
      out.write("//        cho nó select\n");
      out.write("           document.getElementById('listSapXep').selected;\n");
      out.write("           document.getElementById('se').selected;\n");
      out.write("        }\n");
      out.write("        else{\n");
      out.write("//        l?y giá tr? c?a sessioon ra\n");
      out.write("            var itemSearch = sessionStorage.getItem('select');\n");
      out.write("            var itemOrder = sessionStorage.getItem('orderby');\n");
      out.write("            document.getElementById('se').value = itemSearch;\n");
      out.write("            document.getElementById('listSapXep').value = itemOrder;\n");
      out.write("//        cho nó select\n");
      out.write("            document.getElementById('se').selected;\n");
      out.write("            document.getElementById('listSapXep').selected;\n");
      out.write("        }\n");
      out.write("  </script>  \n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ac != null && sessionScope.ac.isAdmin==true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li>\n");
        out.write("                            <a href=\"#\">Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ac.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>                                   \n");
        out.write("                        </li>\n");
        out.write("                        <li>\n");
        out.write("                            <a href=\"ManagerAllProductControl\">Manager</a>                       \n");
        out.write("                        </li>\n");
        out.write("                        <li>  \n");
        out.write("                            <a href=\"LogoutControl\"> <p>Logout</p></a>                       \n");
        out.write("                        </li>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ac != null&& sessionScope.ac.isAdmin==false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li>\n");
        out.write("                            <a href=\"#\">Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ac.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>                                   \n");
        out.write("                        </li>\n");
        out.write("                        <li>  \n");
        out.write("                            <a href=\"LogoutControl\"> <p>Logout</p></a>                       \n");
        out.write("                        </li>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ac == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <li><a href=\"Login.jsp\"><i class=\"far fa-user-circle\"></i></a></li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"col-xl-4 new_product\">\n");
          out.write("                        <div class=\"img_product\">\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"image_1\"/>\n");
          out.write("                            <div class=\"product_hover\">\n");
          out.write("                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"image\"/>\n");
          out.write("                                <div class=\"product_hover_a\">\n");
          out.write("                                    <a href=\"#\"><i class=\"fas fa-cart-arrow-down a\"></i></a>\n");
          out.write("                                    <a href=\"#\"><i class=\"fas fa-search a\"></i></a>\n");
          out.write("                                    <a href=\"#\"><i class=\"far fa-heart a\"></i></a>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"contact_product\">\n");
          out.write("                            <a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                            <h3><i>by</i> <a href=\"#\"> Coco Simon</a></h3>\n");
          out.write("                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.unitPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
