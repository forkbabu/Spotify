package com.spotify.music.features.freetierartist.datasource;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class f implements l {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return s.i0(Optional.of(((li0) optional.get()).a()));
        }
        return s.i0(Optional.absent());
    }
}
