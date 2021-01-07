package defpackage;

import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.artist.dac.ui.binders.ArtistSectionHeaderComponentBinder;
import kotlin.jvm.internal.h;

/* renamed from: qj2  reason: default package */
public final class qj2 implements fjf<a<?>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public qj2(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.a.get();
        h.e(encoreConsumerEntryPoint, "encoreConsumer");
        return new ArtistSectionHeaderComponentBinder(encoreConsumerEntryPoint);
    }
}
