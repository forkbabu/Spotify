package defpackage;

import com.spotify.libs.search.offline.model.OfflineEntity;
import com.spotify.libs.search.offline.model.OfflineTrack;

/* renamed from: mta  reason: default package */
public class mta implements oqa<OfflineEntity> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.oqa
    public boolean a(OfflineEntity offlineEntity) {
        OfflineEntity offlineEntity2 = offlineEntity;
        if (offlineEntity2 instanceof OfflineTrack) {
            return ((OfflineTrack) offlineEntity2).isMogef19();
        }
        return false;
    }
}
