package defpackage;

import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.encore.consumer.components.artist.entrypoint.EncoreConsumerArtistHeaderExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.artist.dac.ui.binders.ArtistHeaderComponentBinder;
import com.spotify.music.navigation.t;
import kotlin.jvm.internal.h;

/* renamed from: kj2  reason: default package */
public final class kj2 implements fjf<a<?>> {
    private final wlf<EncoreConsumerEntryPoint> a;
    private final wlf<a8a> b;
    private final wlf<gj2> c;
    private final wlf<t> d;

    public kj2(wlf<EncoreConsumerEntryPoint> wlf, wlf<a8a> wlf2, wlf<gj2> wlf3, wlf<t> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    public static a<?> a(EncoreConsumerEntryPoint encoreConsumerEntryPoint, a8a a8a, gj2 gj2, t tVar) {
        h.e(encoreConsumerEntryPoint, "encoreConsumerEntryPoint");
        h.e(a8a, "artistDecorator");
        h.e(gj2, "rxArtistFollowManager");
        h.e(tVar, "navigator");
        return new ArtistHeaderComponentBinder(EncoreConsumerArtistHeaderExtensions.artistHeaderFactory(encoreConsumerEntryPoint.getHeaders()), a8a, gj2, tVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
