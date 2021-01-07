package defpackage;

import java.util.Random;

/* renamed from: cnf  reason: default package */
public abstract class cnf extends enf {
    @Override // defpackage.enf
    public int b(int i) {
        return ((-i) >> 31) & (f().nextInt() >>> (32 - i));
    }

    @Override // defpackage.enf
    public int c() {
        return f().nextInt();
    }

    @Override // defpackage.enf
    public long d() {
        return f().nextLong();
    }

    public abstract Random f();
}
