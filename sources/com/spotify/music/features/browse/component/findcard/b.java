package com.spotify.music.features.browse.component.findcard;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.squareup.picasso.Picasso;

public final class b {
    private final wlf<u64> a;
    private final wlf<HubsGlueImageDelegate> b;
    private final wlf<Picasso> c;

    public b(wlf<u64> wlf, wlf<HubsGlueImageDelegate> wlf2, wlf<Picasso> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public a b(boolean z) {
        u64 u64 = this.a.get();
        a(u64, 1);
        HubsGlueImageDelegate hubsGlueImageDelegate = this.b.get();
        a(hubsGlueImageDelegate, 2);
        Picasso picasso = this.c.get();
        a(picasso, 3);
        return new a(u64, hubsGlueImageDelegate, picasso, z);
    }
}
