package defpackage;

import android.app.Activity;
import com.spotify.share.sharedata.t;
import io.reactivex.functions.l;

/* renamed from: f5e  reason: default package */
public final /* synthetic */ class f5e implements l {
    public final /* synthetic */ z6e a;
    public final /* synthetic */ t b;
    public final /* synthetic */ z7e c;
    public final /* synthetic */ long f;
    public final /* synthetic */ d8e n;
    public final /* synthetic */ o8e o;
    public final /* synthetic */ Activity p;

    public /* synthetic */ f5e(z6e z6e, t tVar, z7e z7e, long j, d8e d8e, o8e o8e, Activity activity) {
        this.a = z6e;
        this.b = tVar;
        this.c = z7e;
        this.f = j;
        this.n = d8e;
        this.o = o8e;
        this.p = activity;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, this.c, this.f, this.n, this.o, this.p, (w3e) obj);
    }
}
