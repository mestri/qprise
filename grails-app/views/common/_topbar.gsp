  <div id="menu">
    <nobr>
	  <g:link url="#">Mis Preferencias</g:link> | 
	  <g:link url="#">Ayuda</g:link> | 
	  <g:link url="#">Acerca de</g:link> | 
	
		<g:isLoggedIn> 
			<b>${session.user?.username} </b> | 
			<g:link controller="logout"> 
				<g:message code="logout" /> 
			</g:link> 
		</g:isLoggedIn> 
		<g:isNotLoggedIn> 
			<g:link controller="login"> 
				<g:message code="login" /> 
			</g:link> 
		</g:isNotLoggedIn>
    </nobr>
  </div>
