package org.apache.jsp.WEB_002dINF.decorators;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class authorizedDecorator_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_decorator_title_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_decorator_body_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_decorator_title_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_decorator_body_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_decorator_title_nobody.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_decorator_body_nobody.release();
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>");
      if (_jspx_meth_decorator_title_0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("    <link rel=\"icon\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("    <link href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <style>body {background-image: url(\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\");}</style>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-static-top\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"login\">\r\n");
      out.write("                <i class=\"fas fa-notes-medical\"></i>");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <li><a href=\"");
      if (_jspx_meth_c_url_11(_jspx_page_context))
        return;
      out.write("\">Patient</a></li>\r\n");
      out.write("                <li><a href=\"");
      if (_jspx_meth_c_url_12(_jspx_page_context))
        return;
      out.write("\">Medicine</a></li>\r\n");
      out.write("                <li><a href=\"");
      if (_jspx_meth_c_url_13(_jspx_page_context))
        return;
      out.write("\">Appointment</a></li>\r\n");
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <li><a href=\"");
      if (_jspx_meth_c_url_16(_jspx_page_context))
        return;
      out.write("\">Logout</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    ");
      if (_jspx_meth_decorator_body_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_decorator_title_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:title
    com.opensymphony.module.sitemesh.taglib.decorator.TitleTag _jspx_th_decorator_title_0 = (com.opensymphony.module.sitemesh.taglib.decorator.TitleTag) _jspx_tagPool_decorator_title_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.TitleTag.class);
    _jspx_th_decorator_title_0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_title_0.setParent(null);
    int _jspx_eval_decorator_title_0 = _jspx_th_decorator_title_0.doStartTag();
    if (_jspx_th_decorator_title_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_decorator_title_nobody.reuse(_jspx_th_decorator_title_0);
      return true;
    }
    _jspx_tagPool_decorator_title_nobody.reuse(_jspx_th_decorator_title_0);
    return false;
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/assets/images/plus.ico");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/assets/css/bootstrap.min.css");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/assets/css/dataTables.bootstrap.min.css");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/assets/css/fontawesome-all.min.css");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/assets/css/style.css");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("/assets/webfonts/lora.css");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("/assets/images/appointment.jpg");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_c_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_7.setPageContext(_jspx_page_context);
    _jspx_th_c_url_7.setParent(null);
    _jspx_th_c_url_7.setValue("/assets/js/jquery-3.3.1.min.js");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }

  private boolean _jspx_meth_c_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_8.setPageContext(_jspx_page_context);
    _jspx_th_c_url_8.setParent(null);
    _jspx_th_c_url_8.setValue("/assets/js/bootstrap.min.js");
    int _jspx_eval_c_url_8 = _jspx_th_c_url_8.doStartTag();
    if (_jspx_th_c_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
    return false;
  }

  private boolean _jspx_meth_c_url_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_9.setPageContext(_jspx_page_context);
    _jspx_th_c_url_9.setParent(null);
    _jspx_th_c_url_9.setValue("/assets/js/script.js");
    int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
    if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("label.title");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isDoctor}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <li><a href=\"");
        if (_jspx_meth_c_url_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\">Prescription</a></li>\r\n");
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

  private boolean _jspx_meth_c_url_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_10.setPageContext(_jspx_page_context);
    _jspx_th_c_url_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_url_10.setValue("/prescription");
    int _jspx_eval_c_url_10 = _jspx_th_c_url_10.doStartTag();
    if (_jspx_th_c_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
    return false;
  }

  private boolean _jspx_meth_c_url_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_11.setPageContext(_jspx_page_context);
    _jspx_th_c_url_11.setParent(null);
    _jspx_th_c_url_11.setValue("/patient");
    int _jspx_eval_c_url_11 = _jspx_th_c_url_11.doStartTag();
    if (_jspx_th_c_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
    return false;
  }

  private boolean _jspx_meth_c_url_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_12.setPageContext(_jspx_page_context);
    _jspx_th_c_url_12.setParent(null);
    _jspx_th_c_url_12.setValue("/medicine");
    int _jspx_eval_c_url_12 = _jspx_th_c_url_12.doStartTag();
    if (_jspx_th_c_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
    return false;
  }

  private boolean _jspx_meth_c_url_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_13.setPageContext(_jspx_page_context);
    _jspx_th_c_url_13.setParent(null);
    _jspx_th_c_url_13.setValue("/appointment");
    int _jspx_eval_c_url_13 = _jspx_th_c_url_13.doStartTag();
    if (_jspx_th_c_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not isDoctor}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <li><a href=\"");
        if (_jspx_meth_c_url_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\">Doctor</a></li>\r\n");
        out.write("                    <li><a href=\"");
        if (_jspx_meth_c_url_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\">Admin</a></li>\r\n");
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

  private boolean _jspx_meth_c_url_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_14 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_14.setPageContext(_jspx_page_context);
    _jspx_th_c_url_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_url_14.setValue("/doctor");
    int _jspx_eval_c_url_14 = _jspx_th_c_url_14.doStartTag();
    if (_jspx_th_c_url_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
    return false;
  }

  private boolean _jspx_meth_c_url_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_15 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_15.setPageContext(_jspx_page_context);
    _jspx_th_c_url_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_url_15.setValue("/admin");
    int _jspx_eval_c_url_15 = _jspx_th_c_url_15.doStartTag();
    if (_jspx_th_c_url_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
    return false;
  }

  private boolean _jspx_meth_c_url_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_16 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_16.setPageContext(_jspx_page_context);
    _jspx_th_c_url_16.setParent(null);
    _jspx_th_c_url_16.setValue("/logout");
    int _jspx_eval_c_url_16 = _jspx_th_c_url_16.doStartTag();
    if (_jspx_th_c_url_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
    return false;
  }

  private boolean _jspx_meth_decorator_body_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_decorator_body_0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _jspx_tagPool_decorator_body_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    _jspx_th_decorator_body_0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_body_0.setParent(null);
    int _jspx_eval_decorator_body_0 = _jspx_th_decorator_body_0.doStartTag();
    if (_jspx_th_decorator_body_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_decorator_body_nobody.reuse(_jspx_th_decorator_body_0);
      return true;
    }
    _jspx_tagPool_decorator_body_nobody.reuse(_jspx_th_decorator_body_0);
    return false;
  }
}
