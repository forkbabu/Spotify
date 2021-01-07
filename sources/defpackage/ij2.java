package defpackage;

import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.artist.dac.ui.binders.ArtistAlbumRowComponentBinder;
import com.spotify.music.navigation.t;
import kotlin.jvm.internal.h;

/* renamed from: ij2  reason: default package */
public final class ij2 implements fjf<a<?>> {
    private final wlf<EncoreConsumerEntryPoint> a;
    private final wlf<t> b;

    public ij2(wlf<EncoreConsumerEntryPoint> wlf, wlf<t> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.a.get();
        t tVar = this.b.get();
        h.e(encoreConsumerEntryPoint, "encoreConsumer");
        h.e(tVar, "navigator");
        return new ArtistAlbumRowComponentBinder(encoreConsumerEntryPoint, tVar);
    }
}
