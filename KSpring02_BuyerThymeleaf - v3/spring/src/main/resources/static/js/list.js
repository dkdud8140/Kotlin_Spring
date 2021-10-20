$(()=>{
     // jQuery 코드 영역
     // $("table.buyer_list tr).click(function() { })
     $("table.buyer_list tr").on("click",function(){ // selector 함수
            const id = $(this).data("id")
            alert(id)
            document.location.href="/buyer/detail?userid=" + id
     })

//    function tableClickHandler() {
//        const id =  $(this).data("id")
//        location.href = "/detail?userid=" + id
//     }
//     $("table.buyer_list tr").on("click",tableClickHandler)

})