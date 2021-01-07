package defpackage;

/* renamed from: jl8  reason: default package */
public class jl8 {
    private int[] a;

    public int a(int i) {
        if (-1 == i) {
            return 0;
        }
        return this.a[i];
    }

    public void b(int i) {
        if (this.a == null) {
            this.a = new int[i];
        }
    }

    public void c(int i, int i2) {
        if (-1 != i) {
            this.a[i] = i2;
        }
    }
}
