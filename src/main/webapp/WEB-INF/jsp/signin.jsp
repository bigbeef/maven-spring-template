<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<h2>This is login.jsp file.</h2>
<!--modelAttribute接受model中的key为user的对象-->
<form:form action="signin" modelAttribute="account" method="post">
    <table>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Phone:</td>
            <td><form:input path="phone"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="signin"/>
            </td>
        </tr>
    </table>
</form:form>
</html>