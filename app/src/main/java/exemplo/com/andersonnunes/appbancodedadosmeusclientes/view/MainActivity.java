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
        orm.setNome("Maddo");
        orm.setIdade(18);
        orm.setPreco(12.97);
        orm.setSalario(999.95);
        orm.setDataCadastro("14/09/2023");
        orm.setHoraCadastro("12:40");

        clienteORMController.insert(orm);

    }
}