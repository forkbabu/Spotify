package defpackage;

import com.spotify.base.java.logging.LogLevel;
import java.util.EnumSet;

/* renamed from: vf0  reason: default package */
public final class vf0 implements fjf<qf0> {
    private final wlf<tf0> a;
    private final wlf<EnumSet<LogLevel>> b;

    public vf0(wlf<tf0> wlf, wlf<EnumSet<LogLevel>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qf0(this.a.get(), this.b.get());
    }
}
