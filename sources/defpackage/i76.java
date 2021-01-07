package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.o;

/* renamed from: i76  reason: default package */
public final class i76 implements fjf<yj6> {
    private final wlf<o> a;
    private final wlf<String> b;

    public i76(wlf<o> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        o oVar = this.a.get();
        String str = this.b.get();
        a b2 = oVar.b();
        MoreObjects.checkArgument((b2 == PageIdentifiers.UNKNOWN || b2 == PageIdentifiers.PLAYLIST_NOTLOADED) ? false : true, "Trying to access PageIdentifier too early. Its only available at plugin creation point and onwards.");
        return new com.spotify.music.features.playlistentity.a(oVar, str);
    }
}
