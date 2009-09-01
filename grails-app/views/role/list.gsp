<head>
	<meta name="layout" content="main" />
	<title><g:message code="role.title.list"/></title>
</head>

<body>

	<div class="nav">
		<span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}"><g:message code="default.home"/></a></span>
		<span class="menuButton"><g:link class="create" action="create"><g:message code="default.new"/></g:link></span>
	</div>

	<div class="body">
		<h1><g:message code="role.title.list"/></h1>
		<g:if test="${flash.message}">
		<div class="message">${flash.message}</div>
		</g:if>
		<div class="list">
			<table>
			<thead>
				<tr>
					<g:sortableColumn property="id" title="${g.message(code:'role.id')}" />
					<g:sortableColumn property="authority" title="${g.message(code:'role.authority')}" />
					<g:sortableColumn property="description" title="${g.message(code:'role.description')}" />
					<th>&nbsp;</th>
				</tr>
			</thead>
			<tbody>
			<g:each in="${authorityList}" status="i" var="authority">
				<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
					<td>${authority.id}</td>
					<td>${authority.authority?.encodeAsHTML()}</td>
					<td>${authority.description?.encodeAsHTML()}</td>
					<td class="actionButtons">
						<span class="actionButton">
							<g:link action="show" id="${authority.id}"><g:message code="default.show"/></g:link>
						</span>
					</td>
				</tr>
			</g:each>
			</tbody>
			</table>
		</div>

		<div class="paginateButtons">
			<g:paginate total="${net.xioh.qprise.security.Role.count()}" />
		</div>
	</div>
</body>
