package com.spotify.mobile.android.service.media;

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.s1;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import java.util.Map;

public abstract class h2 {

    public static abstract class a {
        public abstract a a(u1 u1Var);

        public abstract h2 b();

        /* access modifiers changed from: package-private */
        public abstract a c(Context context);

        public abstract a d(LoggingParams loggingParams);

        public abstract a e(Map<String, String> map);

        public abstract a f(PlayOrigin playOrigin);

        public abstract a g(PreparePlayOptions preparePlayOptions);
    }

    public static a b(Context context) {
        s1.b bVar = new s1.b();
        bVar.h(context.uri());
        bVar.e(context.metadata());
        bVar.c(context);
        return bVar;
    }

    public static a c(String str) {
        s1.b bVar = new s1.b();
        bVar.h(str);
        return bVar;
    }

    public abstract Optional<u1> a();

    public abstract Optional<Context> d();

    public abstract Optional<LoggingParams> e();

    public abstract Optional<Map<String, String>> f();

    public abstract Optional<PlayOrigin> g();

    public abstract Optional<PreparePlayOptions> h();

    public abstract String i();
}
