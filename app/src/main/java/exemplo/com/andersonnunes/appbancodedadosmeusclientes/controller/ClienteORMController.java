package exemplo.com.andersonnunes.appbancodedadosmeusclientes.controller;

import exemplo.com.andersonnunes.appbancodedadosmeusclientes.model.ClienteORM;
import io.realm.Realm;

public class ClienteORMController {

    public void insert(ClienteORM obj) {

        Realm realm = Realm.getDefaultInstance();

        Number primaryKey = realm.where(ClienteORM.class).max("id");

        final int autoIncrementPrimaryKey = (primaryKey == null) ? 1 : primaryKey.intValue();

        obj.setId(autoIncrementPrimaryKey);

        realm.beginTransaction();
        realm.copyToRealm(obj);
        realm.commitTransaction();
        realm.close();

    }

    public void update(ClienteORM obj) {

        Realm realm = Realm.getDefaultInstance();

        ClienteORM clienteORM = realm.where(ClienteORM.class).equalTo("id", obj.getId())
                .findFirst();

        realm.beginTransaction();

        clienteORM.setNome(obj.getNome());
        clienteORM.setSalario(obj.getSalario());
        clienteORM.setPreco(obj.getPreco());
        clienteORM.setIdade(obj.getIdade());
        clienteORM.setDataCadastro(obj.getDataCadastro());
        clienteORM.setHoraCadastro(obj.getHoraCadastro());
        clienteORM.setAtivo(obj.isAtivo());

        realm.commitTransaction();
        realm.close();

    }

}
