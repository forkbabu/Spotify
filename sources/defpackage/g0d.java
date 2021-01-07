package defpackage;

import com.spotify.share.sharedata.t;
import io.reactivex.functions.g;

/* renamed from: g0d  reason: default package */
public final /* synthetic */ class g0d implements g {
    public final /* synthetic */ u0d a;
    public final /* synthetic */ o8e b;
    public final /* synthetic */ int c;
    public final /* synthetic */ t f;

    public /* synthetic */ g0d(u0d u0d, o8e o8e, int i, t tVar) {
        this.a = u0d;
        this.b = o8e;
        this.c = i;
        this.f = tVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a(this.b, this.c, this.f, (Throwable) obj);
    }
}
