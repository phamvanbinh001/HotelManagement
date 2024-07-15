package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Profile</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/images/favicon.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Quicksand:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            .container-body {\n");
      out.write("                max-width: 1200px !important;\n");
      out.write("                padding: 0 !important;\n");
      out.write("                margin-bottom: 24px;\n");
      out.write("            }\n");
      out.write("            .breadcrumb-p {\n");
      out.write("                color: #439845;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            .user-sidebar {\n");
      out.write("                background-color: #f8f9fa;\n");
      out.write("                padding: 20px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            label[for=\"password\"]:hover {\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .user-sidebar .nav-link {\n");
      out.write("                color: #333;\n");
      out.write("                padding: 10px 15px;\n");
      out.write("            }\n");
      out.write("            .user-sidebar .nav-link.active {\n");
      out.write("                background-color: #439845;\n");
      out.write("                color: #fff;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            .user-info-card {\n");
      out.write("                box-shadow: 0 2px 12px rgba(0, 0, 0, .08);\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            .user-avatar {\n");
      out.write("                width: 150px;\n");
      out.write("                height: 150px;\n");
      out.write("                object-fit: cover;\n");
      out.write("                padding: 2px;\n");
      out.write("                border: solid 1px #439845;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("            .user-sidebar .nav-item .nav-link.non-active{\n");
      out.write("                color: #000  !important;\n");
      out.write("            }\n");
      out.write("            .card-body .btn.btn-outline-mystyle {\n");
      out.write("                background-color: #fff;\n");
      out.write("                border-color: #439845;\n");
      out.write("                color: #439845;\n");
      out.write("            }\n");
      out.write("            .card-body .btn.btn-mystyle, \n");
      out.write("            .card-body .btn.btn-outline-mystyle:hover {\n");
      out.write("                background-color: #439845;\n");
      out.write("                border-color: #439845;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            .card-body .btn.btn-mystyle:hover {\n");
      out.write("                background-color: #367a39;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<!-- Header Start -->\r\n");
      out.write("<div class=\"container-fluid bg-dark px-0\">\r\n");
      out.write("    <div class=\"row gx-0\">\r\n");
      out.write("        <div class=\"col-lg-3 bg-dark d-none d-lg-block\">\r\n");
      out.write("            <a href=\"home.jsp\" class=\"navbar-brand w-100 h-100 m-0 p-0 d-flex align-items-center justify-content-center\">\r\n");
      out.write("                <h1 class=\"m-0 text-primary text-uppercase\">Thieuhoang</h1>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-9\">\r\n");
      out.write("            <div class=\"row gx-0 bg-white d-none d-lg-flex\">\r\n");
      out.write("                <div class=\"col-lg-7 px-5 text-start\">\r\n");
      out.write("                    <div class=\"h-100 d-inline-flex align-items-center py-2 me-4\">\r\n");
      out.write("                        <i class=\"fa fa-envelope text-primary me-2\"></i>\r\n");
      out.write("                        <p class=\"mb-0\">info@example.com</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"h-100 d-inline-flex align-items-center py-2\">\r\n");
      out.write("                        <i class=\"fa fa-phone-alt text-primary me-2\"></i>\r\n");
      out.write("                        <p class=\"mb-0\">+012 345 6789</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-5 text-end\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg bg-dark navbar-dark p-3 p-lg-0\">\r\n");
      out.write("                <a href=\"home.jsp\" class=\"navbar-brand d-block d-lg-none\">\r\n");
      out.write("                    <h1 class=\"m-0 text-primary text-uppercase\">Thieuhoang</h1>\r\n");
      out.write("                </a>\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\r\n");
      out.write("                    <div class=\"navbar-nav mr-auto py-0\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-item nav-link active\">Home</a>\r\n");
      out.write("                        <a href=\"#about-page\" class=\"nav-item nav-link\">About</a>\r\n");
      out.write("                        <a href=\"#room-page\" class=\"nav-item nav-link\">Rooms</a>\r\n");
      out.write("                        <div class=\"nav-item dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Pages</a>\r\n");
      out.write("                            <div class=\"dropdown-menu rounded-0 m-0\">\r\n");
      out.write("                                <a href=\"booking.jsp\" class=\"dropdown-item\">Booking</a>\r\n");
      out.write("                                <a href=\"team.jsp\" class=\"dropdown-item\">Our Team</a>\r\n");
      out.write("                                <a href=\"testimonial.jsp\" class=\"dropdown-item\">Testimonial</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a href=\"#footer-page\" class=\"nav-item nav-link\">Contact</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Header End -->\r\n");
      out.write("\n");
      out.write("        <div class=\"container container-body mt-4\">\n");
      out.write("            <nav aria-label=\"breadcrumb\">\n");
      out.write("                <ol class=\"breadcrumb\">\n");
      out.write("                    <li class=\"breadcrumb-item\"><a href=\"home\" class=\"breadcrumb-p\">Home</a></li>\n");
      out.write("                    <li class=\"breadcrumb-item active breadcrumb-p\" aria-current=\"page\">User Information</li>\n");
      out.write("                </ol>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"user-sidebar\">\n");
      out.write("                        <h4 class=\"mb-4\">My Account</h4>\n");
      out.write("                        <ul class=\"nav flex-column\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link active\" href=\"#\">Account Information</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link non-active\" href=\"#\">My Orders</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link non-active\" href=\"#\">Shipping Addresses</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link non-active\" href=\"#\">Favorite Products</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <label for=\"password\" class=\"nav-link non-active\">Change Password</label>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9\">\n");
      out.write("                    <div class=\"card user-info-card\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h3 class=\"card-title mb-4\">Account Information</h3>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-4 text-center mb-4\">\n");
      out.write("                                    <img src=\"assets/images/default-user-avatar.jpg\" alt=\"User Avatar\" class=\"user-avatar mb-3\">\n");
      out.write("                                    <button class=\"btn btn-outline-primay  btn-outline-mystyle\">Change Avatar</button>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <form action=\"home\" method=\"post\">\n");
      out.write("                                        <div class=\"mb-3 row\">\n");
      out.write("                                            <label for=\"fullName\" class=\"col-sm-3 col-form-label\">Full Name</label>\n");
      out.write("                                            <div class=\"col-sm-9\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"name\" id=\"fullName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.name != null ? requestScope.name : sessionScope.userLogin.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"mb-3 row\">\n");
      out.write("                                            <label for=\"email\" class=\"col-sm-3 col-form-label\">Email</label>\n");
      out.write("                                            <div class=\"col-sm-9\">\n");
      out.write("                                                <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.email != null ? requestScope.email : sessionScope.userLogin.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"text-danger mt-2\" style=\"display: none; ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emailErrStyle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                Email is already in use!\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"mb-3 row\">\n");
      out.write("                                            <label for=\"phoneNumber\" class=\"col-sm-3 col-form-label\">Phone Number</label>\n");
      out.write("                                            <div class=\"col-sm-9\">\n");
      out.write("                                                <input type=\"tel\" class=\"form-control\" name=\"phone\" id=\"phoneNumber\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.phone != null ? requestScope.phone : sessionScope.userLogin.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" pattern=\"^[+]?[0-9]{10,11}$\" required>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"text-danger mt-2\" style=\"display: none; ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phoneErrStyle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                Phone number is already in use!\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"mb-3 row\">\n");
      out.write("                                            <label for=\"password\" class=\"col-sm-3 col-form-label\">New Password</label>\n");
      out.write("                                            <div class=\"col-sm-9\">\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" value=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div id=\"passwordError\" class=\"text-danger mt-2\" style=\"display: none;\">\n");
      out.write("                                                Password must be at least 6 characters long and include at least 1 uppercase letter, 1 lowercase letter, and 1 digit.\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"mb-3 row\">\n");
      out.write("                                            <label for=\"confirmPassword\" class=\"col-sm-3 col-form-label\">Confirm new Password</label>\n");
      out.write("                                            <div class=\"col-sm-9\">\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" id=\"confirmPassword\" value=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div id=\"password2Error\" class=\"text-danger mt-2\" style=\"display: none;\">\n");
      out.write("                                                Passwords do not match!\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"text-end\">\n");
      out.write("                                            <input type=\"hidden\" name=\"action\" value=\"ChangeUserInfo\">\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-primary btn-mystyle\">Save Changes</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("<!-- Footer Start -->\r\n");
      out.write("<div class=\"container-fluid bg-dark text-light footer wow fadeIn footer-page\" id=\"footer-page\" data-wow-delay=\"0.1s\">\r\n");
      out.write("    <div class=\"container pb-5\">\r\n");
      out.write("        <div class=\"row g-5\">\r\n");
      out.write("            <div class=\"col-md-6 col-lg-4\">\r\n");
      out.write("                <div class=\"bg-primary rounded p-4\">\r\n");
      out.write("                    <a href=\"home.jsp\" class=\"text-decoration-none\"><h1 class=\"text-white text-uppercase mb-3\">Thieuhoangg</h1></a>\r\n");
      out.write("                    <p class=\"text-white mb-0\">\r\n");
      out.write("                        Inbox <a class=\"text-dark fw-medium text-decoration-none\" href=\"https://www.facebook.com/HoangKhongThieuCo\">Co Thieu Hoang </a>, I can help you everything you need in FUniversity.\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6 col-lg-3\">\r\n");
      out.write("                <h6 class=\"section-title text-start text-primary text-uppercase mb-4\">Contact</h6>\r\n");
      out.write("                <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt me-3\"></i>123 Street, New York, USA</p>\r\n");
      out.write("                <p class=\"mb-2\"><i class=\"fa fa-phone-alt me-3\"></i>+012 345 67890</p>\r\n");
      out.write("                <p class=\"mb-2\"><i class=\"fa fa-envelope me-3\"></i>info@example.com</p>\r\n");
      out.write("                <div class=\"d-flex pt-2\">\r\n");
      out.write("                    <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                    <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                    <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-youtube\"></i></a>\r\n");
      out.write("                    <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-5 col-md-12\">\r\n");
      out.write("                <div class=\"row gy-5 g-4\">\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <h6 class=\"section-title text-start text-primary text-uppercase mb-4\">Company</h6>\r\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">About Us</a>\r\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Contact Us</a>\r\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Privacy Policy</a>\r\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Terms & Condition</a>\r\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Support</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <h6 class=\"section-title text-start text-primary text-uppercase mb-4\">Services</h6>\r\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Food & Restaurant</a>\r\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Spa & Fitness</a>\r\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Sports & Gaming</a>\r\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Event & Party</a>\r\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">GYM & Yoga</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"copyright\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\r\n");
      out.write("                    &copy; <a class=\"border-bottom\" href=\"#\">Your Site Name</a>, All Right Reserved. \r\n");
      out.write("\r\n");
      out.write("                    <!--/*** This template is free as long as you keep the footer author?s credit link/attribution link/backlink. If you'd like to use the template without the footer author?s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/-->\r\n");
      out.write("                    Designed By <a class=\"border-bottom\" href=\"https://htmlcodex.com\">HTML Codex</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6 text-center text-md-end\">\r\n");
      out.write("                    <div class=\"footer-menu\">\r\n");
      out.write("                        <a href=\"\">Home</a>\r\n");
      out.write("                        <a href=\"\">Cookies</a>\r\n");
      out.write("                        <a href=\"\">Help</a>\r\n");
      out.write("                        <a href=\"\">FQAs</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Footer End -->\r\n");
      out.write("\n");
      out.write("        <!--<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>-->\n");
      out.write("        <script src=\"assets/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            const pass = document.querySelector(\"#password\");\n");
      out.write("            const pass2 = document.querySelector(\"#confirmPassword\");\n");
      out.write("\n");
      out.write("            function validatePassword() {\n");
      out.write("                var password = document.getElementById(\"password\").value;\n");
      out.write("                var passwordError = document.getElementById(\"passwordError\");\n");
      out.write("                var result = true;\n");
      out.write("\n");
      out.write("                const hasUpperCase = /[A-Z]/.test(password);\n");
      out.write("                const hasLowerCase = /[a-z]/.test(password);\n");
      out.write("                const hasDigit = /[0-9]/.test(password);\n");
      out.write("\n");
      out.write("                if (password.length >= 6 && hasUpperCase && hasLowerCase && hasDigit) {\n");
      out.write("                    passwordError.style.display = \"none\";\n");
      out.write("                } else {\n");
      out.write("                    passwordError.style.display = \"block\";\n");
      out.write("                    result = false;\n");
      out.write("                }\n");
      out.write("                return result;\n");
      out.write("            }\n");
      out.write("            function validateConfirmPassword() {\n");
      out.write("                var password = document.getElementById(\"password\").value;\n");
      out.write("                var confirmPassword = document.getElementById(\"confirmPassword\").value;\n");
      out.write("                var password2Error = document.getElementById(\"password2Error\");\n");
      out.write("                var result = true;\n");
      out.write("\n");
      out.write("                if (password !== confirmPassword) {\n");
      out.write("                    password2Error.style.display = \"block\";\n");
      out.write("                    result = false;\n");
      out.write("                } else {\n");
      out.write("                    password2Error.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("                return result;\n");
      out.write("            }\n");
      out.write("            pass.addEventListener(\"input\", validatePassword);\n");
      out.write("            pass2.addEventListener(\"input\", validateConfirmPassword);\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userFullNameLogin == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <div class=\"d-inline-flex align-items-center py-2\">\r\n");
        out.write("                            <a href=\"#\" class=\"me-3 text-decoration-none text-primary\" onclick=\"openPopupLogin()\">Login</a>\r\n");
        out.write("                            <span class=\"me-3 text-primary\">|</span>\r\n");
        out.write("                            <a href=\"register.jsp\" class=\"me-3 text-decoration-none text-primary\">Register</a>\r\n");
        out.write("                        </div>\r\n");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userFullNameLogin != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <div class=\"d-inline-flex align-items-center py-2\">\r\n");
        out.write("                            <a href=\"profile\" class=\"text-decoration-none text-primary\">\r\n");
        out.write("                                <i class=\"fas fa-user\"></i>\r\n");
        out.write("                                <span class=\"me-3 text-primary\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userFullNameLogin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
        out.write("                            </a>\r\n");
        out.write("                        </div>\r\n");
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
}
