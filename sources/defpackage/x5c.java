package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.f;

/* renamed from: x5c  reason: default package */
public final class x5c implements fjf<f> {

    /* access modifiers changed from: private */
    /* renamed from: x5c$a */
    public static final class a {
        private static final x5c a = new x5c();
    }

    public static x5c a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(PageIdentifiers.ADS.name(), ViewUris.h0.toString());
    }
}
