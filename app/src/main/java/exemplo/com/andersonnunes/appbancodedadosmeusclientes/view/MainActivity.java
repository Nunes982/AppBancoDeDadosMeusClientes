package exemplo.com.andersonnunes.appbancodedadosmeusclientes.view;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import exemplo.com.andersonnunes.appbancodedadosmeusclientes.R;
import exemplo.com.andersonnunes.appbancodedadosmeusclientes.controller.ClienteORMController;
import exemplo.com.andersonnunes.appbancodedadosmeusclientes.model.ClienteORM;

public class MainActivity extends AppCompatActivity {

    ClienteORMController clienteORMController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clienteORMController = new ClienteORMController();

        ClienteORM orm;

        for (int i = 2; i < 35; i++) {

            orm = new ClienteORM();

            orm.setId(i);
            orm.setNome("Nome Cliente "+i);
            orm.setIdade(2*i);
            orm.setPreco(100*i);
            orm.setSalario(25*i);
            orm.setDataCadastro("20/09/2023");
            orm.setHoraCadastro("20:20");
            orm.setAtivo(true);

            clienteORMController.insert(orm);

        }
    }
}