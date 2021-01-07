package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.genrehub.api.genrehubheader.GenreHubHeader;
import com.spotify.encore.consumer.components.genrehub.entrypoint.EncoreConsumerGenreHubHeaderExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

/* renamed from: ia4  reason: default package */
public final class ia4 implements fjf<ComponentFactory<Component<GenreHubHeader.Model, GenreHubHeader.Events>, GenreHubHeader.Configuration>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public ia4(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ComponentFactory<Component<GenreHubHeader.Model, GenreHubHeader.Events>, GenreHubHeader.Configuration> genreHubHeaderFactory = EncoreConsumerGenreHubHeaderExtensions.genreHubHeaderFactory(this.a.get().getHeaders());
        yif.g(genreHubHeaderFactory, "Cannot return null from a non-@Nullable @Provides method");
        return genreHubHeaderFactory;
    }
}
