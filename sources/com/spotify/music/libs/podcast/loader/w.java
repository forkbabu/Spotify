package com.spotify.music.libs.podcast.loader;

import io.reactivex.y;

public class w {
    private final wlf<qna> a;
    private final wlf<y> b;
    private final wlf<y> c;

    public w(wlf<qna> wlf, wlf<y> wlf2, wlf<y> wlf3) {
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

    public v b(String str) {
        a(str, 1);
        qna qna = this.a.get();
        a(qna, 2);
        y yVar = this.b.get();
        a(yVar, 3);
        y yVar2 = this.c.get();
        a(yVar2, 4);
        return new v(str, qna, yVar, yVar2);
    }
}
