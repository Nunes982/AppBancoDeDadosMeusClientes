package exemplo.com.andersonnunes.appbancodedadosmeusclientes.view;

import android.app.Application;
import android.util.Log;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class AppApplication extends Application {

    public static final String DB_NAME = "MeusClientes.realm";
    public static final int DB_VERSION = 1;

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);

        RealmConfiguration config = new RealmConfiguration.Builder()
                .name(DB_NAME)
                .schemaVersion(DB_VERSION)
                .allowWritesOnUiThread(true) // Necessário para trabalhar em 2º plano
                .build();

        Realm realm = Realm.getInstance(config); // cria um objeto padrão singleton

        Log.d("db_log", "onCreate: Realm criado com sucesso: "+DB_NAME+" versão: "+DB_VERSION);

    }
}
