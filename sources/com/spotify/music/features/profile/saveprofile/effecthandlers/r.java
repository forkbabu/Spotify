package com.spotify.music.features.profile.saveprofile.effecthandlers;

import com.google.common.base.Optional;
import com.spotify.music.features.profile.saveprofile.domain.o;
import io.reactivex.functions.c;
import kotlin.jvm.internal.h;

public final /* synthetic */ class r implements c {
    public static final /* synthetic */ r a = new r();

    private /* synthetic */ r() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        Optional optional;
        Optional optional2 = (Optional) obj;
        Float f = (Float) obj2;
        if (optional2.isPresent()) {
            optional = Optional.of(((SaveProfileEffectHandlers$ImageUploadResponse) optional2.get()).uploadToken());
        } else {
            optional = Optional.absent();
        }
        float floatValue = f.floatValue();
        h.e(optional, "uploadToken");
        return new o.h(true, optional, floatValue);
    }
}
