package sorveteria;

import javax.swing.JOptionPane;

public class Sorveteria {

    static String sorveteSabor[] = new String[999];
    static String sorveteTamanho[] = new String[999];
    static float sorvetePreco[] = new float[999];
    static float valorFinal = 0;
    static int escolhaMenu = 0;
    static int qntdDeSorvetesPedidos = 0;
    static int cont = 0;
    static int codigoDoPedido = 0;

    public static void main(String[] args) {
        
        do {
            menu();

            if (escolhaMenu == 1) {
                escolhaSorvete();

                confirmarPedido();

            } else {
                encerrado();
            }
        } while (escolhaMenu == 1);

    }

    public static void menu() {
        
        do {
            valorFinal = 0;
            qntdDeSorvetesPedidos = 0;
            
            escolhaMenu = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
                    + "1 - Fazer um pedido\n"
                    + "0 - Sair"));
        } while (escolhaMenu < 0 || escolhaMenu > 1);
    }

    public static void escolhaSorvete() {
        int escolhaSabor;
        int escolhaTamanho;

        int tamanhoPequeno = 10;
        int tamanhoMedio = 20;
        int tamanhoGrande = 35;

        //estrutura do-while para a escolha do tamanho do sorvete
        do {
            escolhaTamanho = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tamanho do seu pote de sorvete:"
                    + "\n 1- Pequeno = R$ 10,00"
                    + "\n 2- Médio = R$ 20,00"
                    + "\n 3- Grande = R$ 35,00"));
        } while (escolhaTamanho < 1 || escolhaTamanho
                > 3);

        //estrutura do-while para a escolha do sabor do sorvete
        do {
            escolhaSabor = Integer.parseInt(JOptionPane.showInputDialog("Escolha o sabor:"
                    + "\n 1- Morango"
                    + "\n 2- Uva"
                    + "\n 3- Chocolate"
                    + "\n 4- Café"
                    + "\n 5- Flocos"));
        } while (escolhaSabor < 1 || escolhaSabor
                > 5);

        //estrutura de ifs para guardar o tamanho e o preço do sorvete em um vetor e adicionar o preço ao valor final
        if (escolhaTamanho == 1) {
            sorveteTamanho[qntdDeSorvetesPedidos] = "pequeno";
            sorvetePreco[qntdDeSorvetesPedidos] = tamanhoPequeno;
            valorFinal += tamanhoPequeno;
        } else if (escolhaTamanho == 2) {
            sorveteTamanho[qntdDeSorvetesPedidos] = "médio";
            sorvetePreco[qntdDeSorvetesPedidos] = tamanhoMedio;
            valorFinal += tamanhoMedio;
        } else {
            sorveteTamanho[qntdDeSorvetesPedidos] = "grande";
            sorvetePreco[qntdDeSorvetesPedidos] = tamanhoGrande;
            valorFinal += tamanhoGrande;
        }

        //estrutura de ifs para guardar o nome do sorvete em um vetor
        if (escolhaSabor == 1) {
            sorveteSabor[qntdDeSorvetesPedidos] = "morango";
        } else if (escolhaSabor == 2) {
            sorveteSabor[qntdDeSorvetesPedidos] = "uva";
        } else if (escolhaSabor == 3) {
            sorveteSabor[qntdDeSorvetesPedidos] = "chocolate";
        } else if (escolhaSabor == 4) {
            sorveteSabor[qntdDeSorvetesPedidos] = "café";
        } else {
            sorveteSabor[qntdDeSorvetesPedidos] = "flocos";
        }

        //mandando pra proxima etapa: revisao de pedido
        revisarPedido();
    }

    public static void revisarPedido() {
        String listaDeCompras = "";
        int revisaoDoPedido, novoPedido;

        for (int i = 0; i <= qntdDeSorvetesPedidos; i++) {
            listaDeCompras += "\n Sorvete " + sorveteTamanho[i] + " de " + sorveteSabor[i] + ": R$" + sorvetePreco[i];
        }

        do {
            revisaoDoPedido = Integer.parseInt(JOptionPane.showInputDialog("Carrinho:\n"
                    + listaDeCompras
                    + "\n\nValor total: R$" + valorFinal
                    + "\n\n1 - Alterar pedido\n"
                    + "2 - Continuar"));
        } while (revisaoDoPedido < 1 || revisaoDoPedido > 2);

        if (revisaoDoPedido == 1) {
            valorFinal -= sorvetePreco[qntdDeSorvetesPedidos];
            escolhaSorvete();
        } else {

            do {
                novoPedido = Integer.parseInt(JOptionPane.showInputDialog("Deseja pedir outro sorvete?\n"
                        + "1 - Sim"
                        + "\n2 - Não"));

            } while (novoPedido < 1 || novoPedido > 2);

            if (novoPedido == 1) {
                qntdDeSorvetesPedidos++;
                valorFinal -= sorvetePreco[qntdDeSorvetesPedidos];
                escolhaSorvete();
            }
        }
    }

    public static void confirmarPedido() {
        String textoDeEntrega = "";
        String nomeCliente, endereco;
        int numeroTelefone;
        int tipoEntrega;

        codigoConfirmacao();

        do {
            tipoEntrega = Integer.parseInt(JOptionPane.showInputDialog("O pedido vai ser para:\n"
                    + "1 - Entrega em casa = R$10,00\n"
                    + "2 - Retirada na loja"));
        } while (tipoEntrega < 1 || tipoEntrega > 2);

        if (tipoEntrega == 1) {
            nomeCliente = JOptionPane.showInputDialog("Informe o seu nome:");
            endereco = JOptionPane.showInputDialog("Informe o seu endereço:");
            numeroTelefone = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu numero de telefone"));

            textoDeEntrega = "Nome: " + nomeCliente
                    + "\nEndereço: " + endereco
                    + "Telefone: " + numeroTelefone
                    + "\nLogo o pedido chegara até voce, seu codigo o recebimento do produto é: " + codigoDoPedido;
        } else {
            nomeCliente = JOptionPane.showInputDialog("Informe o seu nome:");

            textoDeEntrega = nomeCliente + " logo pode comparecer a loja para retirar o seu pedido, seu codigo de retirada do pedido é: " + codigoDoPedido;
        }
        
        JOptionPane.showMessageDialog(null, textoDeEntrega);
        
        
        cont++;

    }

    public static void codigoConfirmacao() {

        int[] senhaNova = new int[100];

        senhaNova[cont] = (int) (Math.random() * 101);

        if (cont > 0) {
            for (int i = 0; i < cont; i++) {
                if (senhaNova[cont] == senhaNova[i]) {
                    senhaNova[cont] = (int) (Math.random() * 101);
                }
            }
        }
        
        codigoDoPedido = senhaNova[cont];
    }

    public static void encerrado() {
        
        JOptionPane.showMessageDialog(null, "Programa encerrado com sucesso!");
    
    }

}
