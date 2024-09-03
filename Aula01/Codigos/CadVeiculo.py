listaVeiculos = []

def cadastrar():
    print("Digite a marca:")
    marca = input()
    print("Digite o modelo:")
    modelo = input()
    print("Digite o placa:")
    placa = input()
    listaVeiculos.append([marca, modelo, placa])


while True:
    print("Escolha uma das opções:")
    print("1 - Cadastrar Veículo")
    print("2 - Listar Veículos")
    print("3 - Excluir Veículo")
    print("0 - SAIR")
    opcao = input()
    try:
        opcao = int(opcao)
    except:
        print("Opção Inválida")
    if opcao == 1:
        print("Cadastro")
    elif opcao == 2:
        print("Listar")
    elif opcao == 3:
        print("Excluir")
    elif opcao == 0:
        break
    else:
        print("Opção Inválida")