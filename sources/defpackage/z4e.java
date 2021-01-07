package defpackage;

import android.app.Activity;
import com.spotify.share.sharedata.t;
import io.reactivex.functions.l;

/* renamed from: z4e  reason: default package */
public final /* synthetic */ class z4e implements l {
    public final /* synthetic */ t5e a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ z7e c;
    public final /* synthetic */ o8e f;
    public final /* synthetic */ long n;
    public final /* synthetic */ d8e o;
    public final /* synthetic */ t p;

    public /* synthetic */ z4e(t5e t5e, Activity activity, z7e z7e, o8e o8e, long j, d8e d8e, t tVar) {
        this.a = t5e;
        this.b = activity;
        this.c = z7e;
        this.f = o8e;
        this.n = j;
        this.o = d8e;
        this.p = tVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, this.c, this.f, this.n, this.o, this.p, (w3e) obj);
    }
}
