package Tabuleiro;

import java.util.ArrayList;
import javafx.scene.image.ImageView;

/**
 *
 * @author
 */
    public final class Paz extends Peça {

    public Paz(int cor, int x, int y) {
        
        super("png/Paz.jpg");
        setCor(cor);
        setX(x);
        setY(y);
        
        setFitHeight(TamCasa);
        setFitWidth(TamCasa);
        
        nome = 'P';
        
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
    public ArrayList<Integer> TraçarCaminhos(int NovoX, int NovoY) { //A peça se move no formato de um tridente, tanto pra cima quanto para baixo.
        
        ArrayList<Integer> Caminho = new ArrayList<>();
        if (NovoX == -1 && NovoY == -1) {//Traçando caminho pra cima e esquerda
            
            
            Caminho.add(X - 1);
            Caminho.add(Y - 1);

         Caminho.add(SeparaRumos);
            
            
            Caminho.add(X - 1);
            Caminho.add(Y + 1);
         
         Caminho.add(SeparaRumos);
            
           
            Caminho.add(X + 1);
            Caminho.add(Y - 1);
       
        Caminho.add(SeparaRumos);
        
          
            Caminho.add(X + 1);
            Caminho.add(Y + 1);
            
        Caminho.add(SeparaRumos);
        Caminho.add(FIM);
            
            
        } else {

            return null;
        }

        return Caminho;
    }

    @Override
    public ArrayList<Integer> TraçarCaptura(int NovoX, int NovoY) { //A peça comerá + 1 e -1 da peça
        
        ArrayList<Integer> Captura = new ArrayList<>();
        
        if(NovoX == -1 || NovoY == -1) {
            
            Captura.add(X); 
            Captura.add(Y - 1);
            
            Captura.add(SeparaRumos);
            
            Captura.add(X); 
            Captura.add(Y + 1); 
      
            
        Captura.add(SeparaRumos);
        Captura.add(FIM);
            
        } else {
            
            return null;
        }

        return Captura;
    }

}