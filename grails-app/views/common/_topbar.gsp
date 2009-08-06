<gui:dialog
    title="About Information"
    draggable="false"
    modal="true"
    buttons="[
    [text:'OK', handler: 'function() {this.cancel();}', isDefault: true]
    ]"
    triggers="[show:[id:'btnAbout', on:'click']]"
    >

    <div id="about">
        <h3>
            qPrise ERP Software v. <g:meta name="app.version"/>
        </h3>


        <p>Copyright © Xioh Solutions, 2008-2009</p>

        <p>This product has been created by Xioh Solutions. and is distributed under the</p>
        Xioh Solutions License (http://www.xioh.net/legal/license.html)


    </div>


</gui:dialog>

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
        <g:link url="#" id="btnAbout">Acerca de</g:link> |


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
