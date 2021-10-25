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
                if(confirm("삭제할까요")) {
                    href=`${href}/delete/${userid}`
                } else return false
            }
            location.href=`${href}`
        })
    }

})