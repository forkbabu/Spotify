package com.spotify.music.features.video;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.video.y;
import defpackage.p62;
import io.reactivex.z;
import java.util.Map;

public class r {
    private final w a;
    private final ajf<y> b;

    public r(w wVar, ajf<y> ajf) {
        this.a = wVar;
        this.b = ajf;
    }

    public static p62 b(r rVar, Map map) {
        int i;
        rVar.getClass();
        p62.a a2 = p62.a();
        a2.b((String) MoreObjects.firstNonNull(map.get("widevine-license-url"), ""));
        a2.c((String) MoreObjects.firstNonNull(map.get("video-manifest-url"), ""));
        try {
            i = Integer.parseInt((String) MoreObjects.firstNonNull(map.get("video-cdn-sampling"), ""));
        } catch (NumberFormatException unused) {
            i = 0;
        }
        a2.e(i);
        a2.d(rVar.b.get().b());
        return a2.a();
    }

    public z<p62> a() {
        return this.a.b().Q(e.a).N0(1).B0().A(new d(this));
    }
}
