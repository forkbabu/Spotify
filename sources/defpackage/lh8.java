package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.f;

/* renamed from: lh8  reason: default package */
public final class lh8 implements fjf<f> {

    /* access modifiers changed from: private */
    /* renamed from: lh8$a */
    public static final class a {
        private static final lh8 a = new lh8();
    }

    public static lh8 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(PageIdentifiers.ADS.name(), ViewUris.i1.toString());
    }
}
