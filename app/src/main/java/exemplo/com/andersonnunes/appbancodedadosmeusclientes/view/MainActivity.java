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

/*        ClienteORM orm;

        for (int i = 1; i < 21; i++) {

            orm = new ClienteORM();

            orm.setId(i);
            orm.setNome("Nome Cliente "+i);
            orm.setIdade(2*i);
            orm.setPreco(100*i);
            orm.setSalario(25*i);
            orm.setDataCadastro("15/09/2023");
            orm.setHoraCadastro("14:05");
            orm.setAtivo(true);

            clienteORMController.insert(orm);
        }*/

        clienteORMController.listar();

        for (ClienteORM obj: listaDeClientes) {

            Log.d("db_log","onCreate: "+obj.getId()+" "+obj.getNome());

        }

    }
}