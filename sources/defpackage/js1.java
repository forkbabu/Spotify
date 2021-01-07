package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import defpackage.ff2;
import io.reactivex.disposables.b;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.y;

/* renamed from: js1  reason: default package */
public final class js1 extends yr1 {
    public static final /* synthetic */ int j = 0;
    private final Context f;
    private AppProtocol.Status g;
    private b h;
    private final y i;

    public js1(Context context, v1 v1Var, ff2.a aVar, y yVar) {
        super(v1Var, aVar);
        context.getClass();
        this.f = context;
        this.i = yVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
        this.h = new v(this.e.a0().O(new qr1(this)).Q(this.i)).M(Functions.f(), new or1(this)).subscribe(new pr1(this), rr1.a);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void e() {
        b bVar = this.h;
        if (bVar != null && !bVar.d()) {
            this.h.dispose();
        }
    }

    @Override // defpackage.ff2
    public void f(df2 df2, int i2) {
        AppProtocol.Status status = this.g;
        if (status != null) {
            c(status);
        }
    }

    public AppProtocol.Status k(SessionState sessionState) {
        Context context = this.f;
        if (sessionState.loggedIn()) {
            return AppProtocol.Status.OK;
        }
        return AppProtocol.Status.createNotLoggedIn(context);
    }

    public /* synthetic */ void l() {
        this.g = null;
    }

    public /* synthetic */ void m(AppProtocol.Status status) {
        AppProtocol.Status status2 = this.g;
        if (status2 == null || !status2.equals(status)) {
            c(status);
        }
        this.g = status;
    }
}
