package com.spotify.music.libs.mediabrowserservice;

import com.spotify.mobile.android.service.media.h2;
import com.spotify.mobile.android.service.media.i2;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.functions.l;

public final /* synthetic */ class w implements l {
    public final /* synthetic */ a2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PlayOrigin c;
    public final /* synthetic */ PreparePlayOptions f;

    public /* synthetic */ w(a2 a2Var, String str, PlayOrigin playOrigin, PreparePlayOptions preparePlayOptions) {
        this.a = a2Var;
        this.b = str;
        this.c = playOrigin;
        this.f = preparePlayOptions;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        a2 a2Var = this.a;
        String str = this.b;
        PlayOrigin playOrigin = this.c;
        PreparePlayOptions preparePlayOptions = this.f;
        i2 Z2 = a2Var.f.Z2();
        h2.a c2 = h2.c(str);
        c2.f(playOrigin);
        c2.g(preparePlayOptions);
        c2.d((LoggingParams) obj);
        return Z2.p(c2.b());
    }
}
