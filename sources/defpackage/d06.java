package defpackage;

import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylist;
import com.spotify.encore.consumer.components.playlist.entrypoint.EncoreConsumerParticipantRowPlaylistExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

/* renamed from: d06  reason: default package */
public final class d06 implements fjf<ParticipantRowPlaylist> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public d06(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.a.get();
        h.e(encoreConsumerEntryPoint, "encoreConsumerEntryPoint");
        ParticipantRowPlaylist make = EncoreConsumerParticipantRowPlaylistExtensions.participantRowPlaylistFactory(encoreConsumerEntryPoint.getRows()).make();
        yif.g(make, "Cannot return null from a non-@Nullable @Provides method");
        return make;
    }
}
