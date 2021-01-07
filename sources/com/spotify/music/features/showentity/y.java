package com.spotify.music.features.showentity;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.x;
import com.spotify.mobius.e0;
import com.spotify.music.features.showentity.r;
import com.spotify.music.features.showentity.t;
import com.spotify.playlist.models.Show;

/* access modifiers changed from: package-private */
public final class y {
    static final Throwable a = new Throwable("Shows and Episodes with MediaType.Video are already deprecated and not supported.");
    static final Throwable b = new Throwable("Mediatype received is UNKNOWN.");
    private static final ImmutableMap<Integer, Show.MediaType> c = ImmutableMap.of(0, Show.MediaType.MIXED, 1, Show.MediaType.AUDIO, 2, Show.MediaType.VIDEO);

    static e0 a(u uVar, t.c cVar) {
        Show.MediaType mediaType = c.get(Integer.valueOf(cVar.b()));
        Show.MediaType mediaType2 = Show.MediaType.UNKNOWN;
        Show.MediaType mediaType3 = (Show.MediaType) x.n(mediaType, mediaType2);
        if (mediaType3 == Show.MediaType.VIDEO) {
            return e0.a(z42.l(new r.d(uVar.d(), a)));
        }
        if (mediaType3 == mediaType2) {
            Assertion.v("Mediatype received is UNKNOWN.");
            return e0.a(z42.l(new r.d(uVar.d(), b)));
        }
        q qVar = new q(wna.b(uVar.d()), uVar.b(), mediaType3, false);
        return e0.a(z42.l(new r.c(qVar.d(), Optional.fromNullable(qVar.b()))));
    }
}
