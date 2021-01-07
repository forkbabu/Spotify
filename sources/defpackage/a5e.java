package defpackage;

import android.app.Activity;
import com.spotify.share.sharedata.t;
import io.reactivex.functions.l;

/* renamed from: a5e  reason: default package */
public final /* synthetic */ class a5e implements l {
    public final /* synthetic */ v5e a;
    public final /* synthetic */ t b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ z7e f;
    public final /* synthetic */ o8e n;
    public final /* synthetic */ long o;
    public final /* synthetic */ d8e p;

    public /* synthetic */ a5e(v5e v5e, t tVar, Activity activity, z7e z7e, o8e o8e, long j, d8e d8e) {
        this.a = v5e;
        this.b = tVar;
        this.c = activity;
        this.f = z7e;
        this.n = o8e;
        this.o = j;
        this.p = d8e;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, this.c, this.f, this.n, this.o, this.p, (w3e) obj);
    }
}
