package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: e94  reason: default package */
public final class e94 implements fjf<d94> {
    private final wlf<Picasso> a;
    private final wlf<Context> b;

    public e94(wlf<Picasso> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d94(this.a.get(), this.b.get());
    }
}
