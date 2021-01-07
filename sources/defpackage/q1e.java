package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import io.reactivex.t;

/* renamed from: q1e  reason: default package */
public final /* synthetic */ class q1e implements Runnable {
    public final /* synthetic */ w1e a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ t c;
    public final /* synthetic */ ServiceConnection f;

    public /* synthetic */ q1e(w1e w1e, Context context, t tVar, ServiceConnection serviceConnection) {
        this.a = w1e;
        this.b = context;
        this.c = tVar;
        this.f = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b, this.c, this.f);
    }
}
