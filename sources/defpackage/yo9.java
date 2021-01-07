package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.artist.api.artistcardfollow.ArtistCardFollow;
import com.spotify.encore.consumer.components.artist.entrypoint.EncoreConsumerExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

/* renamed from: yo9  reason: default package */
public final class yo9 implements fjf<Component<ArtistCardFollow.Model, ArtistCardFollow.Events>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public yo9(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.a.get();
        h.e(encoreConsumerEntryPoint, "encoreConsumerEntryPoint");
        Component<ArtistCardFollow.Model, ArtistCardFollow.Events> make = EncoreConsumerExtensions.artistCardFollowFactory(encoreConsumerEntryPoint.getCards()).make();
        yif.g(make, "Cannot return null from a non-@Nullable @Provides method");
        return make;
    }
}
