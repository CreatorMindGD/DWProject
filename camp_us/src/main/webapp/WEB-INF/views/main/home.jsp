<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>내 정보</title></head>
<body>
    <h2>로그인한 사용자 정보</h2>
    <p>아이디: ${member.mem_id}</p>
    <p>이메일: ${member.mem_email}</p>
    
    <form action="${pageContext.request.contextPath}/logout" method="post">
        <button type="submit">로그아웃</button>
    </form>
    
    <c:if test="${param.logout eq 'true'}">
    <script>
        alert("로그아웃되었습니다.");
    </script>
    </c:if>
</body>
</html>