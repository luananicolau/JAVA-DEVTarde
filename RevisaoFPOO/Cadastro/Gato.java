package Cadastro;

import javax.swing.JOptionPane;

public class Gato extends Animais {
    String raca;
    String idade;
    String cor;
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
            public void imprimirGato() {
        JOptionPane.showMessageDialog(null,
                "Nome: "+nome
                + "\nProprietário: "+proprietario
                + "\nPeso: "+peso
                + "\nEspécie: Ave"
                + "\nPorte: "+porte
                + "\nRaça: "+raca
                + "\nIdade: "+idade
                + "\nCor: "+cor);
    }
}