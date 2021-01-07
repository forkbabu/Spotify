package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.radio.formatlist.d;

/* renamed from: nw8  reason: default package */
final class nw8 implements qg0<String> {
    private final t a;
    private final d b;

    nw8(t tVar, d dVar) {
        this.a = tVar;
        this.b = dVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.qg0
    public void accept(String str) {
        String str2 = str;
        if (l0.z(str2).q() == LinkType.TRACK) {
            this.b.a(str2);
        } else {
            this.a.d(str2);
        }
    }
}
