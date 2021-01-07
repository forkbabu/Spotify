package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.t;
import kotlin.jvm.internal.h;

/* renamed from: cg5  reason: default package */
public final class cg5 implements bg5 {
    private final hha a;
    private final t b;

    public cg5(hha hha, t tVar) {
        h.e(hha, "homePreferenceManager");
        h.e(tVar, "navigator");
        this.a = hha;
        this.b = tVar;
    }

    @Override // defpackage.bg5
    public void a() {
        this.a.e();
        this.b.d(ViewUris.b.toString());
    }
}
