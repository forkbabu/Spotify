package defpackage;

import com.google.common.base.Optional;

/* renamed from: jt1  reason: default package */
public class jt1 {
    private Optional<String> a = Optional.absent();
    private int b = -1;

    public int a() {
        return this.b;
    }

    public Optional<String> b() {
        return this.a;
    }

    public void c(String str, int i) {
        this.a = Optional.of(str);
        this.b = i;
    }

    public void d() {
        this.a = Optional.absent();
        this.b = -1;
    }
}
