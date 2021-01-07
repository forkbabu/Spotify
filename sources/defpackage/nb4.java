package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: nb4  reason: default package */
public final class nb4 implements fjf<String> {

    /* access modifiers changed from: private */
    /* renamed from: nb4$a */
    public static final class a {
        private static final nb4 a = new nb4();
    }

    public static nb4 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        String cVar = ViewUris.n0.toString();
        yif.g(cVar, "Cannot return null from a non-@Nullable @Provides method");
        return cVar;
    }
}
