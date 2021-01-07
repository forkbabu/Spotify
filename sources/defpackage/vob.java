package defpackage;

import com.spotify.nowplaying.core.orientation.OrientationMode;
import io.reactivex.g;

/* renamed from: vob  reason: default package */
public final class vob implements fjf<g<OrientationMode>> {

    /* access modifiers changed from: private */
    /* renamed from: vob$a */
    public static final class a {
        private static final vob a = new vob();
    }

    public static vob a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return g.N(OrientationMode.UNSPECIFIED);
    }
}
