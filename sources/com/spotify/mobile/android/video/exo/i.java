package com.spotify.mobile.android.video.exo;

import java.util.List;
import okhttp3.y;

public class i {
    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public h b(y yVar, e72 e72, List<c72> list) {
        a(yVar, 1);
        a(e72, 2);
        a(list, 3);
        return new h(yVar, e72, list);
    }
}
