package com.spotify.mobile.android.util.ui;

import com.spotify.mobile.android.util.ui.d;

public class e {
    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public d b(int i, long j, d.b bVar) {
        a(bVar, 3);
        return new d(i, j, bVar);
    }

    public d c(d.b bVar) {
        a(bVar, 1);
        return new d(-1, 500, bVar);
    }
}
