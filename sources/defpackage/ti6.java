package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.encore.consumer.components.api.trackrow.TrackRowConfiguration;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerExtensions;

/* renamed from: ti6  reason: default package */
public final class ti6 implements fjf<ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public ti6(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration> trackRowFactory = EncoreConsumerExtensions.trackRowFactory(this.a.get().getRows());
        yif.g(trackRowFactory, "Cannot return null from a non-@Nullable @Provides method");
        return trackRowFactory;
    }
}
