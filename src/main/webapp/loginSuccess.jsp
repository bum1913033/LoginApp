<%--<%@ page isELIgnored="false" %>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="components/header.jsp"%>

<c:if test="${firstName==null}">
    <c:redirect url="/login" />
</c:if>

<div class="main">
    <p class="sign" align="center">Welcome to Login App,</p>
    <p class="sign" align="center"><c:out value="${firstName}"/> <c:out value="${lastName}"/></p>
    <br>
    <br>
    <a href="${pageContext.request.contextPath}/logout" class="submit">Logout</a>
</div>



<%@include file="components/footer.jsp"%>
