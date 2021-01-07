package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: g4c  reason: default package */
public final class g4c implements fjf<f4c> {
    private final wlf<Picasso> a;

    public g4c(wlf<Picasso> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f4c(this.a.get());
    }
}
