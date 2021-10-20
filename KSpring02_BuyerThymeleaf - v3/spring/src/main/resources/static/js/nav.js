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

        if(text == "home") {
            location.href="/"
        } else if(text == "order") {
           location.href="/oder"
        } else if(text == "login") {
           location.href="/login"
        }
    })
})