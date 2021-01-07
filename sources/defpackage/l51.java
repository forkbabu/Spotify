package defpackage;

/* renamed from: l51  reason: default package */
public final /* synthetic */ class l51 implements v51 {
    public final /* synthetic */ v51 a;
    public final /* synthetic */ v51 b;

    public /* synthetic */ l51(v51 v51, v51 v512) {
        this.a = v51;
        this.b = v512;
    }

    @Override // defpackage.v51
    public final int d(s81 s81) {
        v51 v51 = this.a;
        v51 v512 = this.b;
        int d = v51.d(s81);
        return d == 0 ? v512.d(s81) : d;
    }
}
