package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: ik5  reason: default package */
public final class ik5 implements fjf<String> {

    /* access modifiers changed from: private */
    /* renamed from: ik5$a */
    public static final class a {
        private static final ik5 a = new ik5();
    }

    public static ik5 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        String cVar = ViewUris.d.toString();
        yif.g(cVar, "Cannot return null from a non-@Nullable @Provides method");
        return cVar;
    }
}
