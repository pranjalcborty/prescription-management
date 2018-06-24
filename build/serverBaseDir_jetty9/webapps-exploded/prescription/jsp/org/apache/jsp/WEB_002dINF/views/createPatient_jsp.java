package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createPatient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_errors_path_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_textarea_type_path_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_modelAttribute_method;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_type_placeholder_path_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_type_path_disabled_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_type_path_class_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_errors_path_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_textarea_type_path_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_modelAttribute_method = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_type_placeholder_path_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_type_path_disabled_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_type_path_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_errors_path_class_nobody.release();
    _jspx_tagPool_form_textarea_type_path_class_nobody.release();
    _jspx_tagPool_form_form_modelAttribute_method.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_form_input_type_placeholder_path_class_nobody.release();
    _jspx_tagPool_form_input_type_path_disabled_class_nobody.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_form_input_type_path_class_nobody.release();
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
      out.write("    <title>Patient</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"jumbotron\">\r\n");
      out.write("    ");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_modelAttribute_method.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_form_0.setPageContext(_jspx_page_context);
      _jspx_th_form_form_0.setParent(null);
      _jspx_th_form_form_0.setModelAttribute("patient");
      _jspx_th_form_form_0.setMethod("post");
      int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
      try {
        int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
        if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("        <input type=\"hidden\" name=\"id\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${patient.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("        <div class=\"row\">\r\n");
            out.write("            <div class=\"col-xs-6\">\r\n");
            out.write("                <div class=\"form-group\">\r\n");
            out.write("                    <label>");
            if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("</label>\r\n");
            out.write("                    ");
            if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("                    ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_0.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_0.setPath("name");
            _jspx_th_form_errors_0.setDynamicAttribute(null, "class", new String("error"));
            int[] _jspx_push_body_count_form_errors_0 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_0 = _jspx_th_form_errors_0.doStartTag();
              if (_jspx_th_form_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_0.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_0);
            }
            out.write("\r\n");
            out.write("                </div>\r\n");
            out.write("\r\n");
            out.write("                <div class=\"form-group\">\r\n");
            out.write("                    <label>");
            if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("</label>\r\n");
            out.write("                    ");
            if (_jspx_meth_form_textarea_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("                    ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_1.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_1.setPath("address");
            _jspx_th_form_errors_1.setDynamicAttribute(null, "class", new String("error"));
            int[] _jspx_push_body_count_form_errors_1 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_1 = _jspx_th_form_errors_1.doStartTag();
              if (_jspx_th_form_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_1.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_1);
            }
            out.write("\r\n");
            out.write("                </div>\r\n");
            out.write("\r\n");
            out.write("                <div class=\"row\">\r\n");
            out.write("                    <div class=\"col-xs-6\">\r\n");
            out.write("                        <div class=\"form-group\">\r\n");
            out.write("                            <label>");
            if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("</label>\r\n");
            out.write("                            ");
            if (_jspx_meth_form_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("                            ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_2.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_2.setPath("dateOfBirth");
            _jspx_th_form_errors_2.setDynamicAttribute(null, "class", new String("error"));
            int[] _jspx_push_body_count_form_errors_2 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_2 = _jspx_th_form_errors_2.doStartTag();
              if (_jspx_th_form_errors_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_2.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_2);
            }
            out.write("\r\n");
            out.write("                        </div>\r\n");
            out.write("                    </div>\r\n");
            out.write("                    <div class=\"col-xs-6\">\r\n");
            out.write("                        <div class=\"form-group\">\r\n");
            out.write("                            <label>");
            if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("</label>\r\n");
            out.write("                            ");
            if (_jspx_meth_form_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("                            ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_3.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_3.setPath("sex");
            _jspx_th_form_errors_3.setDynamicAttribute(null, "class", new String("error"));
            int[] _jspx_push_body_count_form_errors_3 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_3 = _jspx_th_form_errors_3.doStartTag();
              if (_jspx_th_form_errors_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_3[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_3.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_3.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_3);
            }
            out.write("\r\n");
            out.write("                        </div>\r\n");
            out.write("                    </div>\r\n");
            out.write("                </div>\r\n");
            out.write("\r\n");
            out.write("                <div class=\"form-group\">\r\n");
            out.write("                    <label>");
            if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("</label>\r\n");
            out.write("                    ");
            if (_jspx_meth_form_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("                    ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_4 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_4.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_4.setPath("phone");
            _jspx_th_form_errors_4.setDynamicAttribute(null, "class", new String("error"));
            int[] _jspx_push_body_count_form_errors_4 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_4 = _jspx_th_form_errors_4.doStartTag();
              if (_jspx_th_form_errors_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_4[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_4.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_4.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_4);
            }
            out.write("\r\n");
            out.write("                </div>\r\n");
            out.write("            </div>\r\n");
            out.write("            <div class=\"col-xs-6\">\r\n");
            out.write("                <div class=\"row\">\r\n");
            out.write("                    <div class=\"col-xs-6\">\r\n");
            out.write("                        <div class=\"form-group\">\r\n");
            out.write("                            <label>");
            if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("</label>\r\n");
            out.write("                            ");
            if (_jspx_meth_form_input_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("                            ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_5 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_5.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_5.setPath("regNum");
            _jspx_th_form_errors_5.setDynamicAttribute(null, "class", new String("error"));
            int[] _jspx_push_body_count_form_errors_5 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_5 = _jspx_th_form_errors_5.doStartTag();
              if (_jspx_th_form_errors_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_5[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_5.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_5.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_5);
            }
            out.write("\r\n");
            out.write("                        </div>\r\n");
            out.write("                        <div class=\"form-group\">\r\n");
            out.write("                            <label>");
            if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("</label>\r\n");
            out.write("                            ");
            if (_jspx_meth_form_input_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("                            ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_6 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_6.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_6.setPath("regDate");
            _jspx_th_form_errors_6.setDynamicAttribute(null, "class", new String("error"));
            int[] _jspx_push_body_count_form_errors_6 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_6 = _jspx_th_form_errors_6.doStartTag();
              if (_jspx_th_form_errors_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_6[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_6.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_6.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_6);
            }
            out.write("\r\n");
            out.write("                        </div>\r\n");
            out.write("                        <div class=\"form-group\">\r\n");
            out.write("                            <label>");
            if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("</label>\r\n");
            out.write("                            ");
            if (_jspx_meth_form_input_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("                            ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_7 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_7.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_7.setPath("regFee");
            _jspx_th_form_errors_7.setDynamicAttribute(null, "class", new String("error"));
            int[] _jspx_push_body_count_form_errors_7 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_7 = _jspx_th_form_errors_7.doStartTag();
              if (_jspx_th_form_errors_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_7[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_7.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_7.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_7);
            }
            out.write("\r\n");
            out.write("                        </div>\r\n");
            out.write("                    </div>\r\n");
            out.write("                    <div class=\"row\">\r\n");
            out.write("                        <div class=\"col-xs-6\">\r\n");
            out.write("                            <div class=\"form-group\">\r\n");
            out.write("                                <label>");
            if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("</label>\r\n");
            out.write("                                ");
            if (_jspx_meth_form_input_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("                                ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_8 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_8.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_8.setPath("bloodGroup");
            _jspx_th_form_errors_8.setDynamicAttribute(null, "class", new String("error"));
            int[] _jspx_push_body_count_form_errors_8 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_8 = _jspx_th_form_errors_8.doStartTag();
              if (_jspx_th_form_errors_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_8[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_8.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_8.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_8);
            }
            out.write("\r\n");
            out.write("                            </div>\r\n");
            out.write("                        </div>\r\n");
            out.write("                        <div class=\"col-xs-6\">\r\n");
            out.write("                            <div class=\"form-group\">\r\n");
            out.write("                                <label>");
            if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("</label>\r\n");
            out.write("                                ");
            if (_jspx_meth_form_input_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("                                ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_9 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_9.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_9.setPath("religion");
            _jspx_th_form_errors_9.setDynamicAttribute(null, "class", new String("error"));
            int[] _jspx_push_body_count_form_errors_9 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_9 = _jspx_th_form_errors_9.doStartTag();
              if (_jspx_th_form_errors_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_9[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_9.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_9.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_9);
            }
            out.write("\r\n");
            out.write("                            </div>\r\n");
            out.write("                        </div>\r\n");
            out.write("                    </div>\r\n");
            out.write("                </div>\r\n");
            out.write("                <div class=\"row\">\r\n");
            out.write("                    <div class=\"col-xs-12\">\r\n");
            out.write("                        <div class=\"form-group\">\r\n");
            out.write("                            <label>");
            if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("</label>\r\n");
            out.write("                            ");
            if (_jspx_meth_form_input_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\r\n");
            out.write("                            ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_10 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_10.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_10.setPath("remarks");
            _jspx_th_form_errors_10.setDynamicAttribute(null, "class", new String("error"));
            int[] _jspx_push_body_count_form_errors_10 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_10 = _jspx_th_form_errors_10.doStartTag();
              if (_jspx_th_form_errors_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_10[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_10.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_10.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_10);
            }
            out.write("\r\n");
            out.write("                        </div>\r\n");
            out.write("                    </div>\r\n");
            out.write("                </div>\r\n");
            out.write("            </div>\r\n");
            out.write("        </div>\r\n");
            out.write("        <div class=\"row\">\r\n");
            out.write("            <div class=\"pull-right\">\r\n");
            out.write("                <button type=\"submit\" class=\"btn btn-success\">\r\n");
            out.write("                    <i class=\"fas fa-save\"></i> Save Patient</button>\r\n");
            out.write("            </div>\r\n");
            out.write("        </div>\r\n");
            out.write("    ");
            int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_form_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_form_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_form_0.doFinally();
        _jspx_tagPool_form_form_modelAttribute_method.reuse(_jspx_th_form_form_0);
      }
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        \"use strict\";\r\n");
      out.write("\r\n");
      out.write("        $(\".date\").datepicker({\r\n");
      out.write("            format: \"dd/mm/yyyy\",\r\n");
      out.write("            todayHighlight: true,\r\n");
      out.write("            autoclose: true\r\n");
      out.write("        });\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_fmt_message_0.setKey("label.name");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_0.setPath("name");
    _jspx_th_form_input_0.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_0.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_0 = _jspx_th_form_input_0.doStartTag();
      if (_jspx_th_form_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_0.doFinally();
      _jspx_tagPool_form_input_type_path_class_nobody.reuse(_jspx_th_form_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_fmt_message_1.setKey("label.address");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_form_textarea_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_textarea_0 = (org.springframework.web.servlet.tags.form.TextareaTag) _jspx_tagPool_form_textarea_type_path_class_nobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_textarea_0.setPageContext(_jspx_page_context);
    _jspx_th_form_textarea_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_textarea_0.setPath("address");
    _jspx_th_form_textarea_0.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_textarea_0.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_textarea_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_textarea_0 = _jspx_th_form_textarea_0.doStartTag();
      if (_jspx_th_form_textarea_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_textarea_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_textarea_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_textarea_0.doFinally();
      _jspx_tagPool_form_textarea_type_path_class_nobody.reuse(_jspx_th_form_textarea_0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_fmt_message_2.setKey("label.dob");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_form_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_placeholder_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_1.setPageContext(_jspx_page_context);
    _jspx_th_form_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_1.setPath("dateOfBirth");
    _jspx_th_form_input_1.setDynamicAttribute(null, "placeholder", new String("dd/MM/yyyy (eg. 31/05/1950)"));
    _jspx_th_form_input_1.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_1.setDynamicAttribute(null, "class", new String("form-control date"));
    int[] _jspx_push_body_count_form_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_1 = _jspx_th_form_input_1.doStartTag();
      if (_jspx_th_form_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_1.doFinally();
      _jspx_tagPool_form_input_type_placeholder_path_class_nobody.reuse(_jspx_th_form_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_fmt_message_3.setKey("label.gender");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_form_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_2.setPageContext(_jspx_page_context);
    _jspx_th_form_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_2.setPath("sex");
    _jspx_th_form_input_2.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_2.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_input_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_2 = _jspx_th_form_input_2.doStartTag();
      if (_jspx_th_form_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_2.doFinally();
      _jspx_tagPool_form_input_type_path_class_nobody.reuse(_jspx_th_form_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_fmt_message_4.setKey("label.phone");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_form_input_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_3 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_3.setPageContext(_jspx_page_context);
    _jspx_th_form_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_3.setPath("phone");
    _jspx_th_form_input_3.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_3.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_input_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_3 = _jspx_th_form_input_3.doStartTag();
      if (_jspx_th_form_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_3.doFinally();
      _jspx_tagPool_form_input_type_path_class_nobody.reuse(_jspx_th_form_input_3);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_fmt_message_5.setKey("label.regNum");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_form_input_4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_4 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_path_disabled_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_4.setPageContext(_jspx_page_context);
    _jspx_th_form_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_4.setDisabled(true);
    _jspx_th_form_input_4.setPath("regNum");
    _jspx_th_form_input_4.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_4.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_input_4 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_4 = _jspx_th_form_input_4.doStartTag();
      if (_jspx_th_form_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_4.doFinally();
      _jspx_tagPool_form_input_type_path_disabled_class_nobody.reuse(_jspx_th_form_input_4);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_fmt_message_6.setKey("label.regDate");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_form_input_5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_5 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_placeholder_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_5.setPageContext(_jspx_page_context);
    _jspx_th_form_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_5.setPath("regDate");
    _jspx_th_form_input_5.setDynamicAttribute(null, "placeholder", new String("dd/MM/yyyy (eg. 31/05/1950)"));
    _jspx_th_form_input_5.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_5.setDynamicAttribute(null, "class", new String("form-control date"));
    int[] _jspx_push_body_count_form_input_5 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_5 = _jspx_th_form_input_5.doStartTag();
      if (_jspx_th_form_input_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_5.doFinally();
      _jspx_tagPool_form_input_type_placeholder_path_class_nobody.reuse(_jspx_th_form_input_5);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_fmt_message_7.setKey("label.regFee");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_form_input_6(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_6 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_6.setPageContext(_jspx_page_context);
    _jspx_th_form_input_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_6.setPath("regFee");
    _jspx_th_form_input_6.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_6.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_input_6 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_6 = _jspx_th_form_input_6.doStartTag();
      if (_jspx_th_form_input_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_6.doFinally();
      _jspx_tagPool_form_input_type_path_class_nobody.reuse(_jspx_th_form_input_6);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_message_8 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_message_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_fmt_message_8.setKey("label.bg");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }

  private boolean _jspx_meth_form_input_7(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_7 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_7.setPageContext(_jspx_page_context);
    _jspx_th_form_input_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_7.setPath("bloodGroup");
    _jspx_th_form_input_7.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_7.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_input_7 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_7 = _jspx_th_form_input_7.doStartTag();
      if (_jspx_th_form_input_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_7.doFinally();
      _jspx_tagPool_form_input_type_path_class_nobody.reuse(_jspx_th_form_input_7);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_fmt_message_9.setKey("label.religion");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_form_input_8(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_8 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_8.setPageContext(_jspx_page_context);
    _jspx_th_form_input_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_8.setPath("religion");
    _jspx_th_form_input_8.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_8.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_input_8 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_8 = _jspx_th_form_input_8.doStartTag();
      if (_jspx_th_form_input_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_8.doFinally();
      _jspx_tagPool_form_input_type_path_class_nobody.reuse(_jspx_th_form_input_8);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_message_10(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_fmt_message_10.setKey("label.remarks");
    int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
    if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
    return false;
  }

  private boolean _jspx_meth_form_input_9(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_9 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_9.setPageContext(_jspx_page_context);
    _jspx_th_form_input_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_9.setPath("remarks");
    _jspx_th_form_input_9.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_9.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_input_9 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_9 = _jspx_th_form_input_9.doStartTag();
      if (_jspx_th_form_input_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_9.doFinally();
      _jspx_tagPool_form_input_type_path_class_nobody.reuse(_jspx_th_form_input_9);
    }
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
    _jspx_th_c_url_0.setValue("/assets/css/bootstrap-datepicker3.css");
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
    _jspx_th_c_url_1.setValue("/assets/js/bootstrap-datepicker.min.js");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }
}
