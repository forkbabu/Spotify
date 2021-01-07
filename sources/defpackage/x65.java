package defpackage;

import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

/* renamed from: x65  reason: default package */
public final class x65 implements fjf<w65> {
    private final wlf<EncoreConsumerEntryPoint> a;
    private final wlf<vd3> b;
    private final wlf<kcb> c;
    private final wlf<y65> d;
    private final wlf<gxc> e;

    public x65(wlf<EncoreConsumerEntryPoint> wlf, wlf<vd3> wlf2, wlf<kcb> wlf3, wlf<y65> wlf4, wlf<gxc> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w65(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
