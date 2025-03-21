const view = document.querySelector("#view");
const detail = document.querySelector("#detail");
const view2 = document.querySelector("#view2");



const cup = document.querySelector("#cup");

view.addEventListener("click", (e)=>{
	detail.style.display = "block";
	view.style.display = "none";
	view2.style.display = "block";
	
	
	
	
});


view2.addEventListener("click", (e)=>{
	detail.style.display = "none";
	view.style.display = "block";
	view2.style.display = "none";
	
	
	
});



let smallpics = document.querySelectorAll(".small");


/*smallpics[0].addEventListener("click", (e)=>{
	cup.setAttribute("src", "../images/coffee-pink.jpg")
	
});
smallpics[1].addEventListener("click", (e)=>{
	cup.setAttribute("src", "../images/coffee-blue.jpg")
	
});
smallpics[2].addEventListener("click", (e)=>{
	cup.setAttribute("src", "../images/coffee-gray.jpg")
	
});
*/

for(let k in smallpics){
	smallpics[k].addEventListener("click", changPic);
	
}


function changPic(){
	
	// this=> 클릭한 요소를 말한다.
	// this.src => 클릭한 요소의 src
	
	let newSrc = this.src;
	cup.setAttribute("src", newSrc);
	
}