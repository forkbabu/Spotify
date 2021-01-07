package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.f;

/* renamed from: jn3  reason: default package */
public final class jn3 implements fjf<f> {

    /* access modifiers changed from: private */
    /* renamed from: jn3$a */
    public static final class a {
        private static final jn3 a = new jn3();
    }

    public static jn3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(PageIdentifiers.ADS.name(), ViewUris.g1.toString());
    }
}
