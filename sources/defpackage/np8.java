package defpackage;

import com.google.protobuf.u;
import com.spotify.music.features.tasteonboarding.logging.b;
import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: np8  reason: default package */
public final class np8 implements fjf<mp8> {
    private final wlf<ImpressionLogger> a;
    private final wlf<gl0<u>> b;
    private final wlf<b> c;
    private final wlf<b> d;

    public np8(wlf<ImpressionLogger> wlf, wlf<gl0<u>> wlf2, wlf<b> wlf3, wlf<b> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    public static mp8 a(ImpressionLogger impressionLogger, gl0<u> gl0, b bVar, b bVar2) {
        return new mp8(impressionLogger, gl0, bVar, bVar2);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mp8(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
