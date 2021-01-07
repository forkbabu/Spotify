package com.spotify.superbird.earcon;

import io.reactivex.a;
import java.util.ArrayList;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class b implements a {
    private final ene a;

    public b(ene ene) {
        h.e(ene, "externalVoiceEarconPlayer");
        this.a = ene;
    }

    @Override // com.spotify.superbird.earcon.a
    public a a(EarconType earconType) {
        h.e(earconType, "type");
        a b = this.a.b(earconType.g());
        h.d(b, "externalVoiceEarconPlayer.play(type.rawRes)");
        return b;
    }

    @Override // com.spotify.superbird.earcon.a
    public void start() {
        ene ene = this.a;
        EarconType[] values = EarconType.values();
        ArrayList arrayList = new ArrayList(3);
        for (EarconType earconType : values) {
            arrayList.add(Integer.valueOf(earconType.g()));
        }
        ene.c(d.P(arrayList));
    }

    @Override // com.spotify.superbird.earcon.a
    public void stop() {
        this.a.d();
    }
}
