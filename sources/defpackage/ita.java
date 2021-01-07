package defpackage;

import com.spotify.libs.search.offline.model.OfflineEpisode;
import com.spotify.libs.search.offline.model.OfflinePlaylist;
import com.spotify.libs.search.offline.model.OfflineResults;
import com.spotify.libs.search.offline.model.OfflineTrack;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ita  reason: default package */
public class ita implements sg0<OfflineResults, b91> {
    private final bta a;
    private final qqa b;

    public ita(bta bta, qqa qqa) {
        this.a = bta;
        this.b = qqa;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.sg0
    public b91 apply(OfflineResults offlineResults) {
        OfflineResults offlineResults2 = offlineResults;
        offlineResults2.getClass();
        String searchTerm = offlineResults2.searchTerm();
        List<OfflineTrack> hits = offlineResults2.tracks().hits();
        List<OfflineEpisode> hits2 = offlineResults2.episodes().hits();
        List<OfflinePlaylist> hits3 = offlineResults2.playlists().hits();
        if (hits.isEmpty() && hits2.isEmpty() && hits3.isEmpty()) {
            return this.b.b(searchTerm, true);
        }
        bta bta = this.a;
        int i = 0;
        List<s81> c = bta.c(hits, 0);
        if (!c.isEmpty()) {
            i = 0 + (c.size() - 1);
        }
        List<s81> b2 = bta.b(hits2, i);
        if (!b2.isEmpty()) {
            i += b2.size() - 1;
        }
        List<s81> a2 = bta.a(hits3, i);
        ArrayList arrayList = new ArrayList(c);
        arrayList.addAll(b2);
        arrayList.addAll(a2);
        return z81.i().a(arrayList).c(rqa.a(searchTerm)).g();
    }
}
