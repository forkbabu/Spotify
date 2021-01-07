package defpackage;

import com.google.protobuf.u;
import com.spotify.mobile.android.video.exo.n;
import com.spotify.mobile.android.video.x;
import okhttp3.e;
import okhttp3.p;

/* renamed from: g72  reason: default package */
public class g72 implements p.b {
    private final gl0<u> a;
    private final n b;
    private final String c;
    private final String d;

    public g72(gl0<u> gl0, n nVar, String str, x xVar) {
        this.a = gl0;
        this.b = nVar;
        this.c = xVar.d();
        this.d = str;
    }

    @Override // okhttp3.p.b
    public p a(e eVar) {
        return new s72(this.a, this.b, this.c, this.d);
    }
}
