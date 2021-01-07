package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: vk5  reason: default package */
public final class vk5 implements fjf<ImpressionLogger> {
    private final wlf<jz1> a;
    private final wlf<c.a> b;
    private final wlf<ifd> c;
    private final wlf<cqe> d;

    public vk5(wlf<jz1> wlf, wlf<c.a> wlf2, wlf<ifd> wlf3, wlf<cqe> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ImpressionLogger(this.a.get(), this.b.get().getViewUri(), this.c.get().toString(), this.d.get());
    }
}
