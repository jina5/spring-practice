<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.6.3.min.js"
    integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
    crossorigin="anonymous"></script>

<style>
button {
    font-size: 50px;
    display: block;
    margin: auto;
    width: 200px;
    padding: 10px;
    margin-bottom: 10px;
    background-color: antiquewhite;
}
</style>
<script>
    function moveMember(url) {
        var uri = '${path}/member/'+url;
        location.href = uri;
    }

    function moveBoard(url) {
        var uri = '${path}/board/'+url;
        location.href = uri;
    }

    function moveHome() {
        var uri = '${path}';
        location.href = uri;
    }
</script>
<body>
<!-- scope 범위 : context(application / session / request/ page -->
<!--  context : 서버 전체에서 사용하는 변수 등 (브라우저 꺼도 유지) -->
<!--  session : 브라우저 상에서 사용되는 변수 등 (브라우저 끄면 유지x) -->
<!--  request : 요청시에 사용되는거  -->
<!--  page 안에서만 사용되는거  -->
    <c:if test="${loginMember == null  }"> <!-- controller에서 session에 저장해둔.. session.setAttribute("loginMember", loginMember); -->
    <button onclick="moveMember('login.do')">Login</button>
    <button onclick="moveMember('join.do')">Join</button>
    </c:if>
    
    <c:if test="${loginMember != null }">
    <button onclick="moveMember('update.do')">UpdateMember</button>
    <button onclick="moveMember('logout.do')">Logout</button>
    </c:if>
    
    
    <button onclick="moveBoard('list.do')">Board</button>
    <button onclick="moveHome()">Home</button>
</body>
</html>