package defpackage;

/* renamed from: v40  reason: default package */
public class v40 {
    private char[] a;
    private int b;

    public v40(int i) {
        this.a = new char[i];
    }

    public void a(char c) {
        int i = this.b;
        char[] cArr = this.a;
        if (i < cArr.length - 1) {
            cArr[i] = c;
            this.b = i + 1;
        }
    }

    public void b() {
        this.b = 0;
    }

    public int c() {
        return this.b;
    }

    public String toString() {
        return new String(this.a, 0, this.b);
    }
}
