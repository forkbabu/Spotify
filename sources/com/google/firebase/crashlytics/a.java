package com.google.firebase.crashlytics;

import android.os.Bundle;
import defpackage.oy;

/* access modifiers changed from: package-private */
public class a implements oy.b {
    private yy a;
    private yy b;

    a() {
    }

    @Override // defpackage.oy.b
    public void a(int i, Bundle bundle) {
        yy yyVar;
        ty f = ty.f();
        f.b("Received Analytics message: " + i + " " + bundle);
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                yyVar = this.a;
            } else {
                yyVar = this.b;
            }
            if (yyVar != null) {
                yyVar.b(string, bundle2);
            }
        }
    }

    public void b(yy yyVar) {
        this.b = yyVar;
    }

    public void c(yy yyVar) {
        this.a = yyVar;
    }
}
