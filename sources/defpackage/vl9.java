package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: vl9  reason: default package */
public final class vl9 implements fjf<ImpressionLogger> {
    private final wlf<jz1> a;
    private final wlf<c> b;
    private final wlf<String> c;
    private final wlf<cqe> d;

    public vl9(wlf<jz1> wlf, wlf<c> wlf2, wlf<String> wlf3, wlf<cqe> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ImpressionLogger(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
