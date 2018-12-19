<!DOCTYPE html>
<html>
<head lang="en">
    <title>Spring Boot Demo - FreeMarker</title>
    <link href="/css/index.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/js/index.js"></script>
</head>
<body>

<h2>首页<h2>

    <#assign contextPath="${rc.contextPath}">
    <div>两个contextPath:${contextPath}，${springMacroRequestContext.contextPath},</div>
    <div>一个requestURI:${springMacroRequestContext.requestUri}</div>


    <div>
        <#list userList as item>
            ${item!}<br />
        </#list>
    </div>

    <button id="a"> click me </button>
</body>
</html>