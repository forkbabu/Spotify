package defpackage;

import com.spotify.nowplaying.core.orientation.OrientationMode;
import io.reactivex.g;

/* renamed from: w4c  reason: default package */
public final class w4c implements fjf<g<OrientationMode>> {

    /* access modifiers changed from: private */
    /* renamed from: w4c$a */
    public static final class a {
        private static final w4c a = new w4c();
    }

    public static w4c a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return g.N(OrientationMode.UNSPECIFIED);
    }
}
