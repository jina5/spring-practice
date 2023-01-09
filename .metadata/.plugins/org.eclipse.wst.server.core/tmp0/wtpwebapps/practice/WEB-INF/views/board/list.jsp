<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/common/header.jsp"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<style>

    table {
        margin:auto;
        border-collapse: collapse;
        width:80%;
        margin-left:10%;
    }
    tr {
        border-bottom : 1px solid black;
    }
    th {
        padding: 20px;
        font-size: 20px;
    }
    .text-container{
        text-align:center;
    }

</style>
    <div class="text-container">
        <h1>✨ 게시판 ✨</h1>
    </div>
    <table>
       <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>파일</th>
        <th>날짜</th>
       </tr>
       <tr class="text-container">
        <td>dd</td>
        <td>dd</td>
        <td></td>
        <td><img src="./resource/file.png" style="width:30px"></td>
        <td></td>
       </tr>
    </table>

<jsp:include page="/WEB-INF/views/common/footer.jsp"/>