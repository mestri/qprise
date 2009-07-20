
<%@ page import="net.xioh.qprise.currency.Currency" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Create Currency</title>         
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${resource(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">Currency List</g:link></span>
        </div>
        <div class="body">
            <h1>Create Currency</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${currencyInstance}">
            <div class="errors">
                <g:renderErrors bean="${currencyInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="costingPrecision">Costing Precision:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:currencyInstance,field:'costingPrecision','errors')}">
                                    <input type="text" id="costingPrecision" name="costingPrecision" value="${fieldValue(bean:currencyInstance,field:'costingPrecision')}" />
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="curSymbol">Cur Symbol:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:currencyInstance,field:'curSymbol','errors')}">
                                    <input type="text" id="curSymbol" name="curSymbol" value="${fieldValue(bean:currencyInstance,field:'curSymbol')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="description">Description:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:currencyInstance,field:'description','errors')}">
                                    <input type="text" id="description" name="description" value="${fieldValue(bean:currencyInstance,field:'description')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="isActive">Is Active:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:currencyInstance,field:'isActive','errors')}">
                                    <g:checkBox name="isActive" value="${currencyInstance?.isActive}" ></g:checkBox>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="isSymboRightSide">Is Symbo Right Side:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:currencyInstance,field:'isSymboRightSide','errors')}">
                                    <g:checkBox name="isSymboRightSide" value="${currencyInstance?.isSymboRightSide}" ></g:checkBox>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="isoCode">Iso Code:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:currencyInstance,field:'isoCode','errors')}">
                                    <input type="text" id="isoCode" name="isoCode" value="${fieldValue(bean:currencyInstance,field:'isoCode')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="pricePrecision">Price Precision:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:currencyInstance,field:'pricePrecision','errors')}">
                                    <input type="text" id="pricePrecision" name="pricePrecision" value="${fieldValue(bean:currencyInstance,field:'pricePrecision')}" />
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="stdPrecision">Std Precision:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:currencyInstance,field:'stdPrecision','errors')}">
                                    <input type="text" id="stdPrecision" name="stdPrecision" value="${fieldValue(bean:currencyInstance,field:'stdPrecision')}" />
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><input class="save" type="submit" value="Create" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
