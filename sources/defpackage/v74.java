package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.genrehub.api.genrehubheader.GenreHubHeader;

/* renamed from: v74  reason: default package */
public final class v74 implements fjf<u74> {
    private final wlf<ComponentFactory<Component<GenreHubHeader.Model, GenreHubHeader.Events>, GenreHubHeader.Configuration>> a;

    public v74(wlf<ComponentFactory<Component<GenreHubHeader.Model, GenreHubHeader.Events>, GenreHubHeader.Configuration>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u74(this.a);
    }
}
