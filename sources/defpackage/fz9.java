package defpackage;

import android.util.DisplayMetrics;
import com.squareup.picasso.Picasso;

/* renamed from: fz9  reason: default package */
public final class fz9 implements fjf<ez9> {
    private final wlf<Picasso> a;
    private final wlf<DisplayMetrics> b;

    public fz9(wlf<Picasso> wlf, wlf<DisplayMetrics> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ez9(this.a.get(), this.b.get());
    }
}
