const open = document.querySelector("#open");
const close = document.querySelector("#close");
const desc = document.querySelector("#desc");


open.addEventListener("click", (e)=>{
	desc.style.display = "block";
	open.style.display = "none";
	
	
});
close.addEventListener("click", (e)=>{
	desc.style.display = "none";
	open.style.display = "block";
	
	
});



const btnPlus = document.querySelector("#btnPlus");
const res = document.querySelector("#res");
const btnMinus = document.querySelector("#btnMinus");

btnPlus.addEventListener("click", (e)=>{
	let k = res.textContent;
	k++;
	res.textContent = k;
/*	let k = res.innerText; // get
	k++;
	res.innerTest = k; //set*/

});


btnMinus.addEventListener("click", (e)=>{
	let k = res.textContent;
	k--;
	res.textContent = k;

});



