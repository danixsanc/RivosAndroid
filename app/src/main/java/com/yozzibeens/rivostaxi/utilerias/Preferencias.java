package com.yozzibeens.rivostaxi.utilerias;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by danixsanc on 27/09/2015.
 */
public class Preferencias {

    private final String SHARED_PREFS_FILE = "HMPrefs";
    private final String TUTORIAL = "tutorial";
    private final String SESION = "sesion";
    private final String CLIENTID = "clientid";

    public int s;
    private Context mContext;

    public Preferencias(Context context){
        mContext = context;
    }

    private SharedPreferences getSettings(){
        return mContext.getSharedPreferences(SHARED_PREFS_FILE, 0);
    }

    public void setTutorial(boolean prSave){
        SharedPreferences.Editor editor = getSettings().edit();
        editor.putBoolean(TUTORIAL, prSave);
        editor.commit();
    }

    public boolean getTutorial() {
        return getSettings().getBoolean(TUTORIAL, true);
    }

    public void setSesion(boolean prSave2){
        SharedPreferences.Editor editor = getSettings().edit();
        editor.putBoolean(SESION, prSave2);
        editor.commit();
    }

    public boolean getSesion(){
        return getSettings().getBoolean(SESION, true);
    }




    public String getClient_Id(){
        return getSettings().getString(CLIENTID, CLIENTID);
    }

    public void setClient_Id(String prSave){
        SharedPreferences.Editor editor = getSettings().edit();
        editor.putString(CLIENTID, prSave);
        editor.commit();
    }

}
