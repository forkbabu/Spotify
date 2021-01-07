package defpackage;

import android.view.LayoutInflater;
import com.squareup.picasso.Picasso;

/* renamed from: il8  reason: default package */
public final class il8 implements fjf<hl8> {
    private final wlf<LayoutInflater> a;
    private final wlf<Picasso> b;

    public il8(wlf<LayoutInflater> wlf, wlf<Picasso> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hl8(this.a.get(), this.b.get());
    }
}
