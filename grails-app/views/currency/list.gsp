
<%@ page import="net.xioh.qprise.currency.Currency" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Currency List</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${resource(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="create" action="create">New Currency</g:link></span>
        </div>
        <div class="body">
            <h1>Moneda</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
				<gui:dataTable
				controller="currency" action="myDataTableJSON"
				columnDefs="[
				[key:'id', label:'ID', sortable: true, resizeable: true],
				[key:'description', label:'Nombre', sortable: true, resizeable: true]
				]"
				rowClickNavigation='true'
				/>

            </div>
        </div>
    </body>
</html>
