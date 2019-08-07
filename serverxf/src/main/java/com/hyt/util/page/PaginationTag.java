package com.hyt.util.page;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * 分页标签处理类
 * <p>使用bootstrap样式</p>
 * @author rick
 * @version 1.1
 */
public class PaginationTag extends SimpleTagSupport {

	// 分页数据
	private Pagination pagination;
	// 查询表单id
	private String queryForm = "queryForm";

	// bootstrap分页样式类
	private String divClass = "pagination pull-right";

	public void doTag() throws JspException, IOException {
		StringBuffer strBuf = new StringBuffer();
		strBuf.append("<script type=\"text/javascript\">");

		//表单提交
		strBuf.append("var qForm = document.forms['").append(queryForm)
				.append("'];var hd = document.createElement('input'); hd.type='hidden'; hd.name='pageNo';").append("qForm.appendChild(hd);")
				.append("function toPage(pageNo){")
				.append("if(pageNo=='' || pageNo<=0){return;} qForm.pageNo.value=pageNo; qForm.submit();}</script>");

		strBuf.append("<ul class=\"").append(divClass).append("\">");

		// 页数
		strBuf.append("<li><a>(第").append(pagination.getPageNo()).append("/").append(pagination.getTotalPage()).append("页").append(" 共")
				.append(pagination.getTotal()).append("条)</a></li>");

		// 上一页
		if (pagination.getPageNo() == 1) {
			strBuf.append(" <li class=\"disabled\"><a>首页</a></li> ");
			strBuf.append(" <li class=\"disabled\"><a>").append(" 上一页 </a></li> ");
		} else {
			strBuf.append(" <li><a href=\"javascript:toPage(1)\">首页</a></li> ");
			strBuf.append(" <li><a href=\"javascript:toPage(").append(pagination.getPageNo() - 1).append(")\"> 上一页 </a></li> ");
		}

		// 列表项目
		for (int i = pagination.getStartIndex(); i <= pagination.getEndIndex(); i++) {
			if (pagination.getPageNo() == i) {
				strBuf.append("<li class=\"active\"><a>").append(i).append("</a></li>");
			} else {
				strBuf.append("<li><a href=\"javascript:toPage(").append(i).append(")\">").append(i).append("</a></li>");
			}
		}

		// 下一页
        // 总页数等于当前页 或者 总页数等于0
		if (pagination.getPageNo() == pagination.getTotalPage() || pagination.getTotalPage() <= 0) {
			strBuf.append(" <li class=\"disabled\"><a>").append(" 下一页 </a></li> ");
			strBuf.append(" <li class=\"disabled\"><a>末页</a></li> ");
		} else {
			strBuf.append(" <li><a href=\"javascript:toPage(").append(pagination.getPageNo() + 1).append(")\"> 下一页 </a></li> ");
			strBuf.append(" <li><a href=\"javascript:toPage(").append(pagination.getTotalPage()).append(")\">末页</a></li> ");
		}

		// 跳转
		if (pagination.getTotalPage() > 1) {
			strBuf.append("<style>.pagination a.jump{width: 100px;}"
					+ ".pagination input{width: 65%;height: 100%;position: absolute;left: 0px;top: 0px;border: none;text-align: center;}"
					+ ".pagination button{width: 35%;height: 100%;position: absolute;right: 0px;top: 0px;padding: 0px;font-size: 12px;border: none;border-left: solid 1px #ccc;}</style>");
			strBuf.append(
					"<li><a class=\"jump\">Jump<input type=\"text\" value=\"" + pagination.getPageNo() + "\" id=\"goPageNo\" class=\"form-control\" "
							+ "onkeyup=\"javascript:if(event.keyCode==13){toPage(document.getElementById('goPageNo').value)}\">"
							+ "<button class=\"form-control\" onclick=\"toPage(document.getElementById('goPageNo').value)\">GO</button></a></li>");
		}
		strBuf.append("</ul>");

		// System.out.println(strBuf.toString());
		JspContext ctx = getJspContext();
		JspWriter out = ctx.getOut();
		out.print(strBuf.toString());
	}

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public String getQueryForm() {
		return queryForm;
	}

	public void setQueryForm(String queryForm) {
		this.queryForm = queryForm;
	}

}
