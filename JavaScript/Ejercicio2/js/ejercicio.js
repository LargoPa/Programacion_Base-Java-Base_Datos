
var num1 = prompt("Ingrese numero 1");
var num2 = prompt("Ingrese numero 2");
var resta = num1 - num2;

if(resta>0){
    console.log("La resta es mayor a 0.");
    if(num1%num2==0){
        console.log("Es par.");
    }else{
        console.log("Es impar.");
    }
}else{
    console.log("Es menor o igual a 0.");
}
