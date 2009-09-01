<head>
    <meta name="layout" content="main" />
    <title><g:message code="role.title.show"/></title>
</head>

<body>

    <div class="nav">
        <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
        <span class="menuButton"><g:link class="list" action="list"><g:message code="default.home"/></g:link></span>
        <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new"/></g:link></span>
    </div>

    <div class="body">
        <h1><g:message code="role.title.show"/></h1>
        <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
        </g:if>
        <div class="dialog">
            <table>
                <tbody>

                    <tr class="prop">
                        <td valign="top" class="name"><g:message code="role.id"/>:</td>
                <td valign="top" class="value">${authority.id}</td>
                </tr>

                <tr class="prop">
                    <td valign="top" class="name"><g:message code="role.authority"/>:</td>
                <td valign="top" class="value">${authority.authority}</td>
                </tr>

                <tr class="prop">
                    <td valign="top" class="name"><g:message code="role.description"/>:</td>
                <td valign="top" class="value">${authority.description}</td>
                </tr>

                <tr class="prop">
                    <td valign="top" class="name"><g:message code="role.people"/>:</td>
                <td valign="top" class="value">${authority.people}</td>
                </tr>

                </tbody>
            </table>
        </div>

        <div class="buttons">
            <g:form>
                <input type="hidden" name="id" value="${authority?.id}" />
                <span class="button"><g:actionSubmit class="edit" action="edit" value="${g.message(code:'default.edit')}" /></span>
                <span class="button"><g:actionSubmit class="delete" action="delete" onclick="return confirm('${g.message(code:'default.confirm')}');" value="${g.message(code:'default.delete')}" /></span>
            </g:form>
        </div>

    </div>

</body>
