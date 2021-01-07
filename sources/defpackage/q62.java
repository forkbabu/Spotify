package defpackage;

import com.spotify.mobile.android.video.l0;
import com.spotify.mobile.android.video.offline.BetamaxOfflineManager;
import com.spotify.mobile.android.video.offline.z;
import com.spotify.mobile.android.video.s;
import com.spotify.mobile.android.video.tracking.h;
import defpackage.r62;
import defpackage.w62;

/* renamed from: q62  reason: default package */
public final class q62 implements fjf<h> {
    public static s a(r62.a aVar, p62 p62, l0 l0Var, ajf<BetamaxOfflineManager> ajf, ajf<z> ajf2, boolean z) {
        s a = ((w62.c) aVar.a(p62)).a();
        a.d("context-player");
        a.i(l0Var);
        a.g(true);
        if (z) {
            a.b(ajf.get());
            a.h(ajf2.get());
        }
        return a;
    }
}
