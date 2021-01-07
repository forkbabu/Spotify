package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.w0;
import org.json.JSONObject;

public class e {
    private final w0 a;

    e(w0 w0Var) {
        this.a = w0Var;
    }

    public u00 a(JSONObject jSONObject) {
        f fVar;
        if (jSONObject.getInt("settings_version") != 3) {
            fVar = new b();
        } else {
            fVar = new g();
        }
        return fVar.a(this.a, jSONObject);
    }
}
