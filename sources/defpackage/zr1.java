package defpackage;

import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import defpackage.ff2;
import io.reactivex.disposables.a;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: zr1  reason: default package */
public final class zr1 extends yr1 {
    public static final /* synthetic */ int h = 0;
    private final s<String> f;
    private final a g = new a();

    public zr1(v1 v1Var, w wVar, ff2.a aVar, y yVar) {
        super(v1Var, aVar);
        this.f = wVar.a("type").I0(yVar).o0(yVar);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void e() {
        this.g.f();
    }

    @Override // defpackage.ff2
    public void f(df2 df2, int i) {
        this.g.b(this.f.subscribe(new uq1(this, i), vq1.a));
    }

    public void k(int i, String str) {
        b(i, new AppProtocol.Capabilities("premium".equals(str)));
    }
}
