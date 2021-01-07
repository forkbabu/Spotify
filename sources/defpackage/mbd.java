package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.spotify.music.sociallistening.models.Participant;

/* renamed from: mbd  reason: default package */
public final /* synthetic */ class mbd implements Predicate {
    public static final /* synthetic */ mbd a = new mbd();

    private /* synthetic */ mbd() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        Participant participant = (Participant) obj;
        participant.getClass();
        return ((Boolean) MoreObjects.firstNonNull(Boolean.valueOf(participant.isHost()), Boolean.FALSE)).booleanValue();
    }
}
