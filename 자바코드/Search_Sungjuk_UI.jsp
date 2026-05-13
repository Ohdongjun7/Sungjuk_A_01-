<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="sungjuck.*" %> <!-- 위에서 작성한 Java 클래스 패키지 가정 -->

<%
    // 1. 파라미터 수집 (Boundary -> Controller 역할)
    String profId = request.getParameter("profId");
    String studentId = request.getParameter("studentId");
    int java = Integer.parseInt(request.getParameter("java"));
    int db = Integer.parseInt(request.getParameter("db"));
    int security = Integer.parseInt(request.getParameter("security"));

    // 2. 객체 생성
    교수 professor = new 교수(profId);
    성적 score = new 성적();
    
    String message = "";
    String gradeResult = "";
    boolean isSuccess = false;

    // 3. 비즈니스 로직 수행 (Sequence Diagram 흐름)
    if (professor.교수체크(profId)) {
        // 교수 인증 성공
        score.성적입력(profId, studentId, java, db, security);
        gradeResult = score.학점조회(profId);
        isSuccess = true;
    } else {
        // 교수 인증 실패
        message = "교수 ID를 확인하세요. (인증 실패)";
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>처리 결과</title>
</head>
<body>
    <h2>처리 결과</h2>
    <hr>
    <% if (isSuccess) { %>
        <div style="color: blue;">
            <p><strong>인증 성공:</strong> 교수님 환영합니다.</p>
            <p>학생 ID: <%= studentId %></p>
            <p>총점: <%= score.get총점() %>점 / 평균: <%= String.format("%.2f", score.get평균()) %>점</p>
            <h3>최종 학점: <%= gradeResult %></h3>
        </div>
    <% } else { %>
        <div style="color: red;">
            <p><%= message %></p>
            <button onclick="history.back()">뒤로 가기</button>
        </div>
    <% } %>
    <br>
    <a href="Add_Sungjuk_UI.jsp">성적 입력 전용 페이지로 이동</a>
</body>
</html>