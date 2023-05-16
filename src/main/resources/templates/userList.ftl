<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

freemarker 页面 userList.ftl，
<br/>
<br/>
<br/>
userList 的内容为：

<#--遍历传来的list中的各user-->
<P>
    <#list list as user>
        ${user}
        <#if user_has_next>
            ,<br/>
        </#if>
    </#list>
</P>

</body>
</html>