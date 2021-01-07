package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.f;

/* renamed from: mn3  reason: default package */
public final class mn3 implements fjf<f> {

    /* access modifiers changed from: private */
    /* renamed from: mn3$a */
    public static final class a {
        private static final mn3 a = new mn3();
    }

    public static mn3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(PageIdentifiers.ADS.name(), ViewUris.h1.toString());
    }
}
