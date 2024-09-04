class Veiculo:
    # __init_ => é o método construtor
    def __init__(self, marca, modelo, placa, ano):
        self.marca = marca
        self.modelo = modelo
        self.placa = placa
        self.ano = ano
    # Método de instância
    def calcularTempoUso(self):
        return 2024 - self.ano


# Abaixo estou instanciando um objeto
#   da Classe Veiculo
meuUno = Veiculo("Fiat", "Uno com Escada", "ABC-1234", 2005)
meuUno.ano = 2007
teuFusca = Veiculo("Volks", "Fusca do Itamar", "DEF-", 1995)

print(meuUno.calcularTempoUso())
print(teuFusca.calcularTempoUso())

print("")
