package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

/* renamed from: ob3  reason: default package */
public final class ob3 implements fjf<c> {

    /* access modifiers changed from: private */
    /* renamed from: ob3$a */
    public static final class a {
        private static final ob3 a = new ob3();
    }

    public static ob3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        c cVar = ViewUris.j2;
        yif.g(cVar, "Cannot return null from a non-@Nullable @Provides method");
        return cVar;
    }
}
