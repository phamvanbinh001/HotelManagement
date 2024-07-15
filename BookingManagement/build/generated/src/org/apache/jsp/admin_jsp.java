package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/modal.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Admin Center</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/images/favicon.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Quicksand:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Quicksand, sans-serif;\n");
      out.write("            }\n");
      out.write("            .container-body {\n");
      out.write("                max-width: 1200px !important;\n");
      out.write("                padding: 0 !important;\n");
      out.write("            }\n");
      out.write("            .container-fluid main.main-content {\n");
      out.write("                max-height: 100vh;\n");
      out.write("                overflow-y: scroll;\n");
      out.write("            }\n");
      out.write("            .sidebar {\n");
      out.write("                height: 100vh;\n");
      out.write("                background-color: #f8f9fa;\n");
      out.write("            }\n");
      out.write("            .content {\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            .nav-link {\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("            .nav-link:hover, .nav-link.active {\n");
      out.write("                background-color: #e9ecef;\n");
      out.write("            }\n");
      out.write("            .table-responsive {\n");
      out.write("                overflow-x: auto;\n");
      out.write("            }\n");
      out.write("            .admin-info {\n");
      out.write("                background-color: #e9ecef;\n");
      out.write("                padding: 10px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("            .restore {\n");
      out.write("                width: 105px;\n");
      out.write("            }\n");
      out.write("            form[action=\"home\"] {\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .banning {\n");
      out.write("                width: 168px;\n");
      out.write("            }\n");
      out.write("            .admin-btn, .staff-btn {\n");
      out.write("                width: 134px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- Sidebar -->\n");
      out.write("                <nav class=\"col-md-3 col-lg-2 d-md-block sidebar collapse\">\n");
      out.write("                    <div class=\"position-sticky pt-3\">\n");
      out.write("                        <div class=\"admin-info text-center\">\n");
      out.write("                            <i class=\"fas fa-user-circle fa-2x mb-2\"></i>\n");
      out.write("                            <p class=\"mb-0\">Welcome, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userFullNameLogin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <a href=\"logout\" class=\"btn btn-sm btn-danger mt-2\" onclick=\"\">Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                        <ul class=\"nav flex-column\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link active\" href=\"#dashboard\" data-section=\"dashboard\">\n");
      out.write("                                    <i class=\"fas fa-tachometer-alt me-2\"></i>Dashboard\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#products\" data-section=\"products\">\n");
      out.write("                                    <i class=\"fas fa-box me-2\"></i>Products\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#users\" data-section=\"users\">\n");
      out.write("                                    <i class=\"fas fa-users me-2\"></i>Users\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#orders\" data-section=\"orders\">\n");
      out.write("                                    <i class=\"fas fa-shopping-cart me-2\"></i>Orders\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <!-- Main content -->\n");
      out.write("                <main class=\"col-md-9 ms-sm-auto col-lg-10 px-md-4 main-content\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <section id=\"dashboard\" class=\"mb-4\">\n");
      out.write("                            <h2>Dashboard</h2>\n");
      out.write("                        </section>\n");
      out.write("\n");
      out.write("                        <!-- Bookings Section -->\n");
      out.write("                        <section id=\"products\" class=\"mb-5\">\n");
      out.write("                            <h3>Booking List</h3>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <!--                                <a href=\"product-details.jsp?target=add\">\n");
      out.write("                                                                    <button class=\"btn btn-outline-success mb-2\" type=\"submit\">Add new product</button>\n");
      out.write("                                                                </a>-->\n");
      out.write("                                <form action=\"main\" method=\"post\" class=\"d-flex\">\n");
      out.write("                                    <input type=\"hidden\" name=\"action\" value=\"searchBooking\">\n");
      out.write("                                    <input type=\"hidden\" name=\"src\" value=\"admin.jsp\">\n");
      out.write("                                    <button class=\"btn btn-outline-success me-2\" type=\"submit\">Search</button>\n");
      out.write("                                    <input class=\"form-control me-2\" type=\"search\" name=\"keyword\" placeholder=\"Input ID to search\" aria-label=\"Search\">                                   \n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-sm\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>ID</th>\n");
      out.write("                                            <th>User ID</th>\n");
      out.write("                                            <th>Room ID</th>\n");
      out.write("                                            <th>Check in</th>\n");
      out.write("                                            <th>Check out</th>\n");
      out.write("                                            <th>Booking date</th>\n");
      out.write("                                            <th>Price</th>\n");
      out.write("                                            <th>Status</th>\n");
      out.write("                                            <th>Actions</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </section>\n");
      out.write("\n");
      out.write("                        <!-- Rooms Section -->\n");
      out.write("                        <section id=\"users\" class=\"mb-5\">\n");
      out.write("                            <h3>Rooms</h3>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <a href=\"product-details.jsp?target=add\">\n");
      out.write("                                    <button class=\"btn btn-outline-success mb-2\" type=\"submit\">Add new room</button>\n");
      out.write("                                </a>\n");
      out.write("                                <form action=\"home\" method=\"post\" class=\"d-flex\">\n");
      out.write("                                    <input type=\"hidden\" name=\"action\" value=\"SearchUser\">\n");
      out.write("                                    <button class=\"btn btn-outline-success me-2\" type=\"submit\">Search</button>\n");
      out.write("                                    <input class=\"form-control me-2\" type=\"search\" name=\"keyword\" placeholder=\"Search rooms\" aria-label=\"Search\">                                   \n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-sm\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>ID</th>\n");
      out.write("                                            <th>Room no</th>\n");
      out.write("                                            <th>Beds</th>\n");
      out.write("                                            <th>Price/date</th>\n");
      out.write("                                            <th>Type</th>\n");
      out.write("                                            <th>Status</th>\n");
      out.write("                                            <th>Actions</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </section>\n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Success Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"successModal\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-body text-center\">\r\n");
      out.write("                <i class=\"fas fa-check-circle text-success fa-4x mb-3\"></i>\r\n");
      out.write("                <h5 class=\"modal-title text-success\">Success</h5>\r\n");
      out.write("                <p id=\"successMessage\" class=\"mt-3\"></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Error Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"errorModal\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-body text-center\">\r\n");
      out.write("                <i class=\"fas fa-exclamation-circle text-danger fa-4x mb-3\"></i>\r\n");
      out.write("                <h5 class=\"modal-title text-danger\">Error</h5>\r\n");
      out.write("                <p id=\"errorMessage\" class=\"mt-3\"></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Confirmation Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"confirmModal\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\">Confirmation</h5>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <p id=\"confirmMessage\"></p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" id=\"confirmButton\">Confirm</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Loading Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"loadingModal\" tabindex=\"-1\" aria-hidden=\"true\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\">\r\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-body text-center\">\r\n");
      out.write("                <div class=\"spinner-border text-primary\" role=\"status\">\r\n");
      out.write("                    <span class=\"visually-hidden\">Loading...</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"mt-2\">Loading...</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Input Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"inputModal\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"inputModalTitle\">Enter Input</h5>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <input id=\"inputModalInput\" class=\"form-control\" placeholder=\"Enter your input here\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" id=\"inputModalSubmit\">Submit</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    // Function to show success modal\r\n");
      out.write("    function showSuccessModal(message, duration = 3000) {\r\n");
      out.write("        document.getElementById('successMessage').textContent = message;\r\n");
      out.write("        const modal = new bootstrap.Modal(document.getElementById('successModal'));\r\n");
      out.write("        modal.show();\r\n");
      out.write("        setTimeout(() => modal.hide(), duration);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // Function to show error modal\r\n");
      out.write("    function showErrorModal(message, duration = 3000) {\r\n");
      out.write("        document.getElementById('errorMessage').textContent = message;\r\n");
      out.write("        const modal = new bootstrap.Modal(document.getElementById('errorModal'));\r\n");
      out.write("        modal.show();\r\n");
      out.write("        setTimeout(() => modal.hide(), duration);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // Function to show confirmation modal\r\n");
      out.write("    function showConfirmModal(message, onConfirm) {\r\n");
      out.write("        document.getElementById('confirmMessage').textContent = message;\r\n");
      out.write("        const modal = new bootstrap.Modal(document.getElementById('confirmModal'));\r\n");
      out.write("        document.getElementById('confirmButton').onclick = () => {\r\n");
      out.write("            modal.hide();\r\n");
      out.write("            onConfirm();\r\n");
      out.write("        };\r\n");
      out.write("        modal.show();\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // Function to show loading modal\r\n");
      out.write("    function showLoadingModal() {\r\n");
      out.write("        new bootstrap.Modal(document.getElementById('loadingModal')).show();\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // Function to hide loading modal\r\n");
      out.write("    function hideLoadingModal() {\r\n");
      out.write("        const loadingModal = bootstrap.Modal.getInstance(document.getElementById('loadingModal'));\r\n");
      out.write("        if (loadingModal) {\r\n");
      out.write("            loadingModal.hide();\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    // Function to show input modal and return a promise\r\n");
      out.write("    function showInputModal(title = 'Enter Input', inputType = 'text', placeholder = 'Enter your input here') {\r\n");
      out.write("        return new Promise((resolve, reject) => {\r\n");
      out.write("            const modal = new bootstrap.Modal(document.getElementById('inputModal'));\r\n");
      out.write("            document.getElementById('inputModalTitle').textContent = title;\r\n");
      out.write("            const input = document.getElementById('inputModalInput');\r\n");
      out.write("            input.type = inputType;\r\n");
      out.write("            input.placeholder = placeholder;\r\n");
      out.write("            const submitButton = document.getElementById('inputModalSubmit');\r\n");
      out.write("\r\n");
      out.write("            function handleSubmit() {\r\n");
      out.write("                modal.hide();\r\n");
      out.write("                resolve(input.value);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            submitButton.onclick = handleSubmit;\r\n");
      out.write("            input.onkeypress = (e) => {\r\n");
      out.write("                if (e.key === 'Enter') {\r\n");
      out.write("                    handleSubmit();\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("            modal.show();\r\n");
      out.write("            input.focus();\r\n");
      out.write("\r\n");
      out.write("            // Clear input when modal is hidden\r\n");
      out.write("            document.getElementById('inputModal').addEventListener('hidden.bs.modal', function () {\r\n");
      out.write("                input.value = '';\r\n");
      out.write("                submitButton.onclick = null;\r\n");
      out.write("                input.onkeypress = null;\r\n");
      out.write("                reject('Modal closed');\r\n");
      out.write("            }, {once: true});\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!--// Hiển thị modal thành công trong 3 giây (mặc định)\r\n");
      out.write("showSuccessModal(\"Operation completed successfully!\");\r\n");
      out.write("\r\n");
      out.write("// Hiển thị modal lỗi trong 5 giây\r\n");
      out.write("showErrorModal(\"An error occurred. Please try again.\", 5000);\r\n");
      out.write("\r\n");
      out.write("// Các modal khác vẫn giữ nguyên cách sử dụng-->");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function formatCurrencyVND(number) {\n");
      out.write("                return new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format(number);\n");
      out.write("            }\n");
      out.write("            document.querySelectorAll('.price-format').forEach(function (element) {\n");
      out.write("                const value = parseFloat(element.textContent);\n");
      out.write("                element.textContent = formatCurrencyVND(value);\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("                if (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.hashUrl != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" && !window.location.hash) {\n");
      out.write("                    window.location.hash = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.hashUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            document.addEventListener('DOMContentLoaded', function () {\n");
      out.write("                const sidebarLinks = document.querySelectorAll('.sidebar .nav-link');\n");
      out.write("                const mainContent = document.querySelector('.main-content');\n");
      out.write("\n");
      out.write("                sidebarLinks.forEach(link => {\n");
      out.write("                    link.addEventListener('click', function (e) {\n");
      out.write("                        e.preventDefault();\n");
      out.write("                        const targetId = this.getAttribute('data-section');\n");
      out.write("                        const targetElement = document.getElementById(targetId);\n");
      out.write("\n");
      out.write("                        if (targetElement) {\n");
      out.write("                            const yOffset = -60;\n");
      out.write("                            const y = targetElement.getBoundingClientRect().top + window.pageYOffset + yOffset;\n");
      out.write("\n");
      out.write("                            mainContent.scrollTo({\n");
      out.write("                                top: y,\n");
      out.write("                                behavior: 'smooth'\n");
      out.write("                            });\n");
      out.write("                            sidebarLinks.forEach(l => l.classList.remove('active'));\n");
      out.write("                            this.classList.add('active');\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                //remove product :)))))\n");
      out.write("                $('.remove-product').click(function () {\n");
      out.write("                    var productId = $(this).data('product-id');\n");
      out.write("                    var $row = $(this).closest('tr');\n");
      out.write("\n");
      out.write("                    showConfirmModal('Are you sure you want to delete this product?', function () {\n");
      out.write("                        $.ajax({\n");
      out.write("                            url: 'home',\n");
      out.write("                            type: 'POST',\n");
      out.write("                            data: {\n");
      out.write("                                id: productId,\n");
      out.write("                                action: \"RemoveProduct\"\n");
      out.write("                            },\n");
      out.write("                            success: function (response) {\n");
      out.write("                                if (response === 'success') {\n");
      out.write("                                    $row.find('td:last').find('button:last').css('display', 'none');\n");
      out.write("                                    $row.find('td:last').find('button:first').html('Restore');\n");
      out.write("                                    $row.find('td:last').find('button:first').addClass('btn-warning restore');\n");
      out.write("                                    showSuccessModal('Product deleted successfully');\n");
      out.write("                                } else {\n");
      out.write("                                    showErrorModal('Failed to delete product');\n");
      out.write("                                }\n");
      out.write("                            },\n");
      out.write("                            error: function () {\n");
      out.write("                                showErrorModal('An error occurred while deleting the product');\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                //reset :)))))\n");
      out.write("                $('.reset-password').click(function () {\n");
      out.write("                    var userId = $(this).data('user-id');\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: 'home',\n");
      out.write("                        type: 'post',\n");
      out.write("                        data: {\n");
      out.write("                            id: userId,\n");
      out.write("                            action: \"ChangePassword\",\n");
      out.write("                            password: \"\"\n");
      out.write("                        },\n");
      out.write("                        success: function (response) {\n");
      out.write("                            if (response === 'success') {\n");
      out.write("                                showSuccessModal(\"ID: \" + userId + \"  New password: 12345\");\n");
      out.write("                            } else {\n");
      out.write("                                showErrorModal(\"An error occurred. Please try again.\");\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        error: function () {\n");
      out.write("                            showErrorModal('An error occurred while reset this password!');\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("                $(document).on('click', '.change-role', function () {\n");
      out.write("                    var userId = $(this).data('user-id');\n");
      out.write("                    var roleId = $(this).data('role') === 1 ? 2 : $(this).data('role') === 2 ? 3 : 1;\n");
      out.write("                    var newRole = roleId === 1 ? \"Admin\" : roleId === 2 ? \"Staff\" : \"Customer user\";\n");
      out.write("                    var $col = $(this).closest('td');\n");
      out.write("                    var newHtml = roleId === 1 ? '<button class=\"btn btn-outline-dark admin-btn change-role\" data-user-id=\"' + userId + '\" data-role=\"1\">Admin</button>'\n");
      out.write("                            : roleId === 2 ? '<button class=\"btn btn-outline-dark staff-btn change-role\" data-user-id=\"' + userId + '\" data-role=\"2\">Staff</button>'\n");
      out.write("                            : '<button class=\"btn btn-outline-dark change-role\" data-user-id=\"' + userId + '\" data-role=\"3\">Customer user</button>';\n");
      out.write("\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: 'home',\n");
      out.write("                        type: 'post',\n");
      out.write("                        data: {\n");
      out.write("                            id: userId,\n");
      out.write("                            action: \"ChangeRole\",\n");
      out.write("                            role: roleId\n");
      out.write("                        },\n");
      out.write("                        success: function (response) {\n");
      out.write("                            if (response === 'success') {\n");
      out.write("                                $col.html(newHtml);\n");
      out.write("                                showSuccessModal(\"New role: \" + newRole);\n");
      out.write("                            } else {\n");
      out.write("                                showErrorModal(\"An error occurred. Please try again.\");\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        error: function () {\n");
      out.write("                            showErrorModal('An error occurred while changing this role!');\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("                $('.change-password').click(function () {\n");
      out.write("                    var userId = $(this).data('user-id');\n");
      out.write("                    var pass = \"\";\n");
      out.write("                    showInputModal('Enter new password:', 'password', 'Be careful when entering a new password').then(password => {\n");
      out.write("                        if (password.length < 6 || !/[A-Z]/.test(password) || !/[a-z]/.test(password) || !/[0-9]/.test(password)) {\n");
      out.write("                            showErrorModal('Password must be at least 6 characters long and include at least 1 uppercase letter, 1 lowercase letter, and 1 digit.');\n");
      out.write("                            pass = \"\";\n");
      out.write("                        } else {\n");
      out.write("                            pass = password;\n");
      out.write("                            $.ajax({\n");
      out.write("                                url: 'home',\n");
      out.write("                                type: 'post',\n");
      out.write("                                data: {\n");
      out.write("                                    id: userId,\n");
      out.write("                                    action: \"ChangePassword\",\n");
      out.write("                                    password: pass\n");
      out.write("                                },\n");
      out.write("                                success: function (response) {\n");
      out.write("                                    if (response === 'success') {\n");
      out.write("                                        showSuccessModal(\"Change password successfully!\");\n");
      out.write("                                    } else {\n");
      out.write("                                        showErrorModal(\"An error occurred. Please try again.\");\n");
      out.write("                                    }\n");
      out.write("                                },\n");
      out.write("                                error: function () {\n");
      out.write("                                    showErrorModal('An error occurred while reset this password!');\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                // Remove user :))))\n");
      out.write("                $('.remove-user').click(function () {\n");
      out.write("                    var userId = $(this).data('user-id');\n");
      out.write("                    var $row = $(this).closest('tr');\n");
      out.write("                    var text = $row.find('td:last').find('button:last').text();\n");
      out.write("                    if (text === 'Ban') {\n");
      out.write("                        showConfirmModal('Are you sure you want to ban this user?', function () {\n");
      out.write("                            $.ajax({\n");
      out.write("                                url: 'remove-user',\n");
      out.write("                                type: 'post',\n");
      out.write("                                data: {\n");
      out.write("                                    id: userId,\n");
      out.write("                                    action: \"RemoveUser\"\n");
      out.write("                                },\n");
      out.write("                                success: function (response) {\n");
      out.write("                                    if (response === 'success') {\n");
      out.write("                                        $row.find('td:last').find('button:first').css('display', 'none');\n");
      out.write("                                        $row.find('td:last').find('button:last').text('Unban');\n");
      out.write("                                        $row.find('td:last').find('button:last').addClass('banning');\n");
      out.write("                                        showSuccessModal('User banned successfully');\n");
      out.write("                                    } else {\n");
      out.write("                                        showErrorModal(\"Opps! An error occurred. Please try again.\");\n");
      out.write("                                    }\n");
      out.write("                                },\n");
      out.write("                                error: function () {\n");
      out.write("                                    showErrorModal('An error occurred while banning the user');\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("                        });\n");
      out.write("                    } else {\n");
      out.write("                        showConfirmModal('Are you sure you want to unban this user?', function () {\n");
      out.write("                            $.ajax({\n");
      out.write("                                url: 'remove-user',\n");
      out.write("                                type: 'post',\n");
      out.write("                                data: {\n");
      out.write("                                    id: userId,\n");
      out.write("                                    action: \"RemoveUser\"\n");
      out.write("                                },\n");
      out.write("                                success: function (response) {\n");
      out.write("                                    if (response === 'success') {\n");
      out.write("                                        $row.find('td:last').find('button:first').css('display', 'inline-block');\n");
      out.write("                                        $row.find('td:last').find('button:last').text('Ban');\n");
      out.write("                                        $row.find('td:last').find('button:last').removeClass('banning');\n");
      out.write("                                        showSuccessModal('User unbanned successfully');\n");
      out.write("                                    } else {\n");
      out.write("                                        showErrorModal(\"Opps! An error occurred. Please try again.\");\n");
      out.write("                                    }\n");
      out.write("                                },\n");
      out.write("                                error: function () {\n");
      out.write("                                    showErrorModal('An error occurred while unbanning the user');\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("p");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.bookingList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <tr id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.bookingId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.roomId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.checkinDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.checkoutDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.bookingDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td class=\"price-format\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            </tr>\n");
          out.write("                                        ");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.bookingList.size() == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <tr class=\"text-center\"><td colspan=\"7\">Nothing to show here</td></tr>\n");
        out.write("                                        ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("p");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.userList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <tr>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                ");
          if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                                <td>\n");
          out.write("                                                    ");
          if (_jspx_meth_c_choose_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("        \n");
          out.write("                                                </td>\n");
          out.write("                                            </tr>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.roleID == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userLogin.id == p.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            <td>Admin</td>\n");
        out.write("                                                        ");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userLogin.id != p.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            <td><button class=\"btn btn-outline-dark admin-btn change-role\" data-user-id=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" data-role=\"1\">\n");
        out.write("                                                                    Admin\n");
        out.write("                                                                </button>\n");
        out.write("                                                            </td>\n");
        out.write("                                                        ");
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

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.roleID == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <td><button class=\"btn btn-outline-dark staff-btn change-role\" data-user-id=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" data-role=\"2\">\n");
        out.write("                                                                Staff</button>\n");
        out.write("                                                        </td>\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <td><button class=\"btn btn-outline-dark change-role\" data-user-id=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" data-role=\"3\">\n");
        out.write("                                                                Customer user</button>\n");
        out.write("                                                        </td>\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userLogin.id == p.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            <button class=\"btn btn-sm btn-warning change-password\" data-user-id=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" style=\"width: 168px\">\n");
        out.write("                                                                Change password\n");
        out.write("                                                            </button>\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.available == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            <button class=\"btn btn-sm btn-primary reset-password\" data-user-id=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" style=\"display: none\">\n");
        out.write("                                                                Reset password\n");
        out.write("                                                            </button>\n");
        out.write("                                                            <button class=\"btn btn-sm btn-danger remove-user banning\" data-user-id=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Unban</button>\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            <button class=\"btn btn-sm btn-primary reset-password\" data-user-id=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Reset password</button>\n");
        out.write("                                                            <button class=\"btn btn-sm btn-danger remove-user\" data-user-id=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Ban</button>\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }
}
