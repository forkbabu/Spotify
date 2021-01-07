package defpackage;

import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.encore.consumer.components.artist.entrypoint.EncoreConsumerExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.artist.dac.ui.binders.ArtistPlaylistCardComponentBinder;
import com.spotify.music.navigation.t;
import kotlin.jvm.internal.h;

/* renamed from: pj2  reason: default package */
public final class pj2 implements fjf<a<?>> {
    private final wlf<t> a;
    private final wlf<EncoreConsumerEntryPoint> b;

    public pj2(wlf<t> wlf, wlf<EncoreConsumerEntryPoint> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static a<?> a(t tVar, EncoreConsumerEntryPoint encoreConsumerEntryPoint) {
        h.e(tVar, "navigator");
        h.e(encoreConsumerEntryPoint, "encoreConsumer");
        return new ArtistPlaylistCardComponentBinder(tVar, EncoreConsumerExtensions.playlistCardArtistFactory(encoreConsumerEntryPoint.getCards()));
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get());
    }
}
