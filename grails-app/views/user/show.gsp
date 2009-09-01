<head>
	<meta name="layout" content="main" />
	<title><g:message code="user.title.show"/></title>
</head>

<body>

	<div class="nav">
		<span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}"><g:message code="default.home"/></a></span>
		<span class="menuButton"><g:link class="list" action="list"><g:message code="user.title.list"/></g:link></span>
		<span class="menuButton"><g:link class="create" action="create"><g:message code="default.new"/></g:link></span>
	</div>

	<div class="body">
		<h1><g:message code="user.title.show"/></h1>
		<g:if test="${flash.message}">
		<div class="message">${flash.message}</div>
		</g:if>
		<div class="dialog">
			<table>
			<tbody>

				<tr class="prop">
					<td valign="top" class="name"><g:message code="user.id"/>:</td>
					<td valign="top" class="value">${person.id}</td>
				</tr>

				<tr class="prop">
					<td valign="top" class="name"><g:message code="user.username"/>:</td>
					<td valign="top" class="value">${person.username?.encodeAsHTML()}</td>
				</tr>

				<tr class="prop">
					<td valign="top" class="name"><g:message code="user.userRealName"/>:</td>
					<td valign="top" class="value">${person.userRealName?.encodeAsHTML()}</td>
				</tr>

				<tr class="prop">
					<td valign="top" class="name"><g:message code="user.enabled"/>:</td>
					<td valign="top" class="value">${person.enabled}</td>
				</tr>

				<tr class="prop">
					<td valign="top" class="name"><g:message code="user.description"/>:</td>
					<td valign="top" class="value">${person.description?.encodeAsHTML()}</td>
				</tr>

				<tr class="prop">
					<td valign="top" class="name"><g:message code="user.email"/>:</td>
					<td valign="top" class="value">${person.email?.encodeAsHTML()}</td>
				</tr>

				<tr class="prop">
					<td valign="top" class="name"><g:message code="user.showEmail"/>:</td>
					<td valign="top" class="value">${person.emailShow}</td>
				</tr>

				<tr class="prop">
					<td valign="top" class="name"><g:message code="user.roles"/>:</td>
					<td valign="top" class="value">
						<ul>
						<g:each in="${roleNames}" var='name'>
							<li>${name}</li>
						</g:each>
						</ul>
					</td>
				</tr>

			</tbody>~
			</table>
		</div>

		<div class="buttons">
			<g:form>
				<input type="hidden" name="id" value="${person.id}" />
				<span class="button"><g:actionSubmit class="edit" action="edit" value="${g.message(code:'default.edit')}" /></span>
				<span class="button"><g:actionSubmit class="delete" action="delete" onclick="return confirm('${g.message(code:'default.confirm')}');" value="${g.message(code:'default.delete')}" /></span>
			</g:form>
		</div>

	</div>
</body>
