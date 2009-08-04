<div id="menu">
    <nobr>

        <g:isLoggedIn>
            Bienvenido 
            <b>
                <g:loggedInUserInfo field="userRealName">Guest</g:loggedInUserInfo>
            </b>
        </g:isLoggedIn> | 

        <g:link url="#">Mis Preferencias</g:link> |
        <g:link url="#">Ayuda</g:link> |
        <g:link url="#">Acerca de</g:link> |


        <g:isNotLoggedIn>
            <g:link controller="login">
                <g:message code="login" />
            </g:link>
        </g:isNotLoggedIn>


        <g:isLoggedIn>
            <g:link controller="logout">
                <g:message code="logout" />
            </g:link>
        </g:isLoggedIn>

    </nobr>
</div>
