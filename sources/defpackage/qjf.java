package defpackage;

import com.spotify.mobile.android.util.ui.k;
import com.squareup.picasso.Picasso;

/* renamed from: qjf  reason: default package */
public final class qjf implements fjf<pjf> {
    private final wlf<Picasso> a;
    private final wlf<k> b;

    public qjf(wlf<Picasso> wlf, wlf<k> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pjf(this.a.get(), this.b.get());
    }
}
