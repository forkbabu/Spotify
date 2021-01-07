package com.spotify.music.libs.podcast.loader;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import io.reactivex.y;
import io.reactivex.z;

public class v {
    private final z<r> a;

    public v(String str, qna qna, y yVar, y yVar2) {
        Logger.b("Creating new SimpleShowDataLoader", new Object[0]);
        l0 z = l0.z(str);
        if (z.q() == LinkType.SHOW_SHOW) {
            ona ona = new ona(qna, yVar, yVar2);
            ona.g(true);
            this.a = ona.e(null, str).A(new d(str));
        } else if (z.q() == LinkType.SHOW_EPISODE) {
            hna hna = new hna(qna, yVar, yVar2);
            hna.g(true);
            this.a = hna.e(null, str).A(new c(str));
        } else {
            throw new AssertionError("Unhandled link type! Link is " + z);
        }
    }

    public z<r> a() {
        return this.a;
    }
}
