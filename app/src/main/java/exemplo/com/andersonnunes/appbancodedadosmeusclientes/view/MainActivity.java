package exemplo.com.andersonnunes.appbancodedadosmeusclientes.view;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import exemplo.com.andersonnunes.appbancodedadosmeusclientes.R;
import exemplo.com.andersonnunes.appbancodedadosmeusclientes.controller.ClienteORMController;
import exemplo.com.andersonnunes.appbancodedadosmeusclientes.model.ClienteORM;

public class MainActivity extends AppCompatActivity {

    ClienteORMController clienteORMController;

    List<ClienteORM> listaDeClientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clienteORMController = new ClienteORMController();

        ClienteORM objConsulta = clienteORMController.getByID(50);

        if (objConsulta != null)
            Log.d("db_log", "onCreate: "+objConsulta.getId()+" "+objConsulta.getNome());
        else Log.d("db_log", "onCreate: Não encontrado ");



    }
}