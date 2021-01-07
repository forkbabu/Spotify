package defpackage;

import android.content.Context;

/* renamed from: q9  reason: default package */
public class q9 {
    private static q9 e;
    private k9 a;
    private l9 b;
    private o9 c;
    private p9 d;

    private q9(Context context, na naVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = new k9(applicationContext, naVar);
        this.b = new l9(applicationContext, naVar);
        this.c = new o9(applicationContext, naVar);
        this.d = new p9(applicationContext, naVar);
    }

    public static synchronized q9 c(Context context, na naVar) {
        q9 q9Var;
        synchronized (q9.class) {
            if (e == null) {
                e = new q9(context, naVar);
            }
            q9Var = e;
        }
        return q9Var;
    }

    public k9 a() {
        return this.a;
    }

    public l9 b() {
        return this.b;
    }

    public o9 d() {
        return this.c;
    }

    public p9 e() {
        return this.d;
    }
}
