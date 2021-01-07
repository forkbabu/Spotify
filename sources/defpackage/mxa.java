package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.searchview.assistedcuration.proto.EntityType;

/* renamed from: mxa  reason: default package */
public class mxa implements jxa<EntityType> {
    mxa() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.jxa
    public String a(EntityType entityType) {
        EntityType entityType2 = entityType;
        int ordinal = entityType2.ordinal();
        if (ordinal == 1) {
            return "artist";
        }
        if (ordinal == 2) {
            return AppProtocol.TrackData.TYPE_TRACK;
        }
        if (ordinal == 3) {
            return "album";
        }
        Assertion.g("Could not resolve see all identifier for unknown entity type: " + entityType2);
        return "unknown";
    }
}
