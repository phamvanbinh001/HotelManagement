package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
