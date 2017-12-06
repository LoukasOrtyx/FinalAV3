package Tabuleiro;

import java.util.ArrayList;
import javafx.scene.image.ImageView;

/**
 *
 * @author
 */
    public final class Temer extends Peça {

    public Temer(int cor, int x, int y) {
        
        super("png/Temer.jpg");
        setCor(cor);
        setX(x);
        setY(y);
        
        setFitHeight(TamCasa);
        setFitWidth(TamCasa);
        
        nome = 'O';
        
    }

    public int getCor() {
        
        return Cor;
    }

    public void setCor(int Cor) {
        Cor = Cor;
    }


    public void setX(int X) {
        this.X = X;
    }


    public void setY(int Y) {
        this.Y = Y;
    }

    public char getFormato() {
        return Formato;
    }

    public void setFormato(char Formato) {
        this.Formato = Formato;
    }
    
    public char getNome(){
        return this.nome;
    }

    @Override
    public ArrayList<Integer> TraçarCaminhos(int NovoX, int NovoY) {
        ArrayList<Integer> Caminho = new ArrayList<>();
        if (NovoX == -1 && NovoY == -1) {
            
            
            Caminho.add(X + 1);
            Caminho.add(Y);
            
            Caminho.add(SeparaRumos);
            
            Caminho.add(X + 2);
            Caminho.add(Y);
            
            Caminho.add(SeparaRumos);
            
            Caminho.add(X + 3);
            Caminho.add(Y);

            
        Caminho.add(SeparaRumos);
        Caminho.add(FIM);
            
            
        } else {

            return null;
        }

        return Caminho;
    }

    @Override
    public ArrayList<Integer> TraçarCaptura(int NovoX, int NovoY) { 
        
        ArrayList<Integer> Captura = new ArrayList<>();
        
        if(NovoX == -1 || NovoY == -1) {
            
            Captura.add(X - 1);
            Captura.add(Y); 
            
            Captura.add(SeparaRumos);
            
            Captura.add(X + 1); 
            Captura.add(Y); 
            
      
            
        Captura.add(SeparaRumos);
        Captura.add(FIM);
            
        } else {
            
            return null;
        }

        return Captura;
    }

}