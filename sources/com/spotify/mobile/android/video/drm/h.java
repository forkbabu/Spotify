package com.spotify.mobile.android.video.drm;

import okhttp3.y;

public final class h {
    private final wlf<y> a;

    public h(wlf<y> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public g b(String str) {
        y yVar = this.a.get();
        a(yVar, 1);
        a(str, 2);
        return new g(yVar, str);
    }
}
