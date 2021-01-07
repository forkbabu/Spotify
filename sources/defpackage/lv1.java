package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.bakery.d;
import com.spotify.mobius.e0;
import defpackage.qv1;
import defpackage.rv1;
import defpackage.tv1;

/* renamed from: lv1  reason: default package */
public final /* synthetic */ class lv1 implements ti0 {
    public final /* synthetic */ tv1 a;

    public /* synthetic */ lv1(tv1 tv1) {
        this.a = tv1;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        tv1 tv1 = this.a;
        d h = ((rv1.d) obj).h();
        AuthorizationRequest a2 = tv1.a();
        a2.getClass();
        tv1.a f = tv1.f();
        f.c(Optional.of(h));
        return e0.g(f.b(), ImmutableSet.of(new qv1.d(a2, h)));
    }
}
