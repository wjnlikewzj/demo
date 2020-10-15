<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息列表</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">
	table{
		border-collapse: collapse;
		text-align: center;
		font-size: 22px;
	}
</style>

</head>
<body>
	<a href="UserAdd.jsp">添加</a>
	<a href="upload.jsp">文件上传</a>
	<table id="tab" border="2px" bordercolor="yellow">
		<tr>
			<td>id</td>
			<td>账号</td>
			<td>密码</td>
			<td>余额</td>
			<td>操作</td>
		</tr>
		
		<c:forEach items="${pageInfo.list}" var="user">
			<tr>
			<td>${user.id }</td>
			<td>${user.name }</td>
			<td>${user.password }</td>
			<td>${user.money }</td>
			<td>
				<a href="delete?id=${user.id }">删除</a>
				<a href="selectById?id=${user.id}">修改</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	
	<a href="show?n=1">首页</a>
	<a href="show?n=${pageInfo.prePage}">上一页</a>
	<c:forEach items="${pageInfo.navigatepageNums}" var="a">
		<a href="show?n=${a}">${a}</a>
	</c:forEach>
	<a href="show?n=${pageInfo.nextPage}">下一页</a>
	<a href="show?n=${pageInfo.pages}">尾页</a>
	共${pageInfo.total}条数据，共${pageInfo.pages}页，当前为${pageInfo.pageNum}页
</body>
</html>