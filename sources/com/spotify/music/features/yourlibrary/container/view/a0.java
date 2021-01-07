package com.spotify.music.features.yourlibrary.container.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.features.yourlibrary.container.e;
import com.spotify.music.features.yourlibrary.container.h;
import com.spotify.music.features.yourlibrary.container.utils.j;

public final class a0 {
    private final wlf<Context> a;
    private final wlf<h> b;
    private final wlf<s> c;
    private final wlf<b29> d;
    private final wlf<u> e;
    private final wlf<e> f;
    private final wlf<j> g;

    public a0(wlf<Context> wlf, wlf<h> wlf2, wlf<s> wlf3, wlf<b29> wlf4, wlf<u> wlf5, wlf<e> wlf6, wlf<j> wlf7) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
        a(wlf7, 7);
        this.g = wlf7;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public x b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        a(layoutInflater, 1);
        LayoutInflater layoutInflater2 = layoutInflater;
        Context context = this.a.get();
        a(context, 3);
        Context context2 = context;
        h hVar = this.b.get();
        a(hVar, 4);
        h hVar2 = hVar;
        s sVar = this.c.get();
        a(sVar, 5);
        s sVar2 = sVar;
        b29 b29 = this.d.get();
        a(b29, 6);
        b29 b292 = b29;
        u uVar = this.e.get();
        a(uVar, 7);
        u uVar2 = uVar;
        e eVar = this.f.get();
        a(eVar, 8);
        e eVar2 = eVar;
        j jVar = this.g.get();
        a(jVar, 9);
        return new x(layoutInflater2, viewGroup, context2, hVar2, sVar2, b292, uVar2, eVar2, jVar);
    }
}
