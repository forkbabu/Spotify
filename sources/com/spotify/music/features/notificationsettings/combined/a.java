package com.spotify.music.features.notificationsettings.combined;

import com.spotify.music.features.notificationsettings.common.Channel;

public final /* synthetic */ class a implements io.reactivex.functions.a {
    public final /* synthetic */ g a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Channel c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ a(g gVar, String str, Channel channel, boolean z) {
        this.a = gVar;
        this.b = str;
        this.c = channel;
        this.d = z;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.d(this.b, this.c, this.d);
    }
}
