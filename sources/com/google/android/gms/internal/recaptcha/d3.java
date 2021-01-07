package com.google.android.gms.internal.recaptcha;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.util.e;
import com.google.android.gms.recaptcha.c;
import com.google.android.gms.recaptcha.d;
import com.google.android.gms.recaptcha.f;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;

public final class d3 extends b<a.d.c> implements c {
    private static final a.g<d> l;
    private static final f m;
    private static final a.AbstractC0094a<d, a.d.c> n;
    private static final a<a.d.c> o;
    private final Context k;

    static {
        f fVar;
        a.g<d> gVar = new a.g<>();
        l = gVar;
        if (!e.c()) {
            fVar = new g();
        } else {
            fVar = new h();
        }
        m = fVar;
        h3 h3Var = new h3();
        n = h3Var;
        o = new a<>("Recaptcha.API", h3Var, gVar);
    }

    public d3(Activity activity) {
        super(activity, (a<a.d>) o, (a.d) null, b.a.c);
        this.k = activity;
        f fVar = m;
        new i(fVar);
        new l(activity, fVar);
    }

    public final g<Boolean> u(d dVar) {
        s.a a = s.a();
        a.b(new e3(this, dVar));
        a.d(f.d);
        return g(a.a());
    }

    public final g<com.google.android.gms.recaptcha.e> v(d dVar, com.google.android.gms.recaptcha.a aVar) {
        s.a a = s.a();
        a.b(new f3(this, dVar, aVar));
        a.d(f.c);
        return g(a.a());
    }

    public final g<d> w(String str) {
        s.a a = s.a();
        a.b(new c3(this, str));
        a.d(f.b);
        return g(a.a());
    }

    /* access modifiers changed from: package-private */
    public final void x(d dVar, com.google.android.gms.recaptcha.a aVar, d dVar2, h hVar) {
        c cVar = new c(hVar);
        Context context = this.k;
        String I1 = dVar.I1();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.recaptcha.internal.VERIFICATION_HISTORY_FILE_KEY", 0);
        String valueOf = String.valueOf(I1);
        String concat = valueOf.length() != 0 ? "verification_history_token_key:".concat(valueOf) : new String("verification_history_token_key:");
        String str = "";
        if (sharedPreferences.contains(concat)) {
            str = sharedPreferences.getString(concat, str);
        }
        ((b3) dVar2.z()).F2(cVar, dVar, new com.google.android.gms.recaptcha.a(aVar, str));
    }
}
