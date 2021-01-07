package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import com.google.android.gms.cast.framework.f;

/* access modifiers changed from: package-private */
public final class w1 implements s1 {
    private static w1 c;
    private final Context a;
    private final ContentObserver b;

    private w1(Context context) {
        this.a = context;
        y1 y1Var = new y1();
        this.b = y1Var;
        context.getContentResolver().registerContentObserver(k1.a, true, y1Var);
    }

    static w1 a(Context context) {
        w1 w1Var;
        synchronized (w1.class) {
            if (c == null) {
                c = e2.d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new w1(context) : new w1();
            }
            w1Var = c;
        }
        return w1Var;
    }

    static synchronized void b() {
        Context context;
        synchronized (w1.class) {
            w1 w1Var = c;
            if (!(w1Var == null || (context = w1Var.a) == null || w1Var.b == null)) {
                context.getContentResolver().unregisterContentObserver(c.b);
            }
            c = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String c(String str) {
        return k1.a(this.a.getContentResolver(), str);
    }

    @Override // com.google.android.gms.internal.measurement.s1
    public final Object d(String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) f.j(new v1(this, str));
        } catch (IllegalStateException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    private w1() {
        this.a = null;
        this.b = null;
    }
}
