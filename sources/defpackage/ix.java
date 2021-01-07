package defpackage;

import android.graphics.Typeface;

/* renamed from: ix  reason: default package */
public final class ix extends mx {
    private final Typeface a;
    private final a b;
    private boolean c;

    /* renamed from: ix$a */
    public interface a {
        void a(Typeface typeface);
    }

    public ix(a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    @Override // defpackage.mx
    public void a(int i) {
        Typeface typeface = this.a;
        if (!this.c) {
            this.b.a(typeface);
        }
    }

    @Override // defpackage.mx
    public void b(Typeface typeface, boolean z) {
        if (!this.c) {
            this.b.a(typeface);
        }
    }

    public void c() {
        this.c = true;
    }
}
