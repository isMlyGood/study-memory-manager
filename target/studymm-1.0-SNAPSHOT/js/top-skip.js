// 首页跳转
// 登陆跳转
function skipLogin() {
    $.ajax({
        type:"GET",
        url:"/skipLogin",
        dataType:"html",
        success:function (data) {
            document.write(data);
        },
    })
}
// 注册跳转
function skipRegister() {
    $.ajax({
        type:"GET",
        url:"/skipRegister",
        dataType:"html",
        success:function (data) {
            document.write(data);
        },
    })
}
//（临时解决办法）
// undreWebinf-登陆跳转
function underSkipLogin() {
    window.location.href="http://localhost:8080/skipLogin"
}
// undreWebinf-注册跳转
function underSkipRegister() {
    window.location.href="http://localhost:8080/skipRegister"
}