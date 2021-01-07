package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.util.connectivity.r;
import defpackage.ff2;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.y;

/* renamed from: hs1  reason: default package */
public final class hs1 extends yr1 {
    public static final /* synthetic */ int j = 0;
    private final Context f;
    private b g;
    private SessionState h;
    private final y i;

    public hs1(Context context, v1 v1Var, ff2.a aVar, y yVar) {
        super(v1Var, aVar);
        context.getClass();
        this.f = context;
        this.i = yVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
        g<SessionState> a0 = this.e.a0();
        a0.getClass();
        this.g = new v(a0).o0(this.i).M(Functions.f(), new jr1(this)).subscribe(new kr1(this), lr1.a);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void e() {
        b bVar = this.g;
        if (bVar != null && !bVar.d()) {
            this.g.dispose();
        }
    }

    @Override // defpackage.ff2
    public void f(df2 df2, int i2) {
        c(new AppProtocol.SessionState(this.h, r.a(this.f)));
    }

    public /* synthetic */ void k() {
        this.h = null;
    }

    public void l(SessionState sessionState) {
        this.h = sessionState;
        c(new AppProtocol.SessionState(sessionState, r.a(this.f)));
    }
}
