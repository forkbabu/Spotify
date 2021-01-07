package com.spotify.music.features.blendtastematch.view;

import com.spotify.music.features.blendtastematch.BlendTasteMatchInjector;
import com.spotify.music.features.blendtastematch.api.d;
import com.squareup.picasso.Picasso;

public final class b {
    private final wlf<BlendTasteMatchInjector> a;
    private final wlf<String> b;
    private final wlf<Picasso> c;

    public b(wlf<BlendTasteMatchInjector> wlf, wlf<String> wlf2, wlf<Picasso> wlf3) {
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

    public a b(d dVar) {
        BlendTasteMatchInjector blendTasteMatchInjector = this.a.get();
        a(blendTasteMatchInjector, 1);
        String str = this.b.get();
        a(str, 2);
        Picasso picasso = this.c.get();
        a(picasso, 3);
        a(dVar, 4);
        return new a(blendTasteMatchInjector, str, picasso, dVar);
    }
}
