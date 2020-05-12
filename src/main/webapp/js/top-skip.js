// 首页跳转
// 跳转登陆
function skipLogin() {
    $.ajax({
        type:"GET",
        url:"/login",
        dataType:"html",
        success:function (data) {
            window.location.href = data;
        },
    })
}
// 跳转注册
function skipRegister() {
    $.ajax({
        type:"GET",
        url:"/register",
        dataType:"html",
        success(data) {
            window.location.href = "register";
        },
    })
}

// 没有用户名密码跳转注册
function skipRegisterNotName() {
    $.ajax({
        type:"GET",
        url:"/register",
        dataType:"html",
        success:function (data) {
            window.location.href = data;
        },
    })
}


//（临时解决办法）
// undreWebinf-登陆跳转
function underSkipLogin() {
    window.location.href="login"
}
// undreWebinf-注册跳转
function underSkipRegister() {
    window.location.href="register"
}