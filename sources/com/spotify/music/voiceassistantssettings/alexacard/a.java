package com.spotify.music.voiceassistantssettings.alexacard;

import defpackage.af2;
import defpackage.ee2;
import io.reactivex.functions.l;
import kotlin.Pair;
import kotlin.jvm.internal.h;

final class a<T, R> implements l<af2, Pair<? extends String, ? extends String>> {
    final /* synthetic */ ee2 a;

    a(ee2 ee2) {
        this.a = ee2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Pair<? extends String, ? extends String> apply(af2 af2) {
        af2 af22 = af2;
        h.e(af22, "spotifyAuthorizationResult");
        ee2 ee2 = this.a;
        if (ee2 != null) {
            return new Pair<>(((ee2.c) ee2).a(), ((af2.b) af22).a());
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.alexaaccountlinking.authorization.alexa.AlexaAuthorizationResult.Success");
    }
}
