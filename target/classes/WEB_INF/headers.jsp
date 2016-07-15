<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.stream.Stream" %>
<%@page contentType="text/html; charset-UTF-8" language="java"%>
<html>
<head>
    <title>
        Hello World Sample
    </title>
</head>

<body>
<h1>
    HTTP Header Request Example
</h1>
<table width="100%" border="1" align="center">
    <tr>
        <th>Header name</th>
        <th>Header value</th>
    </tr>
    <%
        Enumeration<String> headers = request.getHeaderNames();
        while (headers.hasMoreElements()) {
            String headerName = headers.nextElement();
            String headerValue = request.getHeader(headerName);
            out.print("<tr><td>" + headerName +"</td>\n");
            out.println("<td>" + headerValue + "</td></tr>\n");
        }
    %>

</table>
</body>
</html>