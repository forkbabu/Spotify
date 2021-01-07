package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.home.api.likedsongscard.LikedSongsCardHome;

/* renamed from: jo9  reason: default package */
public final class jo9 implements fjf<io9> {
    private final wlf<ComponentFactory<Component<LikedSongsCardHome.Model, LikedSongsCardHome.Events>, LikedSongsCardHome.Configuration>> a;

    public jo9(wlf<ComponentFactory<Component<LikedSongsCardHome.Model, LikedSongsCardHome.Events>, LikedSongsCardHome.Configuration>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new io9(this.a.get());
    }
}
