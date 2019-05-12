package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://jqueryvalidation.org/files/demo/site-demos.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write(" <body class=\"form\" >\n");
      out.write("\t<div class=\"page\">\n");
      out.write("\t\t<div class=\"form-content\">\n");
      out.write("\t\t<div class=\"form-left\">\n");
      out.write("\t\t\t<h2>INFORMATION</h2>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"text-1\">Get the full-time part-time jobs , hundreds of people getting job everyday . sign up now and get you dream job and upload your resume after sign up you will notify if anyone want to hire you.</p>\n");
      out.write("\t\t\t\t<p class=\"text-2\"><span>Premium:</span> Get our premium account you will be listed on the top when recruiter will search job with your skills.</p>\n");
      out.write("\t\t\t\t<div class=\"form-left-last\">\n");
      out.write("                                    <input type=\"submit\" name=\"account\" class=\"account\" value=\"Have An Account\" onclick=\"indexx.jsp\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<form action=\"Savesign\" method=\"post\" class=\"form-detail\"   id=\"myform\">\n");
      out.write("\t\t<center><h2>SIGN-UP</h2></center>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<div class=\"form-row form-row-1\">\n");
      out.write("\t\t\t\t\t<label for=\"first_name\">First Name</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"first_name\" id=\"first_name\" class=\"input-text\" required >\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-row form-row-1\">\n");
      out.write("\t\t\t\t\t<label for=\"last_name\">Last Name</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"last_name\" id=\"last_name\" class=\"input-text\" required>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t<label for=\"your_email\">Your Email</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"your_email\" id=\"your_email\" class=\"input-text\"  required pattern=\"[^@]+@[^@]+.[a-zA-Z]{2,6}\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<div class=\"form-row form-row-1 \">\n");
      out.write("\t\t\t\t\t\t<label for=\"password\">Password</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"password\" id=\"password\"  class=\"input-text\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-row form-row-1\">\n");
      out.write("\t\t\t\t\t\t<label for=\"comfirm-password\">Comfirm Password</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"comfirm_password\" id=\"comfirm_password\"  class=\"input-text\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                \t\t<div class=\"form-checkbox\">\n");
      out.write("\t\t\t\t\t<label class=\"container\"><p>I agree to the <a href=\"#\" class=\"text\">Terms and Conditions</a></p>\n");
      out.write("\t\t\t\t\t  \t<input type=\"checkbox\" name=\"checkbox\">\n");
      out.write("\t\t\t\t\t  \t<span class=\"checkmark\"></span>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-row-last\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"register\" class=\"register\" value=\"Register\" >\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                </form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
}
