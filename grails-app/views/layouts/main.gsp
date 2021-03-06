<html>
    <head>
        <title><g:layoutTitle default="qPrise" /></title>
        <link rel="stylesheet" href="${createLinkTo(dir:'css',file:'main.css')}" />
        <link rel="shortcut icon" href="${createLinkTo(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
    <g:layoutHead />
    <g:javascript library="application" />
    <gui:resources components="['menu', 'dialog', 'accordion', 'dataTable', 'richEditor']"/>
    <!--<nav:resources/>-->
</head>
<body class="yui-skin-sam">

<!--    <div id="menu">
        <nav:render group="tabs"/>
        
    </div>
-->
    <div id="page">
        <div id="spinner" class="spinner" style="display: none;">
            <img src="${createLinkTo(dir:'images',file:'spinner.gif')}"
                 alt="Spinner" />
        </div>

        <div id="topbar">
            <g:render template="/common/topbar" />
        </div>

        <div id="header">
            <h1>qPrise ERP Software</h1>
        </div>

        <div id="content">
            <g:layoutBody />
        </div>

        <div id="sidebar">
            <g:render template="/common/buddies" />
        </div>

        <div id="footer">
            <g:render template="/common/footer" />
        </div>
    </div>
</body>	
</html>