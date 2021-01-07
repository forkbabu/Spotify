package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.bakery.d;
import com.spotify.mobile.android.sso.protocol.ProtocolVersion;
import defpackage.uv1;

/* renamed from: tv1  reason: default package */
public abstract class tv1 {
    public static final tv1 a;

    /* renamed from: tv1$a */
    public static abstract class a {
        public abstract a a(AuthorizationRequest authorizationRequest);

        public abstract tv1 b();

        public abstract a c(Optional<d> optional);

        public abstract a d(boolean z);

        public abstract a e(boolean z);

        public abstract a f(ProtocolVersion protocolVersion);

        public abstract a g(boolean z);
    }

    static {
        uv1.b bVar = new uv1.b();
        bVar.a(null);
        bVar.f(ProtocolVersion.UNRESOLVED);
        bVar.c(Optional.absent());
        bVar.e(false);
        bVar.d(false);
        bVar.g(false);
        a = bVar.b();
    }

    public abstract AuthorizationRequest a();

    public abstract Optional<d> b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract ProtocolVersion e();

    public abstract a f();

    public abstract boolean g();
}
