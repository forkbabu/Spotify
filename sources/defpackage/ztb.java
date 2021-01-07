package defpackage;

import com.spotify.nowplaying.core.orientation.OrientationMode;
import io.reactivex.g;

/* renamed from: ztb  reason: default package */
public final class ztb implements fjf<g<OrientationMode>> {

    /* access modifiers changed from: private */
    /* renamed from: ztb$a */
    public static final class a {
        private static final ztb a = new ztb();
    }

    public static ztb a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return g.N(OrientationMode.UNSPECIFIED);
    }
}
