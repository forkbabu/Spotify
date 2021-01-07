package defpackage;

import com.spotify.instrumentation.navigation.logger.m;

/* renamed from: ca3  reason: default package */
public final class ca3 implements fjf<m> {
    private final wlf<cw9> a;

    public ca3(wlf<cw9> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(this.a.get());
    }
}
