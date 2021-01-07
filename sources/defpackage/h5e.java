package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.common.base.Optional;
import com.spotify.share.base.linkgeneration.proto.UtmParameters;
import com.spotify.share.sharedata.t;
import com.spotify.share.sharedata.u;
import defpackage.b4e;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: h5e  reason: default package */
abstract class h5e implements i6e {
    private final w9e a;
    private final x3e b;
    private final y c;
    private final y d;

    h5e(w9e w9e, x3e x3e, y yVar, y yVar2) {
        this.a = w9e;
        this.b = x3e;
        this.c = yVar;
        this.d = yVar2;
    }

    @Override // defpackage.i6e
    public /* synthetic */ Exception a(Context context, o8e o8e) {
        return h6e.a(this, context, o8e);
    }

    @Override // defpackage.i6e
    public z<String> c(Activity activity, o8e o8e, t tVar, z7e z7e, d8e d8e, long j) {
        UtmParameters.b bVar;
        if (!b(tVar)) {
            return z.q(a(activity, o8e));
        }
        u uVar = (u) tVar;
        String c2 = this.a.c();
        String f = this.a.f();
        if (uVar.c() == null) {
            bVar = UtmParameters.t();
            bVar.p(c2);
            bVar.o(f);
        } else {
            if (uVar.c().f() != null) {
                c2 = uVar.c().f();
            }
            if (uVar.c().e() != null) {
                f = uVar.c().e();
            }
            bVar = UtmParameters.t();
            bVar.o(f);
            bVar.p(c2);
            if (uVar.c().c() != null) {
                bVar.n(uVar.c().c());
            }
            if (uVar.c().b() != null) {
                bVar.m(uVar.c().b());
            }
            if (uVar.c().g() != null) {
                bVar.q(uVar.c().g());
            }
        }
        b4e.a a2 = b4e.a(uVar.g());
        a2.c(uVar.a());
        a2.d((UtmParameters) bVar.build());
        a2.a(uVar.f());
        return this.b.a(a2.build()).A(new w4e(this, uVar)).H(this.c).B(this.d).s(new v4e(this, z7e, o8e, j, d8e, uVar, activity));
    }

    /* access modifiers changed from: protected */
    public abstract <T extends m8e> Optional<u3<w3e, Intent>> d(u<T> uVar, w3e w3e);
}
