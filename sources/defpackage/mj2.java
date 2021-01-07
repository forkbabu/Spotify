package defpackage;

import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.artist.dac.ui.binders.ArtistPageCarouselComponentBinder;
import kotlin.jvm.internal.h;

/* renamed from: mj2  reason: default package */
public final class mj2 implements fjf<a<?>> {
    private final wlf<s80> a;
    private final wlf<EncoreConsumerEntryPoint> b;

    public mj2(wlf<s80> wlf, wlf<EncoreConsumerEntryPoint> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        wlf<s80> wlf = this.a;
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.b.get();
        h.e(wlf, "dacResolverProvider");
        h.e(encoreConsumerEntryPoint, "encoreConsumer");
        return new ArtistPageCarouselComponentBinder(wlf, encoreConsumerEntryPoint);
    }
}
