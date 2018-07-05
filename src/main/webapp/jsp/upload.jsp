<%--
  Created by IntelliJ IDEA.
  User: caoyang
  Date: 18/7/5
  Time: 下午4:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>

<div style="text-align: center; vertical-align: center;">
    <form action="/upload" enctype="multipart/form-data" method="post">
        <table>
            <tr>
                <td>请选择文件：</td>
                <td><input type="file" name="file"></td>
            </tr>
            <tr>
                <td>开始上传</td>
                <td><input type="submit" value="上传"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
