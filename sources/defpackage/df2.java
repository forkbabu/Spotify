package defpackage;

/* renamed from: df2  reason: default package */
public class df2 implements ef2 {
    private final ef2 a;

    private df2(ef2 ef2) {
        this.a = ef2;
    }

    public static df2 f(ef2 ef2) {
        if (ef2 == null) {
            throw new IllegalArgumentException("Source message must not be null");
        } else if (ef2.d() == 32) {
            return new df2(ef2);
        } else {
            throw new IllegalArgumentException(String.format("Message must be of type SUBSCRIBE(32), but was %s", Integer.valueOf(ef2.d())));
        }
    }

    @Override // defpackage.ef2
    public boolean a(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.ef2
    public <T> T b(int i, Class<T> cls) {
        return (T) this.a.b(i, cls);
    }

    @Override // defpackage.ef2
    public int c(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.ef2
    public int d() {
        return this.a.d();
    }

    @Override // defpackage.ef2
    public String e(int i) {
        return this.a.e(i);
    }

    public int g() {
        return this.a.c(1);
    }

    public String h() {
        return this.a.e(3);
    }

    @Override // defpackage.ef2
    public int size() {
        return this.a.size();
    }
}
