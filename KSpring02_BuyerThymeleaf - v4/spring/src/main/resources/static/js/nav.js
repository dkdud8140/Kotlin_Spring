$(function(){
//    $("li.login").om("click",function(){
//        alert("로긴")
//    })
//    $("li.pay").om("click",function(){
//            alert("로긴")
//        })

    $("nav li").on("click",function(){

        const className = $(this).attr("class")
        const tagId = $(this).attr("id")
        const tagName = $(this).attr("name")
        const text = $(this).text()

//        const tagInform = {
//            tagName, tagId, className, text
//        }
//        alert(JSON.stringify(tagInform))

                let href = "/"
                if(text === "주문관리") {
                    href += "order/list"
                } else if (text == "결제관리") {
                    href += "pay"
                } else if (text == "로그인") {
                    href += "login"
                }
                location.href = `${href}`
    })
})