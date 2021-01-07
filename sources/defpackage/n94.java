package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import defpackage.k94;

/* renamed from: n94  reason: default package */
public class n94 {
    private final a a;
    private m94 b = ((k94.b) m94.c()).c();

    /* renamed from: n94$a */
    public interface a {
    }

    public n94(a aVar) {
        this.a = aVar;
    }

    private void k(m94 m94) {
        if (!this.b.equals(m94)) {
            ((f94) this.a).w(m94);
            this.b = m94;
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        k94.b bVar = (k94.b) m94.c();
        bVar.a(str);
        k94.b bVar2 = bVar;
        bVar2.i(str2);
        k94.b bVar3 = bVar2;
        bVar3.h(str3);
        k94.b bVar4 = bVar3;
        bVar4.d(str4);
        k(bVar4.c());
    }

    public void b(Drawable drawable) {
        k94.b bVar = (k94.b) this.b.j();
        bVar.b(new j94(null, drawable, false));
        k(bVar.c());
    }

    public void c(Bitmap bitmap, boolean z, int i) {
        k94.b bVar = (k94.b) this.b.j();
        bVar.b(new j94(bitmap, null, z));
        bVar.e(i);
        k(bVar.c());
    }

    public void d(Drawable drawable) {
        k94.b bVar = (k94.b) this.b.j();
        bVar.b(new j94(null, drawable, false));
        k(bVar.c());
    }

    public void e(Drawable drawable) {
        k94.b bVar = (k94.b) this.b.j();
        bVar.f(new j94(null, drawable, false));
        k(bVar.c());
    }

    public void f(Bitmap bitmap) {
        k94.b bVar = (k94.b) this.b.j();
        bVar.f(new j94(bitmap, null, false));
        k(bVar.c());
    }

    public void g(Drawable drawable) {
        k94.b bVar = (k94.b) this.b.j();
        bVar.f(new j94(null, drawable, false));
        k(bVar.c());
    }

    public void h(Drawable drawable) {
        k94.b bVar = (k94.b) this.b.j();
        bVar.g(new j94(null, drawable, false));
        k(bVar.c());
    }

    public void i(Bitmap bitmap, boolean z) {
        k94.b bVar = (k94.b) this.b.j();
        bVar.g(new j94(bitmap, null, z));
        k(bVar.c());
    }

    public void j(Drawable drawable) {
        k94.b bVar = (k94.b) this.b.j();
        bVar.g(new j94(null, drawable, false));
        k(bVar.c());
    }
}
