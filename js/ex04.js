const link = document.querySelector("#myid");

//  요소명.addEventListener("이벤트명", (전달값) -> {실행문구})
// 만약에 전달값이 e이면 event객체를 뜻한다.
link.addEventListener("click", (e)=>{
	alert("눌렀네~~~?");
	
	// 이벤트의 기본 동작을 막기 위해 사용되는 함수
	// form을 submit할때 페이지 세로고침을 막는다.
	// 링크을 클릭할때 다른 페이지로 이동하는 것을 막는다.
	
/*	e.preventDefault();*/
	link.style.backgroundcolor = blue;
});


const box = document.querySelector("#box");

/*box.addEventListener("click", (e)=>{
	box.style.backgroundColor = "skyblue";
});
*/

// mouseover => 마우스가 영역에 들어왔을 대
box.addEventListener("mouseover", (e)=>{
	box.style.backgroundColor="skyblue";
	
	
})

// mouseout => 마우스가 영역을 벗어났을 때
box.addEventListener("mouseout", (e)=>{
	box.style.backgroundColor="tomato";
	
	
})