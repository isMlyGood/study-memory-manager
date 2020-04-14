/**
 * 用户注册
 */
function userRegister() {
    var sex = "男";
    // //获取label的值
    var sexLable = $('#sexLable').find(':radio:checked').val();
    var sex = "";
    if (sexLable == "mr"){
        // sex = $("#boy").val();
        sex = "男";
    }else if (sexLable == "ms"){
        sex = "女";
        // sex = $("#girl").text();
    }
    let name = $("#first_name").val();
    let age = $("#age").val();
    let email = $("#email").val();
    let password = $("#password").val();
    let mobile = $("#mobile").val();
    let address = $("#address").val();
    alert(sex + name + age + email + email + password + mobile + address)
    $.ajax({
        url: "/user/test",
        type:"POST",
        data:{sex,name,age,email,password,mobile,address},
        dataType:"",
        success(data){
            alert(data)
        }
    })
}

