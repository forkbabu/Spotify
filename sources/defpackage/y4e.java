package defpackage;

import android.app.Activity;
import com.spotify.share.sharedata.t;
import com.spotify.share.util.a;
import io.reactivex.functions.l;

/* renamed from: y4e  reason: default package */
public final /* synthetic */ class y4e implements l {
    public final /* synthetic */ k5e a;
    public final /* synthetic */ z7e b;
    public final /* synthetic */ o8e c;
    public final /* synthetic */ long f;
    public final /* synthetic */ d8e n;
    public final /* synthetic */ t o;
    public final /* synthetic */ a.C0388a p;
    public final /* synthetic */ Activity q;

    public /* synthetic */ y4e(k5e k5e, z7e z7e, o8e o8e, long j, d8e d8e, t tVar, a.C0388a aVar, Activity activity) {
        this.a = k5e;
        this.b = z7e;
        this.c = o8e;
        this.f = j;
        this.n = d8e;
        this.o = tVar;
        this.p = aVar;
        this.q = activity;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, this.c, this.f, this.n, this.o, this.p, this.q, (w3e) obj);
    }
}
