package Clases;

public class Valor {

//Clases para commit inicial

    private int valorFarenheith;
    private int valorRevival;
    private int valorElalquimista;
    private int valorElPoder;
    private int valorDespertar;

    public Valor ()
    {

        valorFarenheith = 7000;
        valorRevival = 22000;
        valorElalquimista =  45000;
        valorElPoder = 88000;
        valorDespertar = 156000;

    }

    public int getValorFarenheith() {
        return valorFarenheith;
    }

    public int getValorRevival() {
        return valorRevival;
    }

    public int getValorElalquimista() {
        return valorElalquimista;
    }

    public  int getValorElPoder(){
        return valorElPoder;
    }

    public int getValorDespertar(){
        return valorDespertar;
    }
}

