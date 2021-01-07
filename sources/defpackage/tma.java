package defpackage;

import android.util.DisplayMetrics;
import com.squareup.picasso.Picasso;

/* renamed from: tma  reason: default package */
public final class tma implements fjf<sma> {
    private final wlf<Picasso> a;
    private final wlf<DisplayMetrics> b;

    public tma(wlf<Picasso> wlf, wlf<DisplayMetrics> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sma(this.a.get(), this.b.get());
    }
}
