package com.spotify.music.features.notificationsettings.channels;

import com.spotify.mobius.e0;
import com.spotify.music.features.notificationsettings.channels.e;
import com.spotify.music.features.notificationsettings.channels.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class ChannelsInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<m, f, e0<m, e>> {
    public static final ChannelsInjector$createLoopFactory$1 a = new ChannelsInjector$createLoopFactory$1();

    ChannelsInjector$createLoopFactory$1() {
        super(2, d.class, "update", "update(Lcom/spotify/music/features/notificationsettings/channels/ChannelsModel;Lcom/spotify/music/features/notificationsettings/channels/ChannelsEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<m, e> invoke(m mVar, f fVar) {
        m mVar2 = mVar;
        f fVar2 = fVar;
        h.e(mVar2, "p1");
        h.e(fVar2, "p2");
        h.e(mVar2, "model");
        h.e(fVar2, "event");
        if (fVar2 instanceof f.a) {
            f.a aVar = (f.a) fVar2;
            e0<m, e> a2 = e0.a(z42.l(new e.a(aVar.a(), aVar.b())));
            h.d(a2, "dispatch(\n            ef…)\n            )\n        )");
            return a2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
