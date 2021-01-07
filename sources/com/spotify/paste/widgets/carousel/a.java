package com.spotify.paste.widgets.carousel;

public class a {
    private boolean a;
    private byte b = 0;
    private int c;
    private AbstractC0362a d;

    /* renamed from: com.spotify.paste.widgets.carousel.a$a  reason: collision with other inner class name */
    public interface AbstractC0362a {
        void i();
    }

    public int a() {
        return this.c;
    }

    public byte b() {
        return this.b;
    }

    public boolean c() {
        return this.a;
    }

    public void d(int i) {
        this.c = i;
    }

    public void e(AbstractC0362a aVar) {
        this.d = aVar;
    }

    public void f(byte b2) {
        this.b = b2;
    }

    public void g(boolean z) {
        AbstractC0362a aVar;
        boolean z2 = !this.a && z;
        this.a = z;
        if (z2 && (aVar = this.d) != null) {
            aVar.i();
        }
    }
}
