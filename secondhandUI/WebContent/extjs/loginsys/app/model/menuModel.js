Ext.define('Demo.model.menuModel', {
    extend: 'Ext.data.Model',
    fields:[
        {name:'pid', type:'int'},
        {name:'text', type:'string'},
        //type为布尔型时，后面的默认值是必须写的，要不会出错
        {name:'leaf', type:'boolean', defaultValue: true},
        {name: 'url', type:'string'},
        {name: 'children'}
    ],
     loadMask: true	//被一个模态遮罩覆盖, 同时LoadMask的msg中的内容将会随着一个旋转的图片显示在中间位置.
});