package com.spotify.music.features.profile.profilelist;

import com.spotify.music.features.profile.model.e;
import io.reactivex.s;

/* access modifiers changed from: package-private */
public final class t {
    private final wlf<wt7> a;
    private final wlf<j> b;

    t(wlf<wt7> wlf, wlf<j> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    /* access modifiers changed from: package-private */
    public s b(mt7 mt7, s<e> sVar) {
        wt7 wt7 = this.a.get();
        a(wt7, 1);
        j jVar = this.b.get();
        a(jVar, 2);
        a(mt7, 3);
        a(sVar, 4);
        return new s(wt7, jVar, mt7, sVar);
    }
}
