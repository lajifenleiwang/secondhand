Ext.define('Demo.controller.demoController', {
    extend: 'Ext.app.Controller',
    views: ['Viewport','menuTree','contextMenu'],
    stores: ['menuStore'],
    model: ['menuModel'],
    //通过init函数来监听视图事件，控制视图与控制器的交互
    init: function() {
        //init函数通过this.control来负责监听
		//this 指的是demoController
        this.control({
            //被监听的组件的别名
            'menutree': {
                //监听鼠标点击事件，点击后调用changePage方法
                itemclick: this.changePage,
				itemcontextmenu: this.contextMenu
            }
        });
    },
    changePage:function(view, rec, item, index, e){
        //获取url地址
        var url = rec.get('url');
		alert('url:'+ url)
        //获取当前节点信息
        var title = rec.get('text');
		alert("text")
		title ="fdfasdfads";
        //将主体内容部分的url地址指定为我们获取到的url
        //Ext.getDom('contentIframe').src = url;
        //将主体内容框的标题设置为我们获取的节点信息
        Ext.getCmp('mainContent').setTitle(title);
    },
	 //显示右键菜单方法
    contextMenu:function(tree, record, item, index, e, eOpts){
        //阻止浏览器默认右键事件
        e.preventDefault();
        e.stopEvent();
        //显示右键菜单
        var view = Ext.widget('contextmenu');
        view.showAt(e.getXY());
        Ext.getCmp('delete_contextMenu').on("click",function(){
        	alert("fdfadsfxuudanyang");
        })
    }
});