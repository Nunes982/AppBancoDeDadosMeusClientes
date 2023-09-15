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

        ClienteORM orm = new ClienteORM();

        orm.setId(1);
        orm.setNome("Marco Maddo");
        orm.setIdade(21);
        orm.setPreco(14.97);
        orm.setSalario(789.95);
        orm.setDataCadastro("20/09/2023");
        orm.setHoraCadastro("20:20");
        orm.setAtivo(true);

        clienteORMController.update(orm);

    }
}