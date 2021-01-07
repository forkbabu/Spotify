package defpackage;

import com.spotify.mobile.android.rx.w;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.k;

/* renamed from: a78  reason: default package */
public final /* synthetic */ class a78 implements k {
    public final /* synthetic */ w a;
    public final /* synthetic */ wlf b;
    public final /* synthetic */ wlf c;

    public /* synthetic */ a78(w wVar, wlf wlf, wlf wlf2) {
        this.a = wVar;
        this.b = wlf;
        this.c = wlf2;
    }

    @Override // io.reactivex.k
    public final tpf a(g gVar) {
        return this.a.b().Y0(BackpressureStrategy.LATEST).F(new z68(gVar, this.b, this.c));
    }
}
