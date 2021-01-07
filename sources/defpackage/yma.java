package defpackage;

import android.content.Context;
import com.spotify.android.glue.patterns.prettylist.u;
import com.squareup.picasso.Picasso;

/* renamed from: yma  reason: default package */
public final class yma implements fjf<xma> {
    private final wlf<Picasso> a;
    private final wlf<Context> b;
    private final wlf<u> c;

    public yma(wlf<Picasso> wlf, wlf<Context> wlf2, wlf<u> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xma(this.a.get(), this.b.get(), this.c);
    }
}
