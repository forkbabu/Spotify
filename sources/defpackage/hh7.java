package defpackage;

import com.spotify.mobile.android.util.l0;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.features.podcast.notifications.NotificationsBottomDrawerFragment;
import com.spotify.music.features.podcast.notifications.f;
import io.reactivex.w;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: hh7  reason: default package */
public final class hh7 {
    public static final String a(String str) {
        if (!l0.x(str)) {
            return "";
        }
        l0 z = l0.z(str);
        h.d(z, "link");
        String k = z.k();
        h.d(k, "link.lastSegment");
        return k;
    }

    public static final w<fg7, gg7> b(t8a t8a, ih7 ih7, f fVar, NotificationsBottomDrawerFragment notificationsBottomDrawerFragment, lh7 lh7, y yVar) {
        h.e(t8a, "likedContent");
        h.e(ih7, "endpoint");
        h.e(fVar, "logger");
        h.e(notificationsBottomDrawerFragment, "fragment");
        h.e(lh7, "viewBinder");
        h.e(yVar, "mainThreadScheduler");
        m f = i.f();
        f.d(pg7.class, new ch7(t8a));
        h.e(ih7, "endpoint");
        f.h(xf7.class, new xg7(ih7));
        f.d(vf7.class, new dh7(notificationsBottomDrawerFragment));
        f.e(qg7.class, new eh7(lh7), yVar);
        h.e(ih7, "endpoint");
        f.h(wg7.class, new bh7(ih7));
        f.d(cg7.class, new fh7(fVar));
        f.e(dg7.class, new gh7(lh7), yVar);
        return f.i();
    }
}
