Ext.application({
	name:'MYAPP',
	
	launch:function(){
		Ext.create('Ext.panel.Panel',{
			title:'Extjs 5 First Panel ',
//			width:800,
//			height:60,
			id:'FirstPanelTop',
			collapsed:false,
			collapsible:true,
			renderTo:Ext.getBody(),
			bodyPadding:5,
			style:{
				display:'none'
			},
			dockedItems:[
			    {
			    	xtype:'toolbar',
				    dock:'top',
				    items:[
				       {
				    	   text:'Docked to the top'
				       }
		            ]
			    }
            ]
		});

		Ext.create('Ext.panel.Panel',{
			title:'Extjs 5 Second Panel',
			id:'panel2',
//			width:800,
			height:670,
			collapsed:false,
//			collapseDirection:'bottom',	
			collapsible:false,
			renderTo:Ext.getBody(),
			bodyPadding:5,
			layout:'border',
			stretch:true,
			items:[
			   {
				   xtype:'component',
				   region:'north',
				   padding:10,
				   cls:'appBanner',
				   height:60,
				   html:'My Company - My Company Motto'
			   },{
				   xtype:'panel',
				   title:'Navigation',
				   region:'west',
				   loader: {
				        url: 'menu.html',
				        autoLoad: true
				    },
				   width:250,
				   split:true,
				   collapsible:true,
				   collapsed:false
			   },{
				   xtype:'tabpanel',
				   region:'center',
				   items:[
				      {
				    	  title:'Tab 1',
				    	  bodyPadding:20,
				    	  html:'<h1>Content One</h1>'
				      },
				      {
				    	  title:'The Data',
		    	    	  layout:'fit',
				    	  bodyPadding:20,
				    	  items:[
				    	     {
				    	    	 xtype:'grid',
				    	    	 title:'Simpsons',
				    	    	 store:{
				    	    		 fields:['name','email','phone'],
				    	    		 data:[
			    	    		       	{name:'Lisa', email:'lisa@simpsons.com', phone:'555-111-1124'},
			    	    		       	{name:'Bart', email:'bart@simpsons.com', phone:'555-111-1125'},
			    	    		       	{name:'Homer', email:'homer@simpsons.com', phone:'555-111-1126'},
			    	    		       	{name:'Marge', email:'marge@simpsons.com', phone:'555-111-1127'},
		    	    		         ],
		    	    		         proxy:{
		    	    		        	 type:'memory'
		    	    		         }
				    	    	 },
				    	    	 columns:[
				    	    	    {text:'Name', dataIndex:'name'},
				    	    	    {text:'Email', dataIndex:'email', flex:1},
				    	    	    {text:'Phone', dataIndex:'phone'}
	    	    	             ]
				    	     }
		    	          ]
				      }
		           ]
			   }
			]
		});
	}
});