function getCookie(name)
    {
        //思路分析:
        //先用document.cookie输出一个cookie值观察它的格式,,,假设有多个name  
        // 它的格式为 :    a=1; b=2; {......}z=n
        //分号与下一个name之间有一个空格,最后一个什么也没有
        //现在我们要通过name获取它对应的值,
        //这个name的位置只有可能为第一个 或者前面是个空格,-----> /(^| )/
        //而这个name的后面必定跟上个/=/号 ------> /(name+"=...")/
        //=号后面直到遇到/;/或者结尾/$/的值就是我们需要的   /(;}$)/
        //由于值可能不存在所以用特殊符/*/
        //综上即为 /(^| )"+name+"=([^;]*)(;|$)/
        var result = document.cookie.match(new RegExp("(^| )"+name+"=([^;]*)(;|$)"));
        if(result){
            //这就是使用match函数的原因,可以轻松获取匹配到的括号中的内容
            //由于如果match有返回值,那么返回的数组的下标0对应的值为匹配到的全部字符串,而我们需要的是第二个括号中的值
            return result[2];
        }else{
            return false;
        }
    }
	
	function delCookie(name)
    {
        //这里我将空参的函数执行为 删除所有的cookie
        if(arguments.length==0){
            //又用到了强大的正则,这个比上个更好理解
            //getCookie函数中我们需要获取的是value,这次我们需要获取的是name
            //思路分析 : 
            //只取cookie字符中的开头部分遇到/=/号就停止匹配
            //将这部分用小括号记录起来(内容即位我们需要的name)
            //为了以防万一这里添加了name中不能有/[^;]/号
            var del_name = document.cookie.match(new RegExp("(^[^;]*)="))
                //判断是否匹配到了 ,cookie已经为空otherwise
                if(del_name){
                    //调用有参的delCookie函数删除匹配到name
                    delCookie(del_name[1]);
                    //调用无参继续删除(递归思想)
                    delCookie();
                }
        }
        if(getCookie(name)){
            //将过期时间设置为当前时间,即过期了
             document.cookie=name+"="+getCookie(name)+";expires="+new Date().toGMTString();
             return true;
        }else{
            return false;
        }
    }
	
	function setCookie(name,value,exday)
    {
        //判断传入的参数是否至少为2个,return false otherwise
        if(value){
            //如果传入了cookie过期时间exday就进入添加日期操作
            if(arguments[3]){
                var exday = exday*24*60*60*1000;
                document.cookie=name+"="+value+";expires="+(new Date().setTime(new Date().getTime()+exday)).toGMTString();
                return document.cookie;
                //否则直接添加cookie的值
            }else{
                document.cookie=name+"="+value;
                return document.cookie;
            }
        }
        return false;
    }
	
	function goHeader(url,params){
		if(params)
	        setCookie('roomId',params)
		window.location.href=url
	}