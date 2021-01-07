package com.spotify.pageloader;

import com.spotify.pageloader.rx.effecthandler.EmitterStore;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class ObservableLoadable {
    public static final <T> o0<s<T>> a(s<T> sVar) {
        h.e(sVar, "source");
        c cVar = new c(s.y(new ObservableLoadable$create$1(sVar, new EmitterStore())));
        h.d(cVar, "Loadable.from(\n         …)\n            }\n        )");
        return cVar;
    }
}
