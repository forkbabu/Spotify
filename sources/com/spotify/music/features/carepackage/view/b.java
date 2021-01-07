package com.spotify.music.features.carepackage.view;

import com.spotify.music.features.carepackage.CarePackageInjector;
import com.spotify.music.preview.q;
import com.spotify.playlist.models.k;
import com.squareup.picasso.Picasso;
import io.reactivex.s;

public final class b {
    private final wlf<Picasso> a;
    private final wlf<CarePackageInjector> b;
    private final wlf<q> c;

    public b(wlf<Picasso> wlf, wlf<CarePackageInjector> wlf2, wlf<q> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public a b(s<k> sVar, ui4 ui4) {
        Picasso picasso = this.a.get();
        a(picasso, 1);
        Picasso picasso2 = picasso;
        CarePackageInjector carePackageInjector = this.b.get();
        a(carePackageInjector, 2);
        CarePackageInjector carePackageInjector2 = carePackageInjector;
        q qVar = this.c.get();
        a(qVar, 3);
        a(sVar, 4);
        a(ui4, 5);
        return new a(picasso2, carePackageInjector2, qVar, sVar, ui4);
    }
}
