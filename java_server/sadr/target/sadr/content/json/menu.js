{
    "code": 200,
	"msg": "",
	"data": [{
		"title": "概览"
		,"icon": "layui-icon-home"
		,"list": [{
			"title": "控制台"
			,"jump": "/"
		}]
	}, {
		"name": "personalCenter",
		"title": "用户中心",
		"icon": "layui-icon-user",
		"list": [{
			"name": "personalInformation"
			,"title": "个人信息"
		},{
			"name": "listreview"
			,"title": "待审核用户"
		},{
			"name": "personalList"
			,"title": "用户列表"
		}]
	}, {
		"name": "equipment",
		"title": "设备管理",
		"icon": "layui-icon-set",
		"list": [{
			"name": "roomList"
			,"title": "机房列表"
			,"jump": "equipment/roomList"
		},{
			"name": "electricList"
			,"title": "电表列表"
            ,"jump": "equipment/electricList"
		}]
	}]
}