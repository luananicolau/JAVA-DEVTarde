package RevisaoFPOO.Cadastro;

import javax.swing.JOptionPane;

import Cadastro.Animais;
import Cadastro.Aves;
import Cadastro.Cachorro;
import Cadastro.Gato;

public class App {
    public static void main(String[] args) {
        boolean app = true;
        boolean imprimirDados = false;
        boolean cadastro = false;
        while (app) {
            int acaoEscolhida1 = Integer.parseInt(JOptionPane.showInputDialog(
                    "O que deseja fazer?\n1 - Cadastrar um animal\n2 - Ver informações de um animal cadastrado"));
            if (acaoEscolhida1 == 1) {
                cadastro = true;
            } else if (acaoEscolhida1 == 2) {
                imprimirDados = true;
            }
            Aves cadastroAves[] = new Aves[10];
            Cachorro cadastroCachorro[] = new Cachorro[10];
            Gato cadastroGatos[] = new Gato[10];
            int contCadastro = 0;
            while (cadastro) {
                JOptionPane.showMessageDialog(null, "Siga na próxima tela para cadastrar seu animal",
                        "Cadastro de Animais", JOptionPane.INFORMATION_MESSAGE);
                int acaoEscolhida2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Escolha o tipo de animal que você deseja cadastrar:\n1 - Aves\n2 - Cachorro\n3 - Gato",
                        "Escolha de animal", JOptionPane.INFORMATION_MESSAGE));
                if (acaoEscolhida2 == 1) {
                    cadastroAves[contCadastro] = new Aves();
                    cadastroAves[contCadastro].setProprietario("Digite o nome do dono da ave:");
                    cadastroAves[contCadastro].setNome(JOptionPane.showInputDialog("Digite o nome da ave:"));
                    cadastroAves[contCadastro].setPorte(JOptionPane.showInputDialog("Digite o porte da ave:"));
                    cadastroAves[contCadastro].setPeso(JOptionPane.showInputDialog("Digite o peso da ave:"));
                    cadastroAves[contCadastro].setRaca(JOptionPane.showInputDialog("Digite a raça da ave:"));
                    cadastroAves[contCadastro].setIdade(JOptionPane.showInputDialog("Digite a idade da ave:"));
                    cadastroAves[contCadastro].setCor(JOptionPane.showInputDialog("Digite a cor da ave:"));
                    JOptionPane.showMessageDialog(null, "Animal cadastrado!", "Cadastro de Animais",
                            JOptionPane.INFORMATION_MESSAGE);
                    contCadastro++;
                    cadastro = false;
                } else if (acaoEscolhida2 == 2) {
                    cadastroCachorro[contCadastro] = new Cachorro();
                    cadastroCachorro[contCadastro].setProprietario("Digite o nome do dono do cachorro:");
                    cadastroCachorro[contCadastro].setNome(JOptionPane.showInputDialog("Digite o nome do cachorro:"));
                    cadastroCachorro[contCadastro]
                            .setPorte(JOptionPane.showInputDialog("Digite o porte do cachorro:"));
                    cadastroCachorro[contCadastro].setPeso(JOptionPane.showInputDialog("Digite o peso do cachorro:"));
                    cadastroCachorro[contCadastro].setRaca(JOptionPane.showInputDialog("Digite a raça do cachorro:"));
                    cadastroCachorro[contCadastro]
                            .setIdade(JOptionPane.showInputDialog("Digite a idade do cachorro:"));
                    cadastroCachorro[contCadastro].setCor(JOptionPane.showInputDialog("Digite a cor do cachorro:"));
                    JOptionPane.showMessageDialog(null, "Animal cadastrado!", "Cadastro de Animais",
                            JOptionPane.INFORMATION_MESSAGE);
                    contCadastro++;
                    cadastro = false;
                } else if (acaoEscolhida2 == 3) {
                    cadastroGatos[contCadastro] = new Gato();
                    cadastroGatos[contCadastro].setProprietario("Digite o nome do dono do gato:");
                    cadastroGatos[contCadastro].setNome(JOptionPane.showInputDialog("Digite o nome do gato:"));
                    cadastroGatos[contCadastro].setPorte(JOptionPane.showInputDialog("Digite o porte do gato:"));
                    cadastroGatos[contCadastro].setPeso(JOptionPane.showInputDialog("Digite o peso do gato:"));
                    cadastroGatos[contCadastro].setRaca(JOptionPane.showInputDialog("Digite a raça do gato:"));
                    cadastroGatos[contCadastro].setIdade(JOptionPane.showInputDialog("Digite a idade do gato:"));
                    cadastroGatos[contCadastro].setCor(JOptionPane.showInputDialog("Digite a cor do gato:"));
                    JOptionPane.showMessageDialog(null, "Animal cadastrado!", "Cadastro de Animais",
                            JOptionPane.INFORMATION_MESSAGE);
                    contCadastro++;
                    cadastro = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Escolha um número dentre as opções apresentadas.", "Erro!",
                            JOptionPane.ERROR_MESSAGE);
                }
                ;
            }
            while (imprimirDados) {
                int acaoEscolhida3 = Integer.parseInt(JOptionPane.showInputDialog(
                        "Qual tipo de animal você deseja ver os dados?\n1 - Aves\n2 - Cachorro\n3 - Gato"));
                if (acaoEscolhida3 == 1) {
                    String buscarNome = JOptionPane.showInputDialog(
                            "Informe o nome a ser Buscado");
                    boolean busca = true;
                    int cont = 0;
                    while (busca) {
                        if (buscarNome.equals(cadastroAves[contCadastro].getNome())) {
                            cadastroAves[cont].imprimirAve();                            
                            busca = false;
                        }
                        else {cont++;};
                    }
                } else if (acaoEscolhida3 == 2) {
                    String buscarNome = JOptionPane.showInputDialog(
                            "Informe o nome a ser Buscado");
                    boolean busca = true;
                    int cont = 0;
                    while (busca) {
                        if (buscarNome.equals(cadastroCachorro[contCadastro].getNome())) {
                            cadastroCachorro[cont].imprimirCachorro();
                            busca = false;
                        }
                        else {cont++;};
                    }
                } else if (acaoEscolhida3 == 3) {
                    String buscarNome = JOptionPane.showInputDialog(
                            "Informe o nome a ser Buscado");
                    boolean busca = true;
                    int cont = 0;
                    while (busca) {
                        if (buscarNome.equals(cadastroGatos[contCadastro].getNome())) {
                            cadastroGatos[cont].imprimirGato();
                            busca = false;
                        }
                        else {cont++;};
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Escolha um número dentre as opções apresentadas.", "Erro!",
                            JOptionPane.ERROR_MESSAGE);
                }
                ;
            }
        }
    }
}