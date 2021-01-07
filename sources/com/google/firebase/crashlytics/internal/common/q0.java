package com.google.firebase.crashlytics.internal.common;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class q0 extends JSONObject {
    final /* synthetic */ x0 a;

    q0(x0 x0Var) {
        this.a = x0Var;
        put("userId", x0Var.b());
    }
}
