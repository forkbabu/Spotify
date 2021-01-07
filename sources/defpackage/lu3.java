package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.owd;

/* renamed from: lu3  reason: default package */
public class lu3 implements mu3 {
    private final String a;
    private final Picasso b;
    private final int c;
    private final owd<View> d = new owd<>(new a());
    private pu3 e;

    /* renamed from: lu3$a */
    class a implements owd.d {
        a() {
        }

        @Override // defpackage.owd.d
        public void a(int i) {
            lu3.this.e.setColor(i);
        }

        @Override // defpackage.owd.d
        public void b(Drawable drawable) {
            lu3.this.e.setColor(lu3.this.c);
        }
    }

    public lu3(String str, Picasso picasso, int i) {
        this.a = str;
        this.b = picasso;
        this.c = i;
    }

    public void c(pu3 pu3) {
        this.e = pu3;
        z m = this.b.m(this.a);
        m.x(fwd.b);
        m.o(this.d);
    }
}
