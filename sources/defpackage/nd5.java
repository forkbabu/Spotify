package defpackage;

import com.spotify.music.features.go.connection.b;
import com.spotify.music.features.go.socket.e;
import defpackage.ge5;

/* renamed from: nd5  reason: default package */
public final class nd5 implements fjf<md5> {
    private final wlf<b> a;
    private final wlf<e> b;
    private final wlf<ye5> c;
    private final wlf<ge5.b> d;

    public nd5(wlf<b> wlf, wlf<e> wlf2, wlf<ye5> wlf3, wlf<ge5.b> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new md5(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
