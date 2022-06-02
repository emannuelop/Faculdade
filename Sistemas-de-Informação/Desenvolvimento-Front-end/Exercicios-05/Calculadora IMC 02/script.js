var titulo = document.querySelector(".titulo-principal");
titulo.textContent = "Emannuel Nutrição";
titulo.addEventListener("click", function() {
    console.log("Olá eu fui clicado!");
});

var listaDePacientes = document.querySelectorAll(".paciente");

for (var i = 0; i < listaDePacientes.length; i++) {
    var paciente = listaDePacientes[i];
    var tdPeso = paciente.querySelector(".info-peso");
    var peso = tdPeso.textContent;

    var tdAltura = paciente.querySelector(".info-altura");
    var altura = tdAltura.textContent;

    var pesoValido = true; // Assumindo que o peso é válido
    var alturaValida = true; // Assumindo que a altura é válida


    if (peso <= 0 || peso >= 500) {
        tdPeso.textContent = "Peso Inválido";
        pesoValido = false;
        paciente.classList.add("paciente-invalido");
    }

    if (altura <= 0 || altura >= 3.00) {
        tdAltura.textContent = "Altura Inválida";
        alturaValida = false;
        paciente.classList.add("paciente-invalido");
    }

    if (pesoValido && alturaValida) {
        var imc = peso / (altura * altura);
        var tdImc = paciente.querySelector(".info-imc");
        tdImc.textContent = imc.toFixed(2);
    }
}
var botaoAdicionar = document.querySelector("#adicionar-paciente");
botaoAdicionar.addEventListener("click", function(event) {
    event.preventDefault();
    console.log("Oi eu sou o botao e fui clicado");
});