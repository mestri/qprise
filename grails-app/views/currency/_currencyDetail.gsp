<gui:resources components="['menu', 'dialog', 'accordion', 'dataTable', 'richEditor']"/>
<script>
var yesHandler = function(o) {
	alert('You clicked "Yes"');
	this.cancel();
}
</script>
<gui:dialog
title="Modal Confirm Dialog"
draggable="false"
modal="true"
buttons="[
[text:'Yes', handler: 'yesHandler', isDefault: true],
[text:'No', handler: 'function() {this.cancel();}', isDefault: false]
]"
triggers="[show:[type:'link', text:'Confirm', on:'click']]"
>
Are you sure?
</gui:dialog>
