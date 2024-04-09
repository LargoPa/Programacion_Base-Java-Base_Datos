
var fecha = new Date(2001,1,14);

//var fecha = new Date("05/25/2023");

var dia = fecha.getDate();
var mes = fecha.getMonth();
var anio = fecha.getFullYear();


alert("Día: " +dia+" Mes: "+(mes+1)+" Año: "+anio);
