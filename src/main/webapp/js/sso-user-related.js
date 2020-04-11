function login() {
    alert(1)
    $.ajax({
        url: "login2",
        type:"GET",
        data:{},
        dataType:"json",
        success(data){
            alert(data)
            window.location.href="http://localhost:8080/test2"
        }
    })
}
function test111() {
            window.location.href="http://localhost:8080/skipRegister"
}