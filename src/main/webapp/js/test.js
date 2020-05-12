
// 没有用户名密码跳转注册
function test1() {
    $.ajax({
        type:"GET",
        url:"/testF/",
        dataType:"html",
        success:function (data) {
            document.write(data); //写入网页
        },
    })
}

