package defpackage;

/* renamed from: j91  reason: default package */
public final class j91 implements v51 {
    private final v51 a;
    private final a b;

    /* renamed from: j91$a */
    public interface a {
        void a(s81 s81, int i);
    }

    public j91(v51 v51, a aVar) {
        this.a = v51;
        this.b = aVar;
    }

    @Override // defpackage.v51
    public int d(s81 s81) {
        int d = this.a.d(s81);
        this.b.a(s81, d);
        return d;
    }
}
