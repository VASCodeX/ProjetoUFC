import javax.swing.*;
import java.util.Random;

public class Luta {

    private Lutador desafiante;
    private Lutador desafiado;
    private boolean aprovado;

    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        if (lutador1.getCategoria() == lutador2.getCategoria() && lutador1.getNome() != lutador2.getNome()) {
            setDesafiado(lutador1);
            setDesafiante(lutador2); 
            JOptionPane.showMessageDialog(null, "Luta Aprovada!");
            aprovado = true;
        } else {
            // System.out.println("Luta Reprovada!");
            JOptionPane.showMessageDialog(null, "Luta Reprovada!");
            setDesafiante(null);
            setDesafiado(null);
            aprovado = false;
        }
    }

    public void lutar(Lutador lutador1, Lutador lutador2) {
        if (getAprovado()) {
            JOptionPane.showMessageDialog(null, "A Luta se iniciará!\n" +
                    "Desafiante: " + lutador1.getNome()
                    + "\nDesafiado: " + lutador2.getNome());

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0:
                    JOptionPane.showMessageDialog(null, "O vancedor foi " + lutador1.getNome());
                    lutador1.ganharLuta();
                    lutador2.perderLuta();
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "O vencedor foi " + lutador2.getNome());
                    lutador1.ganharLuta();
                    lutador2.perderLuta();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "A luta entre " + lutador1.getNome() + " e " + lutador2.getNome() + " terminou em empate!");
                    lutador1.empatarLuta();
                    lutador2.empatarLuta();
                    break;
            }

        } else {
            JOptionPane.showMessageDialog(null, "A luta não pode ser iniciada! \nOs lutadores têm Categorias diferentes");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
