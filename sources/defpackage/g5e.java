package defpackage;

import android.app.Activity;
import com.spotify.share.sharedata.t;
import io.reactivex.functions.l;

/* renamed from: g5e  reason: default package */
public final /* synthetic */ class g5e implements l {
    public final /* synthetic */ c7e a;
    public final /* synthetic */ z7e b;
    public final /* synthetic */ long c;
    public final /* synthetic */ t f;
    public final /* synthetic */ d8e n;
    public final /* synthetic */ o8e o;
    public final /* synthetic */ Activity p;

    public /* synthetic */ g5e(c7e c7e, z7e z7e, long j, t tVar, d8e d8e, o8e o8e, Activity activity) {
        this.a = c7e;
        this.b = z7e;
        this.c = j;
        this.f = tVar;
        this.n = d8e;
        this.o = o8e;
        this.p = activity;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, this.c, this.f, this.n, this.o, this.p, (w3e) obj);
    }
}
