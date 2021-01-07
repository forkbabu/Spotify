package com.spotify.music.features.payfail;

import android.content.Context;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.util.t;
import com.spotify.music.features.checkout.web.PremiumSignupActivity;
import com.spotify.music.features.checkout.web.i;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

public class u {
    private final Context a;
    private final t b;
    private final y c;
    private final w d;
    private final yn1 e;
    private final r f;
    private b g = EmptyDisposable.INSTANCE;

    public u(Context context, t tVar, y yVar, w wVar, yn1 yn1, r rVar) {
        this.b = tVar;
        this.a = context;
        this.c = yVar;
        this.d = wVar;
        this.e = yn1;
        this.f = rVar;
    }

    public static void a(u uVar, xa1 xa1) {
        uVar.getClass();
        i.a c2 = i.c();
        c2.d(uVar.b);
        uVar.c.l(uVar.f, PremiumSignupActivity.U0(uVar.a, c2.a()), xa1);
    }

    public void b() {
        this.g.dispose();
        this.g = s.n(new v(this.e.a().C(e.a).s()), this.d.c("payment-state").j0(d.a).E(), c.a).subscribe(new f(this));
    }

    public void c() {
        this.g.dispose();
    }
}
