package defpackage;

import com.google.protobuf.u;
import com.spotify.music.inappmessaging.b;
import com.spotify.music.navigation.t;
import com.spotify.remoteconfig.w8;

/* renamed from: fyb  reason: default package */
public final class fyb implements fjf<eyb> {
    private final wlf<b> a;
    private final wlf<t> b;
    private final wlf<gl0<u>> c;
    private final wlf<w8> d;

    public fyb(wlf<b> wlf, wlf<t> wlf2, wlf<gl0<u>> wlf3, wlf<w8> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new eyb(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
