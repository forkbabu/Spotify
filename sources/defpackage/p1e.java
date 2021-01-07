package defpackage;

import android.content.Context;
import io.reactivex.t;
import io.reactivex.u;

/* renamed from: p1e  reason: default package */
public final /* synthetic */ class p1e implements u {
    public final /* synthetic */ w1e a;
    public final /* synthetic */ Context b;

    public /* synthetic */ p1e(w1e w1e, Context context) {
        this.a = w1e;
        this.b = context;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        this.a.b(this.b, tVar);
    }
}
