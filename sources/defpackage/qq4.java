package defpackage;

import com.spotify.libs.connect.u;
import com.spotify.remoteconfig.jj;

/* renamed from: qq4  reason: default package */
class qq4 implements u {
    private final jj a;
    private final qaa b;

    qq4(jj jjVar, qaa qaa) {
        this.a = jjVar;
        this.b = qaa;
    }

    @Override // com.spotify.libs.connect.u
    public boolean a() {
        return this.a.a() && !this.b.a();
    }

    @Override // com.spotify.libs.connect.u
    public boolean b() {
        return this.a.b();
    }
}
