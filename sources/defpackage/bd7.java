package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.ubi.specification.factories.w2;

/* renamed from: bd7  reason: default package */
public final class bd7 implements fjf<ad7> {
    private final wlf<w2> a;
    private final wlf<ere> b;
    private final wlf<ImpressionLogger> c;
    private final wlf<yc7> d;

    public bd7(wlf<w2> wlf, wlf<ere> wlf2, wlf<ImpressionLogger> wlf3, wlf<yc7> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ad7(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
