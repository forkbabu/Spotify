package defpackage;

/* renamed from: efc  reason: default package */
public final class efc {
    private int a;
    private int b;
    private int c;

    public efc(int i, int i2) {
        this.c = i;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final void c(int i) {
        this.b = Math.max(0, i - 50);
        this.c = 100;
    }

    public final void d(int i) {
        this.a = i;
    }

    public final boolean e(int i) {
        int i2 = this.b;
        if (i >= (i2 == 0 ? i2 : 15 + i2)) {
            int i3 = i2 + this.c;
            int i4 = this.a;
            if (i3 < i4) {
                i4 = i3 - 15;
            }
            if (i <= i4) {
                return false;
            }
        }
        return true;
    }
}
