<html>
<head>
    <title>HCRM创建测试数据工具</title>
    <script src="${request.contextPath}/static/js/jquery-1.11.1.min.js"></script>
    <link href="${request.contextPath}/static/css/style.css" rel="stylesheet" type="text/css"/>
    <style type="text/css">
        .pageDetail {
            display: none;
        }

        .show {
            display: table-row;
        }
    </style>
    <script>
        $(function () {
            $('#list').click(function () {
                $('.pageDetail').toggleClass('show');
            });
        });

    </script>
</head>
<body>
<div class="wrapper">
    <div class="middle">
        <h1 style="padding: 50px 0 20px;">国家(地区)列表</h1>

        <form action="${request.contextPath}/countries" method="post">
            <table class="gridtable" style="width:100%;">
                <tr>
                    <th>请输入表名称：</th>
                    <td><input type="text" name="maintable"
                               value="<#if queryParam.mainTable??>${queryParam.mainTable!''}</#if>"/></td>
                    <th>请输入关联表名称：</th>
                    <td><input type="text" name="subtable"
                               value="<#if queryParam.subTable??>${queryParam.subTable!''}</#if>"/></td>
                    <th>请输入关联主键：</th>
                    <td><input type="text" name="relKey"
                               value="<#if queryParam.relKey??>${queryParam.relKey!''}</#if>"/></td>
                    <th>创建数据条数：</th>
                    <td><input type="text" name="rows"
                               value="<#if queryParam.rows??>${queryParam.rows!''}</#if>"/></td>
                    <td rowspan="2"><input type="submit" value="创建数据"/></td>
                </tr>
                <tr>
                    <th>页码：</th>
                    <td><input type="text" name="page" value="${page!0}"/></td>
                    <th>页面大小：</th>
                    <td><input type="text" name="rows" value="${rows!10}"/></td>
                </tr>
            </table>
        </form>
    </div>
    <div class="push"></div>
</div>
</body>
</html>