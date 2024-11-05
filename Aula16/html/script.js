document.getElementById("fetchButton").addEventListener("click", () => {
    fetch("https://swapi.dev/api/people/5")
        .then(response => response.json())
        .then(data => {
            // Seleciona o elemento de resultado e insere o nome da resposta JSON
            document.getElementById("result").innerHTML = `
                <strong>Nome:</strong> ${data.name}<br>
                <strong>Altura:</strong> ${data.height} cm<br>
                <strong>Cor dos olhos:</strong> ${data.eye_color}<br>
                <strong>Ano de nascimento:</strong> ${data.birth_year}
            `;
        })
        .catch(error => {
            document.getElementById("result").innerHTML = "Ocorreu um erro ao buscar os dados.";
            console.error("Erro:", error);
        });
});
