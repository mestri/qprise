<head>
	<meta name="layout" content="main" />
	<title><g:message code="user.title.list"/></title>
</head>

<body>

	<div class="nav">
		<span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}"><g:message code="default.home"/></a></span>
		<span class="menuButton"><g:link class="create" action="create"><g:message code="default.new"/></g:link></span>
	</div>



	<div class="body">
		<h1><g:message code="user.title.list"/></h1>
		<g:if test="${flash.message}">
		<div class="message">${flash.message}</div>
		</g:if>
		<div class="list">
			<table>
			<thead>
				<tr>
					<g:sortableColumn property="id" title="${g.message(code:'user.id')}" />
					<g:sortableColumn property="username" title="${g.message(code:'user.username')}" />
					<g:sortableColumn property="userRealName" title="${g.message(code:'user.userRealName')}" />
					<g:sortableColumn property="enabled" title="${g.message(code:'user.enabled')}" />
					<g:sortableColumn property="description" title="${g.message(code:'user.description')}" />
					<th>&nbsp;</th>
				</tr>
			</thead>
			<tbody>
			<g:each in="${personList}" status="i" var="person">
				<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
					<td>${person.id}</td>
					<td>${person.username?.encodeAsHTML()}</td>
					<td>${person.userRealName?.encodeAsHTML()}</td>
					<td>${person.enabled?.encodeAsHTML()}</td>
					<td>${person.description?.encodeAsHTML()}</td>
					<td class="actionButtons">
						<span class="actionButton">
							<g:link action="show" id="${person.id}"><g:message code="default.show"/></g:link>
						</span>
					</td>
				</tr>
			</g:each>
			</tbody>
			</table>
		</div>

		<div class="paginateButtons">
			<g:paginate total="${net.xioh.qprise.security.User.count()}" />
		</div>

	</div>
</body>
