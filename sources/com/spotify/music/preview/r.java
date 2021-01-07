package com.spotify.music.preview;

import android.content.Context;
import com.spotify.music.preview.q;
import io.reactivex.y;

public final class r implements q.a {
    private final wlf<Context> a;
    private final wlf<cqe> b;
    private final wlf<y> c;

    public r(wlf<Context> wlf, wlf<cqe> wlf2, wlf<y> wlf3) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.preview.q.a
    public q a(v vVar) {
        Context context = this.a.get();
        b(context, 1);
        b(vVar, 2);
        cqe cqe = this.b.get();
        b(cqe, 3);
        y yVar = this.c.get();
        b(yVar, 4);
        return new q(context, vVar, cqe, yVar);
    }
}
