package defpackage;

import com.google.common.base.Function;
import com.spotify.music.sociallistening.facepile.g;
import com.spotify.music.sociallistening.models.Participant;

/* renamed from: w4d  reason: default package */
public final /* synthetic */ class w4d implements Function {
    public static final /* synthetic */ w4d a = new w4d();

    private /* synthetic */ w4d() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Participant participant = (Participant) obj;
        String username = participant.getUsername();
        username.getClass();
        return new g(username, participant.getDisplayName(), participant.getLargeImageUrl());
    }
}
