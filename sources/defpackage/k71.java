package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.ui.BadgesFactory;
import com.squareup.picasso.Picasso;

/* renamed from: k71  reason: default package */
public final class k71 implements fjf<j71> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<BadgesFactory> c;

    public k71(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<BadgesFactory> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j71(this.a.get(), this.b.get(), this.c.get());
    }
}
