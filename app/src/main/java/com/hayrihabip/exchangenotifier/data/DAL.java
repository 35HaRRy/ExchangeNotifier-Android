package com.hayrihabip.exchangenotifier.data;

import android.app.Application;

import com.hayrihabip.data.RestService;

import java.util.Map;

public class DAL extends RestService {

    public DAL(Application mApp) {
        super(mApp);
    }

    public Map<String, Object> InsertUpdate(Map<String, Object> user) {
        return call("dbRequest/", "insertUpdateUser", user, true, false).get(0);
    }
}
