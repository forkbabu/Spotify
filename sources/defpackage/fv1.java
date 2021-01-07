package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ErrorMessage;
import com.spotify.mobile.android.sso.protocol.ProtocolVersion;
import com.spotify.mobile.android.util.x;
import com.spotify.mobius.e0;
import defpackage.qv1;
import defpackage.rv1;
import defpackage.tv1;

/* renamed from: fv1  reason: default package */
public final /* synthetic */ class fv1 implements ti0 {
    public final /* synthetic */ tv1 a;

    public /* synthetic */ fv1(tv1 tv1) {
        this.a = tv1;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        rv1.e eVar = (rv1.e) obj;
        tv1.a f = this.a.f();
        ProtocolVersion j = eVar.j();
        AuthorizationRequest k = eVar.k();
        boolean h = eVar.h();
        boolean i = eVar.i();
        String str = (String) x.n(k.i(), "");
        if (j == ProtocolVersion.UNRESOLVED) {
            return e0.a(ImmutableSet.of(new qv1.f(ErrorMessage.INVALID_VERSION_ERROR, str)));
        }
        f.f(j);
        if (!h) {
            return e0.a(ImmutableSet.of(new qv1.f(ErrorMessage.NO_INTERNET_CONNECTION, str)));
        }
        if (k.c() == null && (k.f() == AuthorizationRequest.ResponseType.TOKEN || j != ProtocolVersion.URI_V1) && !i) {
            return e0.a(ImmutableSet.of(new qv1.f(ErrorMessage.CLIENT_VERIFICATION_ERROR, str)));
        }
        String e = k.e();
        if (MoreObjects.isNullOrEmpty(k.b()) || MoreObjects.isNullOrEmpty(e)) {
            return e0.a(ImmutableSet.of(new qv1.f(ErrorMessage.INVALID_PARAMETERS_ERROR, str)));
        }
        f.a(k);
        return e0.g(f.b(), ImmutableSet.of(new qv1.k()));
    }
}
