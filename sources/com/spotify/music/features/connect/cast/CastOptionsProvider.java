package com.spotify.music.features.connect.cast;

import android.content.Context;
import com.google.android.gms.cast.framework.b;
import com.google.android.gms.cast.framework.e;
import com.google.android.gms.cast.framework.k;
import com.google.android.gms.cast.h;
import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;
import java.util.List;

public class CastOptionsProvider implements e {
    @Override // com.google.android.gms.cast.framework.e
    public List<k> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override // com.google.android.gms.cast.framework.e
    public b getCastOptions(Context context) {
        b.a aVar = new b.a();
        aVar.b(null);
        aVar.f(true);
        aVar.c(true);
        aVar.g(false);
        aVar.e(DiscoveryConfiguration.b().mId);
        h.a aVar2 = new h.a();
        aVar2.b(false);
        aVar.d(aVar2.a());
        return aVar.a();
    }
}
