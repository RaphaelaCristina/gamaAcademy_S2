import java.util.Date;

public class Time {

    private int hora , minuto, segundo;

    public Time(int h, int m, int s) {
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }

    public Time(int h, int m) {
        this.hora = h;
        this.minuto = m;
        this.segundo = 0;
    }

    public Time(int hora) {
        this.hora = hora;
        this.minuto = 0;
        this.segundo = 0;
    }

    public void setTime (int h, int m , int s){
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }

    public void setTime (int h, int m ){
        this.hora = h;
        this.minuto = m;
        this.segundo = 0;
    }



    public void setTime (int h){
        this.hora = h;
        this.minuto = 0;
        this.segundo = 0;
    }

    public String exibirHoraUniversal(){
    return this.hora + ":" + this.minuto + ":" + this.segundo;
    }

    public String exibirHoraPadrão(){

        /* 4 casos
        0h - 12AM
        12H - 12PM
        1-11 - horaAM
        13-23 - (hora-12)PM
         */

        String sufixo;
        String horaPadrao;
        if (hora == 0) {
            horaPadrao = "12";
            sufixo = "AM";
        } else if (hora == 12) {
            horaPadrao = "12";
            sufixo = "PM";
        } else if (hora > 0 && hora < 12) {
            horaPadrao = String.valueOf(hora);
            sufixo = "AM";
        } else {
            horaPadrao = String.valueOf(hora - 12);
            sufixo = "PM";
        }

        return horaPadrao + ":" + this.minuto + ":" + this.segundo + sufixo;
    }
}
