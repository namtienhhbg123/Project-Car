package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Auto111_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("      <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("<!--      <img href=\"https://travelcar.vn/images/logo/Lexus.png\">-->\n");
      out.write("      <title>NTAuto</title>   \n");
      out.write("      <link rel=\"shortcut icon\" href=\"https://i.vdoc.vn/data/image/2016/08/31/nhan-biet-bieu-tuong-logo-cua-cac-hang-xe-o-to-noi-tieng-the-gioi-10.jpg\" />\n");
      out.write("<!--\n");
      out.write("DREAM PULSE\n");
      out.write("https://templatemo.com/tm-536-dream-pulse\n");
      out.write("-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,600\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/all.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"slick/slick.css\"/>    \n");
      out.write("    <link rel=\"stylesheet\" href=\"slick/slick-theme.css\"/>    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/templatemo-dream-pulse.css\" />\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("    <style>\n");
      out.write("        .ball{\n");
      out.write("            border-radius: 10%;\n");
      out.write("        }\n");
      out.write("        .click{\n");
      out.write("            color: #FFF;\n");
      out.write("        }\n");
      out.write("        .click:hover{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #000;\n");
      out.write("        }\n");
      out.write("        .bestsell{\n");
      out.write("            margin-left: 20%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <main class=\"container-fluid\">\n");
      out.write("      <div class=\"row\">        \n");
      out.write("          <nav id=\"tmSidebar\" class=\"tm-bg-black-transparent tm-sidebar\">\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" aria-label=\"Toggle navigation\">\n");
      out.write("              <i class=\"fas fa-bars\"></i>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"tm-sidebar-sticky\">\n");
      out.write("              <div class=\"tm-brand-box\">\n");
      out.write("                <div class=\"tm-double-border-1 ball\">\n");
      out.write("                  <div class=\"tm-double-border-2 ball\">\n");
      out.write("                      <h1 class=\"tm-brand text-uppercase\">\n");
      out.write("<!--                          logo c?a trang web-->\n");
      out.write("            <a class=\"click\" href=\"Test\" onclick=\"removeSes()\">\n");
      out.write("                        <img src=\"https://image.freepik.com/free-vector/automotive_25327-95.jpg\" alt=\"\" style=\"width: 140px; height: 120px;border-radius: 100%\">\n");
      out.write("                        NTAUTO\n");
      out.write("                        </a>                         \n");
      out.write("                        \n");
      out.write("                      </h1>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("<!--                dang nhap-->\n");
      out.write("                <div>\n");
      out.write("<!--                    road to login.jsp-->\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("                </div> \n");
      out.write("                \n");
      out.write("              <ul id=\"tmMainNav\" class=\"nav flex-column text-uppercase text-right tm-main-nav\">\n");
      out.write("                  ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                  \n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a href=\"#intro\" class=\"nav-link active\">\n");
      out.write("                    <span class=\"d-inline-block mr-3\">Intro</span>\n");
      out.write("                    <span class=\"d-inline-block tm-white-rect\"></span>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a href=\"#about\" class=\"nav-link\">\n");
      out.write("                    <span class=\"d-inline-block mr-3\">About</span>\n");
      out.write("                    <span class=\"d-inline-block tm-white-rect\"></span>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <!--                  tìm ki?m-->\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a href=\"#shop\" class=\"nav-link active\">\n");
      out.write("                      <span class=\"d-inline-block mr-3\">Shop</span>\n");
      out.write("                      <span class=\"d-inline-block tm-white-rect\"></span>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a href=\"#work\" class=\"nav-link\">\n");
      out.write("                    <span class=\"d-inline-block mr-3\">Product</span>\n");
      out.write("                    <span class=\"d-inline-block tm-white-rect\"></span>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a href=\"#clients\" class=\"nav-link\">\n");
      out.write("                    <span class=\"d-inline-block mr-3\">Clients</span>\n");
      out.write("                    <span class=\"d-inline-block tm-white-rect\"></span>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a href=\"#talk\" class=\"nav-link\">\n");
      out.write("                    <span class=\"d-inline-block mr-3\">Contact</span>\n");
      out.write("                    <span class=\"d-inline-block tm-white-rect\"></span>\n");
      out.write("                  </a>\n");
      out.write("                </li> \n");
      out.write(" \n");
      out.write("<!--                login-->             \n");
      out.write("              </ul>\n");
      out.write("              <ul class=\"nav flex-row tm-social-links\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a href=\"https://facebook.com\" class=\"nav-link tm-social-link\">\n");
      out.write("                    <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a href=\"https://twitter.com\" class=\"nav-link tm-social-link\">\n");
      out.write("                    <i class=\"fab fa-twitter\"></i>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a href=\"https://dribbble.com\" class=\"nav-link tm-social-link\">\n");
      out.write("                    <i class=\"fab fa-dribbble\"></i>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a href=\"https://linkedin.com\" class=\"nav-link tm-social-link\">\n");
      out.write("                    <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("              <footer class=\"text-center text-white small\">\n");
      out.write("                <p class=\"mb--0 mb-2\">Copyright 2020 Dream Pulse</p>\n");
      out.write("                <p class=\"mb-0\">Design:\n");
      out.write("                  <a rel=\"nofollow\" href=\"https://templatemo.com\" class=\"tm-footer-link\">Template Mo</a>\n");
      out.write("                </p>\n");
      out.write("              </footer>\n");
      out.write("            </div>\n");
      out.write("          </nav>\n");
      out.write("          \n");
      out.write("          <main role=\"main\" class=\"ml-sm-auto col-12\">\n");
      out.write("            <div\n");
      out.write("              class=\"parallax-window\"\n");
      out.write("              data-parallax=\"scroll\"\n");
      out.write("              data-image-src=\"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2018-rolls-royce-phantom-1536152159.png\">\n");
      out.write("              <div class=\"tm-section-wrap\">\n");
      out.write("                <section id=\"intro\" class=\"tm-section\">\n");
      out.write("                    <div class=\"tm-bg-white-transparent tm-intro\">\n");
      out.write("                        <h1 class=\"tm-section-title mb-5 text-uppercase tm-color-primary\">Welcome to NTAuto</h1>\n");
      out.write("                        <p class=\"tm-color-gray\">\n");
      out.write("                            Address:  Trung Hoa - Cau Giay - Ha Noi\n");
      out.write("\n");
      out.write("                            Phone: 099999999 - 0366866668 .<br>\n");
      out.write("\n");
      out.write("                            Fax: 0462566668 <br>\n");
      out.write("\n");
      out.write("                            Email: info@ntauto.com <br>\n");
      out.write("\n");
      out.write("                            Specializing in buying, selling, and consigning all kinds of cars at home and abroad\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"mb-0 tm-color-gray\">\n");
      out.write("                          The customer's demand is our enthusiasm\n");
      out.write("                        </p>\n");
      out.write("                    </div>              \n");
      out.write("                </section>\n");
      out.write("            </div>            \n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"tm-section-wrap bg-white\">\n");
      out.write("            <section id=\"about\" class=\"row tm-section\">\n");
      out.write("              <div class=\"col-xl-6\">\n");
      out.write("                <div class=\"tm-section-half\">    \n");
      out.write("                    <div><i class=\"fas fa-6x fa-balance-scale mb-5 tm-section-icon\"></i></div>                        \n");
      out.write("                    <h2 class=\"tm-section-title tm-color-primary mb-5\">About Us</h2>\n");
      out.write("                    <p class=\"mb-5\">\n");
      out.write("                      When first section is scrolled up, BG image will be\n");
      out.write("                      disappeared with a parallax effect. Donec ac tempor tellus, a\n");
      out.write("                      eleifend ligula. Fusce vitae sem sed purus euismod\n");
      out.write("                      condimentum.\n");
      out.write("                    </p>\n");
      out.write("                    <p>\n");
      out.write("                      Sed at orci non metus tristique suscipit vitae in nibh. Sed\n");
      out.write("                      rutrum odio ac est hendrerit, at vestibulum felis condimentum.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-xl-6\">\n");
      out.write("                <div class=\"tm-section-half\">\n");
      out.write("                    <div><i class=\"far fa-6x fa-building mb-5 tm-section-icon\"></i></div>\n");
      out.write("                    <h2 class=\"tm-section-title tm-color-primary mb-5\">Company Profile</h2>\n");
      out.write("                    <p class=\"mb-5\">\n");
      out.write("                      You can use this template for your commercial websites or for your clients. \n");
      out.write("                      You are NOT allowed to re-post this template as a downloadable ZIP file \n");
      out.write("                      on your template collection sites. It is illegal.\n");
      out.write("                    </p>\n");
      out.write("                    <p>\n");
      out.write("                      Suspendisse fermentum orci eget lorem euismod suscipit. Morbi\n");
      out.write("                      condimentum odio metus, at finibus dolor sollicitudin quis.\n");
      out.write("                      Curabitur eu congue erat.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </section>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write(" <div class=\"tm-section-wrap bg-white\">\n");
      out.write("     <h1 id=\"shop\" style=\"text-align: center\"><a href=\"ShopControl\">GO TO SHOP</a></h1>\n");
      out.write("<div class=\"tm-gallery  bestsell\"> \n");
      out.write("    <h1>Best - selling product</h1>\n");
      out.write("    <div class=\"tm-gallery-item\">  \n");
      out.write("        \n");
      out.write("        <figure class=\"effect-bubba product\">\n");
      out.write("            <img\n");
      out.write("                src=\"https://img1.oto.com.vn/crop/458x344/2020/04/16/20200416101420-bc49_wm.jpg\" alt=\"Our Work Image\" class=\"img-fluid\">\n");
      out.write("            <figcaption>\n");
      out.write("                <h2>Camry <span>\n");
      out.write("                        Toyota\n");
      out.write("                    </span>\n");
      out.write("                </h2>\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">View more</a>\n");
      out.write("            </figcaption>\n");
      out.write("        </figure>                                    \n");
      out.write("\n");
      out.write("        <a href=\"ShopControl\">Product details</a>                              \n");
      out.write("    </div>                            \n");
      out.write("            </div>\n");
      out.write("<!--         san pham-->\n");
      out.write("            <section id=\"work\" class=\"row tm-section\">\n");
      out.write("              <div class=\"col-12\">\n");
      out.write("                <div class=\"w-100 tm-double-border-1 tm-border-gray\">\n");
      out.write("                    <div class=\"tm-double-border-2 tm-border-gray tm-box-pad\">\n");
      out.write("                      <div class=\"tm-gallery-wrap\">\n");
      out.write("                          <h2 class=\"tm-color-primary tm-section-title mb-4 ml-2\">Our Car</h2>\n");
      out.write("                          <div class=\"tm-gallery\">\n");
      out.write("<!--                              khong co san pham tim thay-->\n");
      out.write("                            ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("                              \n");
      out.write("                             ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("                     \n");
      out.write("                          </div>\n");
      out.write("                      </div>                        \n");
      out.write("                    </div>                  \n");
      out.write("                  </div>     \n");
      out.write("              </div>         \n");
      out.write("            </section>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("          <div class=\"tm-section-wrap bg-white\">\n");
      out.write("            <section id=\"clients\" class=\"row tm-section\">\n");
      out.write("              <div class=\"col-12 tm-section-pad\">\n");
      out.write("                  <div class=\"tm-flex-item-left\">\n");
      out.write("                      <div class=\"tm-w-80\">\n");
      out.write("                          <h2 class=\"tm-color-primary tm-section-title mb-4\">Our Clients</h2>\n");
      out.write("                          <p class=\"mb-5\">\n");
      out.write("                            Aenean est augue, iaculis ut arcu a, cursus tempus eros.\n");
      out.write("                            Maecenas ut efficitur lectus, vel commodo nibh. Vivamus\n");
      out.write("                            consequat massa non euismod facilisis. Morbi assumsan non libero\n");
      out.write("                            a vehicula. Donec blandit suscipit magna sit amet elementum.\n");
      out.write("                          </p>\n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                      <div class=\"row tm-clients-images\">\n");
      out.write("                        <div class=\"col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap\">\n");
      out.write("                          <a href=\"https://google.com\">\n");
      out.write("                            <img src=\"https://assets.stickpng.com/images/580b57fcd9996e24bc43c48b.png\" alt=\"Client Image\" class=\"img-fluid tm-client-img\" />\n");
      out.write("                          </a>                          \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap\">\n");
      out.write("                          <a href=\"https://facebook.com\">\n");
      out.write("                            <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRETFosf0KT9oZep86vLpud9oGOcIJEsiYSwA&usqp=CAU\" alt=\"Client Image\" class=\"img-fluid tm-client-img\" />\n");
      out.write("                          </a>                          \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap\">\n");
      out.write("                          <a href=\"https://twitter.com\">\n");
      out.write("                            <img src=\"https://www.logocentral.info/wp-content/uploads/2019/05/BMW-Logo-1920x1080.png\" alt=\"Client Image\" class=\"img-fluid tm-client-img\" />\n");
      out.write("                          </a>                          \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap\">\n");
      out.write("                          <a href=\"https://instagram.com\">\n");
      out.write("                            <img src=\"https://cdn.mos.cms.futurecdn.net/WpcTavg99b5XpK6STzSLZ8.jpg\" alt=\"Client Image\" class=\"img-fluid tm-client-img\" />\n");
      out.write("                          </a>                          \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap\">\n");
      out.write("                            <a href=\"https://google.com\">\n");
      out.write("                              <img src=\"https://www.carlogos.org/logo/Land-Rover-logo-2011-1920x1080.png\" alt=\"Client Image\" class=\"img-fluid tm-client-img\" />\n");
      out.write("                            </a>                          \n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap\">\n");
      out.write("                            <a href=\"https://facebook.com\">\n");
      out.write("                              <img src=\"https://www.carlogos.org/logo/Mercedes-Benz-logo-2011-1920x1080.png\" alt=\"Client Image\" class=\"img-fluid tm-client-img\" />\n");
      out.write("                            </a>                          \n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap\">\n");
      out.write("                            <a href=\"https://twitter.com\">\n");
      out.write("                              <img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Ford_Motor_Company_Logo.svg/1024px-Ford_Motor_Company_Logo.svg.png\" alt=\"Client Image\" class=\"img-fluid tm-client-img\" />\n");
      out.write("                            </a>                          \n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap\">\n");
      out.write("                            <a href=\"https://instagram.com\">\n");
      out.write("                              <img src=\"https://m.atcdn.co.uk/ect/media/w1200/f1d8f620971b49a88706a06bafd947a5.jpg\" alt=\"Client Image\" class=\"img-fluid tm-client-img\" />\n");
      out.write("                            </a>                          \n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                  </div> \n");
      out.write("              </div>                             \n");
      out.write("            </section>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("          <div class=\"tm-section-wrap bg-white\">\n");
      out.write("            <section id=\"talk\" class=\"row tm-section\">\n");
      out.write("                <div class=\"col-xl-6 mb-5\">\n");
      out.write("                  <div class=\"tm-double-border-1 tm-border-gray\">\n");
      out.write("                    <div class=\"tm-double-border-2 tm-border-gray tm-box-pad\">\n");
      out.write("                        <h2 class=\"tm-color-primary tm-section-title mb-4\" style=\"text-align: center\">\n");
      out.write("                            <a href=\"Login.jsp\">Login</a>\n");
      out.write("                        </h2>\n");
      out.write("                        <p class=\"mb-4\">\n");
      out.write("                            Welcome members of NTAuto\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"mb-3\">\n");
      out.write("                            <img src=\"https://image.freepik.com/free-vector/automotive_25327-95.jpg\" alt=\"\" style=\"width: 100%; height: 100%;border-radius: 20px\">\n");
      out.write("                        </p>\n");
      out.write("                    </div>                    \n");
      out.write("                  </div>                  \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xl-6 mb-5\">\n");
      out.write("                  <div class=\"tm-contact-form-wrap\">\n");
      out.write("<!--                      dang nhap -->\n");
      out.write("                ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                  </div>                    \n");
      out.write("                </div>\n");
      out.write("              </section>\n");
      out.write("          </div>\n");
      out.write("        </main>        \n");
      out.write("      </div>\n");
      out.write("    </main>\n");
      out.write("                     \n");
      out.write("  </body>       \n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.singlePageNav.min.js\"></script>\n");
      out.write("    <script src=\"js/parallax.min.js\"></script>\n");
      out.write("    <script src=\"slick/slick.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("    <script src=\"js/templatemo-scripts.js\"></script>\n");
      out.write("</html>\n");
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
        out.write("                    <li class=\"nav-item\">\n");
        out.write("                        <h1 style=\"color: yellow;\n");
        out.write("                            font-family: 'Lobster', cursive;\n");
        out.write("                            \">Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ac.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h1>\n");
        out.write("                        <a href=\"ManagerAllProductControl\" style=\"\n");
        out.write("                           text-decoration: none\n");
        out.write("                           ;color: #fff\">\n");
        out.write("                            <h1>Manager</h1>\n");
        out.write("                        </a>    \n");
        out.write("                        <a href=\"LogoutControl\" style=\"\n");
        out.write("                           text-decoration: none\n");
        out.write("                           ;color: #fff\">\n");
        out.write("                            <h1>Logout</h1>\n");
        out.write("                        </a>\n");
        out.write("                        <a href=\"ShopControl\" style=\"\n");
        out.write("                           text-decoration: none\n");
        out.write("                           ;color: #fff\">\n");
        out.write("                            <h1>Go To Shop</h1>\n");
        out.write("                        </a> \n");
        out.write("                    </li>\n");
        out.write("                ");
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
        out.write("                    <li class=\"nav-item\">\n");
        out.write("                        <h1 style=\"color: yellow;\n");
        out.write("                            font-family: 'Lobster', cursive;\n");
        out.write("                            \">Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ac.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h1>\n");
        out.write("                        <a href=\"#talk\" style=\"\n");
        out.write("                           text-decoration: none\n");
        out.write("                           ;color: #fff\" data-toggle=\"modal\">\n");
        out.write("                            <h4></h4>\n");
        out.write("                        </a>    \n");
        out.write("                        <a href=\"LogoutControl\" style=\"\n");
        out.write("                           text-decoration: none\n");
        out.write("                           ;color: #fff\">\n");
        out.write("                            <h1>Logout</h1>\n");
        out.write("                        </a>\n");
        out.write("                        <a href=\"ShopControl\" style=\"\n");
        out.write("                           text-decoration: none\n");
        out.write("                           ;color: #fff\">\n");
        out.write("                            <h1>Go To Shop</h1>\n");
        out.write("                        </a> \n");
        out.write("                    </li>\n");
        out.write("                ");
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
        out.write("                    <li class=\"nav-item\">\n");
        out.write("                        <a href=\"Login.jsp\" style=\"\n");
        out.write("                           text-decoration: none\n");
        out.write("                           ;color: #fff\">\n");
        out.write("                            <h1>Login</h1>\n");
        out.write("                    </a>\n");
        out.write("                    </li>\n");
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

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ac != null&& sessionScope.ac.isAdmin==false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                      <li class=\"nav-item\">\n");
        out.write("                          <a href=\"#talk\" class=\"nav-link\">\n");
        out.write("                              <span class=\"d-inline-block mr-3\">View car reservation schedule</span>\n");
        out.write("                              <span class=\"d-inline-block tm-white-rect\"></span>\n");
        out.write("                          </a>\n");
        out.write("                      </li> \n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <div class=\"tm-gallery-item\">                        \n");
        out.write("                                      <h1>Not Found</h1>                                                               \n");
        out.write("                                  </div>              \n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                  <div class=\"tm-gallery-item\">                        \n");
          out.write("                                      <figure class=\"effect-bubba product\">\n");
          out.write("                                          <img\n");
          out.write("                                              src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Our Work Image\" class=\"img-fluid\">\n");
          out.write("                                          <figcaption>\n");
          out.write("                                              <h2>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <span>\n");
          out.write("\n");
          out.write("                                                  </span>\n");
          out.write("                                              </h2>\n");
          out.write("                                              <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">View more</a>\n");
          out.write("                                          </figcaption>\n");
          out.write("                                      </figure>                                    \n");
          out.write("\n");
          out.write("                                      <a href=\"ShopControl\">Demo Car</a>                              \n");
          out.write("                                  </div>          \n");
          out.write("                              ");
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

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ac != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <form action=\"FeedbackControl\" method=\"POST\" class=\"tm-contact-form\">\n");
        out.write("                        <div class=\"form-group\">\n");
        out.write("                            <h3>Name : ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ac.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h3>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"form-group\">\n");
        out.write("                           <h3>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ac.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h3>\n");
        out.write("                        </div>\n");
        out.write("                         <div class=\"form-group\">\n");
        out.write("                             <label>Car delivery schedule:</label>\n");
        out.write("                             ");
        if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                             ");
        if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                             <h3>Very pleased to serve you</h3>\n");
        out.write("                        </div>\n");
        out.write("                        \n");
        out.write("                        <div class=\"form-group\">\n");
        out.write("                          <textarea rows=\"4\" id=\"contact_message\" name=\"feedbackmessage\" class=\"form-control rounded-0 border-top-0 border-right-0 border-left-0\" placeholder=\"Message...\" required=\"\"></textarea>\n");
        out.write("                        </div>\n");
        out.write("                \n");
        out.write("                        <div class=\"form-group mb-0\">\n");
        out.write("                          <button type=\"submit\" class=\"btn rounded-0 d-block ml-auto tm-btn-primary\">\n");
        out.write("                                Contact\n");
        out.write("                          </button>\n");
        out.write("                        </div>\n");
        out.write("                      </form>\n");
        out.write("                   ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ac != null&& sessionScope.ac.isAdmin==false && \n                                              sessionScope.ac.schedule != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                 <b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ac.schedule}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</b>\n");
        out.write("                             ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ac != null&& sessionScope.ac.isAdmin==false && \n                                              sessionScope.ac.schedule == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                 <b>You have not bought a car</b>\n");
        out.write("                             ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }
}
