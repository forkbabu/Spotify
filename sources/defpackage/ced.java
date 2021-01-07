package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.spotify.music.sociallistening.models.Participant;

/* renamed from: ced  reason: default package */
public final /* synthetic */ class ced implements Predicate {
    public static final /* synthetic */ ced a = new ced();

    private /* synthetic */ ced() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        Participant participant = (Participant) obj;
        participant.getClass();
        return ((Boolean) MoreObjects.firstNonNull(Boolean.valueOf(participant.isHost()), Boolean.FALSE)).booleanValue();
    }
}
