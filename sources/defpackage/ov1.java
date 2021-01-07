package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobius.e0;
import defpackage.rv1;
import defpackage.tv1;

/* renamed from: ov1  reason: default package */
public final /* synthetic */ class ov1 implements ti0 {
    public final /* synthetic */ tv1 a;

    public /* synthetic */ ov1(tv1 tv1) {
        this.a = tv1;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        tv1 tv1 = this.a;
        AuthorizationRequest a2 = tv1.a();
        a2.getClass();
        tv1.a f = tv1.f();
        f.d(true);
        return e0.g(f.b(), ImmutableSet.of((qv1) ((rv1.b) obj).h().b(nv1.a, kv1.a, gv1.a, new hv1(a2, tv1), new pv1(a2, tv1))));
    }
}
