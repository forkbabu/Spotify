package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.r;
import java.util.Iterator;

public final class i {
    private static pr a = new pr("GoogleSignInCommon", new String[0]);

    public static d a(Intent intent) {
        Status status = Status.q;
        if (intent == null) {
            return new d(null, status);
        }
        Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new d(googleSignInAccount, Status.o);
        }
        if (status2 != null) {
            status = status2;
        }
        return new d(null, status);
    }

    public static Intent b(Context context, GoogleSignInOptions googleSignInOptions) {
        a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static e<Status> c(c cVar, Context context, boolean z) {
        a.a("Signing out", new Object[0]);
        d(context);
        if (!z) {
            return cVar.b(new l(cVar));
        }
        Status status = Status.o;
        g.k(status, "Result must not be null");
        r rVar = new r(cVar);
        rVar.a(status);
        return rVar;
    }

    private static void d(Context context) {
        o.c(context).a();
        Iterator<c> it = c.c().iterator();
        if (!it.hasNext()) {
            com.google.android.gms.common.api.internal.g.a();
        } else {
            it.next().getClass();
            throw new UnsupportedOperationException();
        }
    }

    public static Intent e(Context context, GoogleSignInOptions googleSignInOptions) {
        a.a("getFallbackSignInIntent()", new Object[0]);
        Intent b = b(context, googleSignInOptions);
        b.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return b;
    }

    public static e<Status> f(c cVar, Context context, boolean z) {
        a.a("Revoking access", new Object[0]);
        String e = c.b(context).e();
        d(context);
        if (z) {
            return e.a(e);
        }
        return cVar.b(new n(cVar));
    }

    public static Intent g(Context context, GoogleSignInOptions googleSignInOptions) {
        a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent b = b(context, googleSignInOptions);
        b.setAction("com.google.android.gms.auth.NO_IMPL");
        return b;
    }
}
