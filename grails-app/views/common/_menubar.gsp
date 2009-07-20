<div id="mainMenu">

    <gui:menubar id='myMenubar' renderTo='mainMenu'>

		<gui:menuitem url="#">Portada</gui:menuitem>
		
		<gui:submenu label='Ventasaasas'>
			<gui:submenu label='Ventas'>
				<gui:menuitem url="#">Nueva Orden de Venta al Contado</gui:menuitem>
				<gui:menuitem url="#">Nueva Orden de Venta</gui:menuitem>
				<gui:menuitem url="#">Nueva Orden de Venta Recurrente</gui:menuitem>
				<gui:menuitem url="#">Recibos</gui:menuitem>
				<gui:menuitem url="#">Mostrar Ordenes de Venta</gui:menuitem>
				<gui:menuitem url="#">Análisis de Ventas</gui:menuitem>
			</gui:submenu>		
			<gui:menuitem url="[controller:'customer']">Clientes</gui:menuitem>
			<gui:submenu label='Configuración'>
				<gui:menuitem url="[controller:'priceList']">Lista de Precios</gui:menuitem>
			</gui:submenu>			
		</gui:submenu>
		
		<gui:submenu label='Stock/Inventario'>
			<gui:menuitem url="[controller:'product']">Productos</gui:menuitem>
			<gui:submenu label='Compras'>
				<gui:menuitem url='#'>Nueva Orden de Compra</gui:menuitem>
				<gui:menuitem url='#'>Ordenes de Compra</gui:menuitem>
				<gui:menuitem url='#'>Nuevo Pagable</gui:menuitem>
				<gui:menuitem url='#'>Pagables</gui:menuitem>
				<gui:menuitem url="[controller:'supplier']">Proveedores</gui:menuitem>
				<gui:menuitem url='#'>Balance de Proveedor</gui:menuitem>																
			</gui:submenu>			
			<gui:submenu label='Configuración'>
				<gui:menuitem url="[controller:'productCategory']">Categorías</gui:menuitem>
				<gui:menuitem url="[controller:'vatCategory']">Categorías IVA</gui:menuitem>
				<gui:menuitem url="[controller:'location']">Lugares</gui:menuitem>
				<gui:menuitem url="[controller:'productAttribute']">Atributos</gui:menuitem>
				<gui:menuitem url="[controller:'unitType']">Tipos de Unidad</gui:menuitem>
			</gui:submenu>
		</gui:submenu>
		<gui:menuitem url='#'>RRHH</gui:menuitem>
		
		<gui:submenu label='Contabilidad'>
			<gui:submenu label='Registro'>
				<gui:menuitem url="#">Transacción Genérica</gui:menuitem>
				<gui:menuitem url="[controller:'expenseTransaction']">Transacción Cara</gui:menuitem>
			</gui:submenu>
			<gui:menuitem url="#">Balance</gui:menuitem>
			<gui:menuitem url="#">Historia</gui:menuitem>
			<gui:submenu label='Configuración'>
				<gui:menuitem url="[controller:'account']">Cuentas</gui:menuitem>
				<gui:menuitem url="[controller:'accountGroup']">Grupos de Cuentas</gui:menuitem>
				<gui:menuitem url="[controller:'accountConf']">Conf. Cuentas</gui:menuitem>
				<gui:menuitem url="[controller:'dimension']">Dimensiónes</gui:menuitem>
			</gui:submenu>
		</gui:submenu>
		
		
		<gui:submenu label='Administración'>
			<gui:menuitem url="[controller:'user']">Usuarios</gui:menuitem>
			<gui:menuitem url="[controller:'role']">Roles</gui:menuitem>
			<gui:menuitem url="[controller:'requestmap']">Acessos</gui:menuitem>
			<gui:submenu label='Otros'>
				<gui:menuitem url="[controller:'country']">Países</gui:menuitem>
			</gui:submenu>			
		</gui:submenu>
		
		<gui:submenu label='Preferencias'>		
			<gui:menuitem url='#'>Mi Perfil</gui:menuitem>
			<gui:menuitem url='#'>Lenguaje</gui:menuitem>
		</gui:submenu>

    </gui:menubar>



</div>
