package defpackage;

import com.spotify.libs.search.offline.model.OfflineEntity;
import com.spotify.libs.search.offline.model.OfflineEpisode;
import com.spotify.libs.search.offline.model.OfflineTrack;

/* renamed from: kta  reason: default package */
public class kta implements oqa<OfflineEntity> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.oqa
    public boolean a(OfflineEntity offlineEntity) {
        OfflineEntity offlineEntity2 = offlineEntity;
        if (offlineEntity2 instanceof OfflineTrack) {
            return ((OfflineTrack) offlineEntity2).isExplicit();
        }
        if (offlineEntity2 instanceof OfflineEpisode) {
            return ((OfflineEpisode) offlineEntity2).isExplicit();
        }
        return false;
    }
}
