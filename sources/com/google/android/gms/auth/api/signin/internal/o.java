package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class o {
    private static o b;
    private c a;

    private o(Context context) {
        c b2 = c.b(context);
        this.a = b2;
        b2.c();
        this.a.d();
    }

    public static synchronized o c(Context context) {
        o oVar;
        synchronized (o.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (o.class) {
                oVar = b;
                if (oVar == null) {
                    oVar = new o(applicationContext);
                    b = oVar;
                }
            }
            return oVar;
        }
        return oVar;
    }

    public final synchronized void a() {
        this.a.a();
    }

    public final synchronized void b(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.a.f(googleSignInAccount, googleSignInOptions);
    }
}
