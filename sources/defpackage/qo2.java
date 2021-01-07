package defpackage;

import com.spotify.nowplaying.core.orientation.OrientationMode;
import io.reactivex.g;

/* renamed from: qo2  reason: default package */
public final class qo2 implements fjf<g<OrientationMode>> {

    /* access modifiers changed from: private */
    /* renamed from: qo2$a */
    public static final class a {
        private static final qo2 a = new qo2();
    }

    public static qo2 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return g.N(OrientationMode.PORTRAIT_ONLY);
    }
}
