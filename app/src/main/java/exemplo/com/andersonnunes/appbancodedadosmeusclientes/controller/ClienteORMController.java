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
}
