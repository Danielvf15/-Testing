package jeugotresenraya;

import java.awt.Color;
import javax.swing.JOptionPane;

public class juegoLogica {
    int turno;
    int pX;
    int pO;
    public juegoLogica(int turno, int pX, int pO) {
        this.turno = turno;
        this.pX = pX;
        this.pO = pO;
    }
    public int getTurno() {
        return turno;
    }
    public void setTurno(int turno) {
        this.turno = turno;
    }
    public int getpX() {
        return pX;
    }
    public void setpX(int pX) {
        this.pX = pX;
    }
    public int getpO() {
        return pO;
    }
    public void setpO(int pO) {
        this.pO = pO;
    }
    public void intercambiar(){
        if(getTurno() == 0){
            setTurno(1);
        }else{
            setTurno(0);
        }
    }
    public int juego(int matriz[][]){
        // posibilidades en horizontal
        if(matriz[0][0] == matriz[0][1] && matriz[0][0]==matriz[0][2]){
            return 1;
            //arriba
        }
        if(matriz[1][0] == matriz[1][1] && matriz[1][0]==matriz[1][2]){
            return 2;
            //mediohor
        }
        if(matriz[2][0] == matriz[2][1] && matriz[2][0]==matriz[2][2]){
            return 3;
            //abajo
        }
        // posibilidades en vertical
        if(matriz[0][0] == matriz[1][0] && matriz[0][0]==matriz[2][0]){
            return 4;
            //izqver
        }
        if(matriz[0][1] == matriz[1][1] && matriz[0][1]==matriz[2][1]){
            return 5;
            //mediover
        }
        if(matriz[0][2] == matriz[1][2] && matriz[0][2]==matriz[2][2]){
            return 6;
            //derver
        }
        // posibilidad de diagonal
        if(matriz[0][0] == matriz[1][1] && matriz[0][0]==matriz[2][2]){
            return 7;
            //diagonal1
        }
        if(matriz[2][0] == matriz[1][1] && matriz[2][0]==matriz[0][2]){
            return 8;
            //diagonal2
        }
            return 0;
    }
    public int ejecutar(javax.swing.JButton bt, int i, int j, int matriz[][], javax.swing.JLabel jx, javax.swing.JLabel jo){
        matriz[i][j] = getTurno();
        String n = new String();
        if(getTurno()==0){
            n="X";
            bt.setForeground(Color.red);
        }else{
            n="O";
            bt.setForeground(Color.blue);
        }
        intercambiar();
        bt.setText(n);
        bt.setEnabled(false);
        
        if(juego(matriz) != 0){
            JOptionPane.showMessageDialog(null,"GANASTE " + n);
            if(getTurno()==1)
            {
             setpX(getpX()+1); 
             jx.setText(String.valueOf(getpX()));
            }
            if(getTurno()==0)
            {
             setpO(getpO()+1); 
             jo.setText(String.valueOf(getpO()));
            }
            return 1;
        }
        return 0;
    }
    public void rayar(int matriz[][],javax.swing.JPanel p, int n, int i, int j)
    {
        matriz[i][j] =getTurno();
        if(juego(matriz)==n)
        {
            p.setVisible(true);
        }
    }
    public void rayar(int matriz[][],javax.swing.JLabel p, int n, int i, int j)
    {
        matriz[i][j] =getTurno();
        if(juego(matriz)==n)
        {
            p.setVisible(true);
        }
    }
}
   
