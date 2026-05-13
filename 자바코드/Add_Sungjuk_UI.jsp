<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>성적 관리 시스템 - 성적 입력</title>
</head>
<body>
    <h2>[성적 입력] Add_Sungjuk_UI</h2>
    <hr>
    <form action="Search_Sungjuk_UI.jsp" method="post">
        <table>
            <tr><td>교수 ID:</td><td><input type="hidden" name="profId" value="inha" required>inha</td></tr> 
            <tr><td>학생 ID:</td><td><input type="hidden" name="studentId" value="202245020" required> 202245020</td></tr>
            <tr><td>자바 점수:</td><td><input type="hidden" name="java" min="0" max="100" value=80> 80</td></tr>
            <tr><td>DB 점수:</td><td><input type="hidden" name="db" min="0" max="100" value=80> 80</td></tr>
            <tr><td>보안 점수:</td><td><input type="hidden" name="security" min="0" max="100" value=80>80 </td></tr>
        </table>
        <br>
        <input type="submit" value="성적 등록 및 학점 확인">
    </form>
</body>
</html>