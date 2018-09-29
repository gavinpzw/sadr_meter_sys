/** layuiAdmin-v1.0.0-beta6 LPPL License By http://www.layui.com/admin/ */
;layui.define(function (e) {
    var i = (layui.$, layui.layer, layui.laytpl, layui.setter, layui.view, layui.admin);
    i.events.logout = function () {
        i.req({
		  url: 'user/getCompany.action' //实际使用请改成服务端真实接口
			,type:"post"
			,dataType: "JSON"
			,contentType:'application/json;charset=UTF-8'//关键是要加上这行
			,traditional:true//这使json格式的字符不会被转码
			, done: function (e) {
				i.exit()
			}
        })
    }, e("common", {})
});