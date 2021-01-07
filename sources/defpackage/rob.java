package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.f;

/* renamed from: rob  reason: default package */
public final class rob implements fjf<f> {

    /* access modifiers changed from: private */
    /* renamed from: rob$a */
    public static final class a {
        private static final rob a = new rob();
    }

    public static rob a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(PageIdentifiers.ADS.name(), ViewUris.h0.toString());
    }
}
