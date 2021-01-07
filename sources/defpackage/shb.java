package defpackage;

import com.spotify.music.navigation.t;
import kotlin.jvm.internal.h;

/* renamed from: shb  reason: default package */
public final class shb implements rhb {
    private final t a;

    public shb(t tVar) {
        h.e(tVar, "navigator");
        this.a = tVar;
    }

    @Override // defpackage.rhb
    public void a(String str) {
        h.e(str, "uri");
        this.a.d(str);
    }
}
