package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.i4;
import com.spotify.mobile.android.spotlets.appprotocol.u3;

/* renamed from: nq1  reason: default package */
public class nq1 implements u3, kq1 {
    private final jq1 a;
    private final mq1 b;
    private u3.a c;

    public nq1(jq1 jq1, mq1 mq1) {
        this.a = jq1;
        this.b = mq1;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.u3
    public void a(u3.a aVar) {
        this.c = aVar;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.u3
    public void b(int i, byte[] bArr) {
        this.b.u(i, bArr);
    }

    public void c(byte b2) {
        this.b.p(b2);
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.u3
    public void close() {
        this.a.e();
        this.b.o();
    }

    public void d(byte b2, byte[] bArr) {
        this.b.t(b2);
        u3.a aVar = this.c;
        if (aVar != null) {
            ((i4) aVar).p(bArr.length, bArr);
        }
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.u3
    public void start() {
        this.a.f(this);
        this.a.g();
    }
}
