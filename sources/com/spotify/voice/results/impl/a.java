package com.spotify.voice.results.impl;

import android.widget.ImageView;
import com.spotify.voice.results.model.e;
import io.reactivex.functions.h;

public final class a {
    private final wlf<h<ImageView, String, String, ng0>> a;
    private final wlf<f> b;

    public a(wlf<h<ImageView, String, String, ng0>> wlf, wlf<f> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public VoiceResultsPageElement b(e eVar) {
        h<ImageView, String, String, ng0> hVar = this.a.get();
        a(hVar, 1);
        f fVar = this.b.get();
        a(fVar, 2);
        a(eVar, 3);
        return new VoiceResultsPageElement(hVar, fVar, eVar);
    }
}
