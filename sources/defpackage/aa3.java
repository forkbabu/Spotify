package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

/* renamed from: aa3  reason: default package */
public final class aa3 implements fjf<c> {

    /* access modifiers changed from: private */
    /* renamed from: aa3$a */
    public static final class a {
        private static final aa3 a = new aa3();
    }

    public static aa3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        c cVar = ViewUris.a2;
        yif.g(cVar, "Cannot return null from a non-@Nullable @Provides method");
        return cVar;
    }
}
