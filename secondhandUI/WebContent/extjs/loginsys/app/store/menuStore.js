Ext.define("Demo.store.menuStore",{
    extend:'Ext.data.TreeStore',
    defaultRoodId:'root',
	width :500,
     root: {
        expanded: true,
        children: [
            { text: "homework1", expanded: true, children: [
                { text: "book report2", expanded: true , children: [
                { text: "book report", leaf: true },
                { text: "alegrbra3", expanded: true, children: [
                { text: "book report11", leaf: true },
                { text: "alegrbra4", expanded: true , children: [
                { text: "book report1", leaf: true },
                { text: "alegrbra23", leaf: true}
            ]}
            ]}
            ]},
                { text: "alegrbra", leaf: true}
            ] }
        ]
    }
});