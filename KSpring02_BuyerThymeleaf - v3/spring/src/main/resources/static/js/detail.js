$(function(){

    const button = $(".detail_buyer_info button")
    if(button) {
        $(button).on("click",function(){
            const className = $(this).att("class")

            let href = `${rootPath}buyer`

            if(className.includes("btn_update")) {
//                    alert("Update")
                href = `${href}/update/${userid}`
            }else if(className.includes("btn_delete")) {
//                alert("Delete")
                href = `${href}/delete/${userid}`
            }
            location.href=`${href}`
        })
    }

})