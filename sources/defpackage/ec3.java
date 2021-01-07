package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: ec3  reason: default package */
public final class ec3 implements fjf<Picasso> {
    private final wlf<rwd> a;

    public ec3(wlf<rwd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Picasso e = this.a.get().e();
        yif.g(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
