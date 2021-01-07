package defpackage;

import com.spotify.music.podcast.entity.adapter.episoderow.d;
import com.spotify.music.podcast.entity.adapter.episoderow.k;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;
import defpackage.lgc;
import kotlin.jvm.internal.h;

/* renamed from: gkc  reason: default package */
public final class gkc implements fkc {
    private final boolean a;
    private final k b;

    public gkc(boolean z, k kVar) {
        h.e(kVar, "viewModelConverter");
        this.a = z;
        this.b = kVar;
    }

    @Override // defpackage.fkc
    public dsc a(Episode episode, Episode[] episodeArr, int i, String str, boolean z) {
        h.e(episode, "episode");
        h.e(episodeArr, "episodeContext");
        h.e(str, "section");
        if (this.a) {
            boolean z2 = i == episodeArr.length - 1;
            k kVar = this.b;
            Show w = episode.w();
            return new d.a(episode, kVar.a(w != null ? w.h() : null, episode, episodeArr, z, z2, i));
        }
        lgc.a aVar = new lgc.a();
        aVar.j(episode);
        aVar.k(episodeArr);
        aVar.l(str);
        aVar.i(z);
        return aVar;
    }
}
