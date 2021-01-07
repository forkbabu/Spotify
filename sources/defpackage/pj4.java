package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowCharts;
import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowChartsConfiguration;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerExtensions;

/* renamed from: pj4  reason: default package */
public final class pj4 implements fjf<ComponentFactory<Component<TrackRowCharts.Model, TrackRowCharts.Events>, TrackRowChartsConfiguration>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public pj4(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ComponentFactory<Component<TrackRowCharts.Model, TrackRowCharts.Events>, TrackRowChartsConfiguration> trackRowChartsFactory = EncoreConsumerExtensions.trackRowChartsFactory(this.a.get().getRows());
        yif.g(trackRowChartsFactory, "Cannot return null from a non-@Nullable @Provides method");
        return trackRowChartsFactory;
    }
}
