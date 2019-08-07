<html>
<head>
    <meta charset="utf-8">
    <title></title>
</head>

<body>
<div>
    <table>
        <thead>
        <tr>
            <th>序号</th>
            <th>姓名</th>
            <th>上级</th>
        </tr>
        </thead>
        <tbody>
            <#if pagination.list?exists>
                <#list pagination.list as list>

                    <tr>
                        <td>${list_index+1}</td>
                        <td>${list.username}</td>
                        <td>${list.pId}</td>
                    </tr>

                </#list>
            </#if>
        </tbody>
    </table>
</div>
</body>
</html>
