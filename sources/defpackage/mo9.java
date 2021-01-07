package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.home.api.likedsongscard.LikedSongsCardHome;
import com.spotify.encore.consumer.components.home.entrypoint.EncoreConsumerLikedSongsCardHomeExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

/* renamed from: mo9  reason: default package */
public final class mo9 implements fjf<ComponentFactory<Component<LikedSongsCardHome.Model, LikedSongsCardHome.Events>, LikedSongsCardHome.Configuration>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public mo9(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.a.get();
        h.e(encoreConsumerEntryPoint, "encoreEntryPoint");
        ComponentFactory<Component<LikedSongsCardHome.Model, LikedSongsCardHome.Events>, LikedSongsCardHome.Configuration> likedSongsCardHomeFactory = EncoreConsumerLikedSongsCardHomeExtensions.likedSongsCardHomeFactory(encoreConsumerEntryPoint.getCards());
        yif.g(likedSongsCardHomeFactory, "Cannot return null from a non-@Nullable @Provides method");
        return likedSongsCardHomeFactory;
    }
}
