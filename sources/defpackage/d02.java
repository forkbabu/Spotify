package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: d02  reason: default package */
public final class d02 implements fjf<String> {

    /* access modifiers changed from: private */
    /* renamed from: d02$a */
    public static final class a {
        private static final d02 a = new d02();
    }

    public static d02 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        String cVar = ViewUris.d.toString();
        yif.g(cVar, "Cannot return null from a non-@Nullable @Provides method");
        return cVar;
    }
}
