package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.owd;

/* renamed from: mjb  reason: default package */
public class mjb implements njb {
    private final String a;
    private final Picasso b;
    private final int c;
    private final owd<View> d = new owd<>(new a());
    private pjb e;

    /* renamed from: mjb$a */
    class a implements owd.d {
        a() {
        }

        @Override // defpackage.owd.d
        public void a(int i) {
            mjb.this.e.setColor(i);
        }

        @Override // defpackage.owd.d
        public void b(Drawable drawable) {
            mjb.this.e.setColor(mjb.this.c);
        }
    }

    public mjb(String str, Picasso picasso, int i) {
        this.a = str;
        this.b = picasso;
        this.c = i;
    }

    public void c(pjb pjb) {
        this.e = pjb;
        z m = this.b.m(this.a);
        m.x(fwd.b);
        m.o(this.d);
    }
}
