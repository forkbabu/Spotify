package defpackage;

/* renamed from: je4  reason: default package */
public final class je4 implements fjf<ie4> {
    private final wlf<ee4> a;
    private final wlf<h81> b;

    public je4(wlf<ee4> wlf, wlf<h81> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static ie4 a(ee4 ee4, wlf<h81> wlf) {
        return new ie4(ee4, wlf);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ie4(this.a.get(), this.b);
    }
}
