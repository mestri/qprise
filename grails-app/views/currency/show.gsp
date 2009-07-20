
<%@ page import="net.xioh.qprise.currency.Currency" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Show Currency</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${resource(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">Currency List</g:link></span>
            <span class="menuButton"><g:link class="create" action="create">New Currency</g:link></span>
        </div>
        <div class="body">
            <h1>Show Currency</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>

                    
                        <tr class="prop">
                            <td valign="top" class="name">Id:</td>
                            
                            <td valign="top" class="value">${fieldValue(bean:currencyInstance, field:'id')}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Costing Precision:</td>
                            
                            <td valign="top" class="value">${fieldValue(bean:currencyInstance, field:'costingPrecision')}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Cur Symbol:</td>
                            
                            <td valign="top" class="value">${fieldValue(bean:currencyInstance, field:'curSymbol')}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Description:</td>
                            
                            <td valign="top" class="value">${fieldValue(bean:currencyInstance, field:'description')}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Is Active:</td>
                            
                            <td valign="top" class="value">${fieldValue(bean:currencyInstance, field:'isActive')}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Is Symbo Right Side:</td>
                            
                            <td valign="top" class="value">${fieldValue(bean:currencyInstance, field:'isSymboRightSide')}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Iso Code:</td>
                            
                            <td valign="top" class="value">${fieldValue(bean:currencyInstance, field:'isoCode')}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Price Precision:</td>
                            
                            <td valign="top" class="value">${fieldValue(bean:currencyInstance, field:'pricePrecision')}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Std Precision:</td>
                            
                            <td valign="top" class="value">${fieldValue(bean:currencyInstance, field:'stdPrecision')}</td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <input type="hidden" name="id" value="${currencyInstance?.id}" />
                    <span class="button"><g:actionSubmit class="edit" value="Edit" /></span>
                    <span class="button"><g:actionSubmit class="delete" onclick="return confirm('Are you sure?');" value="Delete" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
