package defpackage;

import android.app.Activity;
import com.spotify.share.sharedata.t;
import io.reactivex.functions.l;

/* renamed from: x4e  reason: default package */
public final /* synthetic */ class x4e implements l {
    public final /* synthetic */ i5e a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ z7e c;
    public final /* synthetic */ long f;
    public final /* synthetic */ d8e n;
    public final /* synthetic */ t o;
    public final /* synthetic */ o8e p;

    public /* synthetic */ x4e(i5e i5e, Activity activity, z7e z7e, long j, d8e d8e, t tVar, o8e o8e) {
        this.a = i5e;
        this.b = activity;
        this.c = z7e;
        this.f = j;
        this.n = d8e;
        this.o = tVar;
        this.p = o8e;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, this.c, this.f, this.n, this.o, this.p, (w3e) obj);
    }
}
