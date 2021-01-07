package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.searchview.assistedcuration.proto.Entity;

/* renamed from: kxa  reason: default package */
public class kxa implements jxa<Entity.EntityCase> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.jxa
    public String a(Entity.EntityCase entityCase) {
        Entity.EntityCase entityCase2 = entityCase;
        int ordinal = entityCase2.ordinal();
        if (ordinal == 0) {
            return "artist";
        }
        if (ordinal == 1) {
            return AppProtocol.TrackData.TYPE_TRACK;
        }
        if (ordinal == 2) {
            return "album";
        }
        Assertion.g("Could not resolve see all identifier for unknown entity case: " + entityCase2);
        return "search";
    }
}
