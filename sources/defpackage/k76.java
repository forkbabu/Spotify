package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.o;

/* renamed from: k76  reason: default package */
public final class k76 implements fjf<a> {
    private final wlf<o> a;

    public k76(wlf<o> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        a b = this.a.get().b();
        MoreObjects.checkArgument((b == PageIdentifiers.UNKNOWN || b == PageIdentifiers.PLAYLIST_NOTLOADED) ? false : true, "Trying to access PageIdentifier too early. Its only available at plugin creation point and onwards.");
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
