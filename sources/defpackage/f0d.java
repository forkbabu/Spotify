package defpackage;

import com.spotify.share.sharedata.t;
import io.reactivex.functions.l;

/* renamed from: f0d  reason: default package */
public final /* synthetic */ class f0d implements l {
    public final /* synthetic */ u0d a;
    public final /* synthetic */ o8e b;
    public final /* synthetic */ int c;

    public /* synthetic */ f0d(u0d u0d, o8e o8e, int i) {
        this.a = u0d;
        this.b = o8e;
        this.c = i;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, this.c, (t) obj);
    }
}
