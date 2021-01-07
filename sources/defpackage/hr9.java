package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: hr9  reason: default package */
public final class hr9 implements fjf<gr9> {
    private final wlf<Picasso> a;
    private final wlf<Context> b;

    public hr9(wlf<Picasso> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gr9(this.a.get(), this.b.get());
    }
}
