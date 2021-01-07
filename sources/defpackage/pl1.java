package defpackage;

import com.spotify.libs.search.offline.model.OfflineEpisode;
import com.spotify.libs.search.offline.model.OfflinePlaylist;
import com.spotify.libs.search.offline.model.OfflineResults;
import com.spotify.libs.search.offline.model.OfflineTrack;
import com.spotify.libs.search.offline.model.OfflineTrackAlbum;
import defpackage.gl1;
import defpackage.ml1;
import defpackage.nl1;
import defpackage.ol1;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pl1  reason: default package */
public class pl1 implements l<OfflineResults, ml1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public ml1 apply(OfflineResults offlineResults) {
        gl1 gl1;
        OfflineResults offlineResults2 = offlineResults;
        ml1.a c = ml1.c();
        if (offlineResults2 != null) {
            List<OfflineEpisode> hits = offlineResults2.episodes().hits();
            ArrayList arrayList = new ArrayList(hits.size());
            for (OfflineEpisode offlineEpisode : hits) {
                nl1.a a = nl1.a();
                a.d(offlineEpisode.name());
                a.e(offlineEpisode.uri());
                a.b(Boolean.valueOf(offlineEpisode.isExplicit()));
                a.c(offlineEpisode.imageUri().orNull());
                arrayList.add(a.a());
            }
            c.d(arrayList);
            List<OfflinePlaylist> hits2 = offlineResults2.playlists().hits();
            ArrayList arrayList2 = new ArrayList(hits2.size());
            for (OfflinePlaylist offlinePlaylist : hits2) {
                nl1.a a2 = nl1.a();
                a2.d(offlinePlaylist.name());
                a2.e(offlinePlaylist.uri());
                a2.c(offlinePlaylist.imageUri().orNull());
                arrayList2.add(a2.a());
            }
            c.e(arrayList2);
            List<OfflineTrack> hits3 = offlineResults2.tracks().hits();
            ArrayList arrayList3 = new ArrayList(hits3.size());
            for (OfflineTrack offlineTrack : hits3) {
                ol1.a c2 = ol1.c();
                c2.f(offlineTrack.name());
                c2.g(offlineTrack.uri());
                c2.d(Boolean.valueOf(offlineTrack.isExplicit()));
                c2.e(offlineTrack.imageUri().orNull());
                OfflineTrackAlbum orNull = offlineTrack.album().orNull();
                if (orNull == null) {
                    gl1 = null;
                } else {
                    gl1.a b = gl1.b();
                    b.e(orNull.name());
                    b.f(orNull.uri());
                    b.d(orNull.imageUri().orNull());
                    gl1 = b.b();
                }
                c2.a(gl1);
                c2.b(offlineTrack.artistNames());
                arrayList3.add(c2.c());
            }
            c.f(arrayList3);
        }
        return c.c();
    }
}
