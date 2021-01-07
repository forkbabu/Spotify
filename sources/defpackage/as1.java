package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import defpackage.ff2;
import io.reactivex.disposables.b;

/* renamed from: as1  reason: default package */
public final class as1 extends yr1 {
    public static final /* synthetic */ int j = 0;
    private final Context f;
    private final tq1 g;
    private AppProtocol.Context h;
    private b i;

    public as1(Context context, v1 v1Var, ff2.a aVar, tq1 tq1) {
        super(v1Var, aVar);
        context.getClass();
        this.f = context;
        this.g = tq1;
    }

    public static void k(as1 as1, AppProtocol.Context context) {
        if (!context.equals(as1.h)) {
            as1.h = context;
            as1.c(context);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
        this.i = this.g.a().j0(new xq1(this)).subscribe(new wq1(this), yq1.a);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void e() {
        b bVar = this.i;
        if (bVar != null && !bVar.d()) {
            this.i.dispose();
        }
    }

    @Override // defpackage.ff2
    public void f(df2 df2, int i2) {
        AppProtocol.Context context = this.h;
        if (context != null) {
            c(context);
        } else if (this.i == null) {
            d();
        }
    }

    public AppProtocol.Context l(u3 u3Var) {
        if (u3Var.a == null || u3Var.b == null) {
            return AppProtocol.Context.EMPTY;
        }
        S s = u3Var.b;
        s.getClass();
        F f2 = u3Var.a;
        f2.getClass();
        return new AppProtocol.Context(s, f2, this.f);
    }
}
