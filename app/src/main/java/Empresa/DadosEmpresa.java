package Empresa;

import android.content.Intent;
import android.util.Log;
import android.widget.TextView;

import com.example.testeaplicacasenhausuarioempresa.EmpresaActivity2;
import com.example.testeaplicacasenhausuarioempresa.MainActivity;

public class DadosEmpresa {
    private final static String id="123", senha="666";
    private boolean acesso=false;


    public DadosEmpresa(){

    }
    public void ConfereDados(String idd,String senhaa){
        if(idd.equals(id) && senhaa.equals(senha)){
            Log.i("Informacao","Dados Corretos");



        }else {
            Log.i("Informacao","Dados Invalidos ");


        }

    }

    public static String getId() {
        return id;
    }

    public static String getSenha() {
        return senha;
    }

    public boolean isAcesso() {
        return acesso;
    }

}
