package defpackage;

import com.spotify.pageloader.NetworkErrorReason;
import com.spotify.pageloader.l0;
import io.reactivex.functions.l;

/* renamed from: bud  reason: default package */
public final /* synthetic */ class bud implements l {
    public final /* synthetic */ Throwable a;

    public /* synthetic */ bud(Throwable th) {
        this.a = th;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return l0.f(this.a, (NetworkErrorReason) obj);
    }
}
