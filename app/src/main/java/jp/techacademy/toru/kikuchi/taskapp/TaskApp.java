package jp.techacademy.toru.kikuchi.taskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by SBM on 2/22/17.
 */

public class TaskApp extends Application{
    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
    }
}
