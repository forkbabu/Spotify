package com.spotify.mobile.android.service.media;

import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.z;

public interface i2 {
    s<Integer> a();

    void b();

    void c();

    z<zwd> e(Optional<LoggingParams> optional);

    z<zwd> f(ContextTrack contextTrack);

    g<RestrictedMediaAction> g();

    @Deprecated
    void h(h2 h2Var);

    void i();

    z<zwd> j(ContextTrack contextTrack);

    z<zwd> k(Optional<LoggingParams> optional, boolean z);

    z<zwd> l(long j, Optional<LoggingParams> optional);

    void m(u1 u1Var);

    void n(int i);

    void next();

    void o();

    z<zwd> p(h2 h2Var);

    void pause();

    void previous();

    void q();

    z<zwd> r(LoggingParams loggingParams);

    z<zwd> s(Optional<LoggingParams> optional);

    z<zwd> t(long j, Optional<LoggingParams> optional);
}
