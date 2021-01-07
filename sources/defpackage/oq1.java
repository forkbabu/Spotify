package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;

/* renamed from: oq1  reason: default package */
public class oq1 implements ef2 {
    private final ef2 a;

    private oq1(ef2 ef2) {
        this.a = ef2;
    }

    public static oq1 f(ef2 ef2) {
        if (ef2 == null) {
            throw new IllegalArgumentException("Source message must not be null");
        } else if (ef2.d() == 48) {
            return new oq1(ef2);
        } else {
            throw new IllegalArgumentException(String.format("Message must be of type CALL(48), but was %s", Integer.valueOf(ef2.d())));
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

    public <T extends JacksonModel> T g(Class<T> cls) {
        if (this.a.size() == 6 && this.a.a(5)) {
            return (T) ((JacksonModel) this.a.b(5, cls));
        }
        return null;
    }

    public String h() {
        return this.a.e(3);
    }

    public int i() {
        return this.a.c(1);
    }

    @Override // defpackage.ef2
    public int size() {
        return this.a.size();
    }
}
