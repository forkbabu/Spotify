package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.BootstrapRequestNonAuth;

/* renamed from: r2a  reason: default package */
public class r2a implements q2a {
    private final gl0<u> a;
    private final String b;

    public r2a(gl0<u> gl0, t2a t2a) {
        this.a = gl0;
        this.b = t2a.a();
    }

    @Override // defpackage.q2a
    public void a(long j, int i, int i2) {
        BootstrapRequestNonAuth.b p = BootstrapRequestNonAuth.p();
        p.p(j);
        p.o(this.b);
        p.r(i);
        p.q((long) i2);
        this.a.d(p.build());
    }

    @Override // defpackage.q2a
    public void b(long j, Integer num) {
        BootstrapRequestNonAuth.b p = BootstrapRequestNonAuth.p();
        p.p(j);
        p.o(this.b);
        p.n("timeout");
        if (num != null) {
            p.r(num.intValue());
        }
        this.a.d(p.build());
    }

    @Override // defpackage.q2a
    public void c(long j, int i, int i2, String str, String str2) {
        BootstrapRequestNonAuth.b p = BootstrapRequestNonAuth.p();
        p.p(j);
        p.o(this.b);
        p.r(i);
        p.n(str);
        p.q((long) i2);
        if (str2 != null) {
            p.m(str2);
        }
        this.a.d(p.build());
    }
}
