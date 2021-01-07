package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import defpackage.o74;

/* renamed from: r74  reason: default package */
public class r74 {
    private final a a;
    private q74 b;

    /* renamed from: r74$a */
    public interface a {
        void a(q74 q74);
    }

    public r74(a aVar) {
        o74.b bVar = new o74.b();
        bVar.d(-11316397);
        bVar.a(new n74(null, null));
        this.b = bVar.b();
        this.a = aVar;
    }

    private void e(q74 q74) {
        if (!this.b.equals(q74)) {
            this.a.a(q74);
            this.b = q74;
        }
    }

    public void a(String str, String str2) {
        o74.b bVar = new o74.b();
        bVar.d(-11316397);
        bVar.a(new n74(null, null));
        bVar.e(str);
        bVar.c(str2);
        e(bVar.b());
    }

    public void b(Drawable drawable) {
        o74.b bVar = (o74.b) this.b.e();
        bVar.a(new n74(null, drawable));
        e(bVar.b());
    }

    public void c(Bitmap bitmap, int i) {
        o74.b bVar = (o74.b) this.b.e();
        bVar.a(new n74(bitmap, null));
        bVar.d(i);
        e(bVar.b());
    }

    public void d(Drawable drawable) {
        o74.b bVar = (o74.b) this.b.e();
        bVar.a(new n74(null, drawable));
        e(bVar.b());
    }
}
