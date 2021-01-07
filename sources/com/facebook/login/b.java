package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;

public class b extends j1 {
    private static g1 b;
    private static k1 c;

    public static k1 c() {
        k1 k1Var = c;
        c = null;
        return k1Var;
    }

    public static void d(Uri uri) {
        g1 g1Var;
        k1 k1Var = c;
        if (k1Var == null && k1Var == null && (g1Var = b) != null) {
            c = g1Var.c(null);
        }
        k1 k1Var2 = c;
        if (k1Var2 != null) {
            k1Var2.d(uri, null, null);
        }
    }

    @Override // defpackage.j1
    public void a(ComponentName componentName, g1 g1Var) {
        g1 g1Var2;
        b = g1Var;
        g1Var.d(0);
        if (c == null && (g1Var2 = b) != null) {
            c = g1Var2.c(null);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
