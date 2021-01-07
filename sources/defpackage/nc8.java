package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.c;
import com.spotify.ubi.specification.factories.u;

/* renamed from: nc8  reason: default package */
public class nc8 implements rc8 {
    private final c.a a;
    private final lc8 b;

    public nc8(lc8 lc8, c.a aVar) {
        this.b = lc8;
        this.a = aVar;
    }

    @Override // defpackage.rc8
    public rqe a(Optional<String> optional) {
        PageIdentifiers pageIdentifiers;
        String cVar = this.a.getViewUri().toString();
        this.b.getClass();
        if (cVar.startsWith("spotify:search:artist")) {
            pageIdentifiers = PageIdentifiers.ASSISTED_CURATION_SEARCH_ARTISTS;
        } else if (cVar.startsWith("spotify:search:track")) {
            pageIdentifiers = PageIdentifiers.ASSISTED_CURATION_SEARCH_SONGS;
        } else if (cVar.startsWith("spotify:search:album")) {
            pageIdentifiers = PageIdentifiers.ASSISTED_CURATION_SEARCH_ALBUMS;
        } else {
            pageIdentifiers = PageIdentifiers.ASSISTED_CURATION_SEARCH;
        }
        return new u(pageIdentifiers.path(), cVar, optional.or((Optional<String>) "")).b().b().a();
    }
}
