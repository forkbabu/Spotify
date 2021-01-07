package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

/* renamed from: it1  reason: default package */
public final class it1 implements fjf<c> {

    /* access modifiers changed from: private */
    /* renamed from: it1$a */
    public static final class a {
        private static final it1 a = new it1();
    }

    public static it1 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        c cVar = ViewUris.j2;
        yif.g(cVar, "Cannot return null from a non-@Nullable @Provides method");
        return cVar;
    }
}
