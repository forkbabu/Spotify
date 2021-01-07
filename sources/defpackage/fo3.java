package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.f;

/* renamed from: fo3  reason: default package */
public final class fo3 implements fjf<f> {

    /* access modifiers changed from: private */
    /* renamed from: fo3$a */
    public static final class a {
        private static final fo3 a = new fo3();
    }

    public static fo3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(PageIdentifiers.ADS.name(), ViewUris.h1.toString());
    }
}
