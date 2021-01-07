package com.spotify.music.features.podcast.notifications;

import com.spotify.mobius.s;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class NotificationsBottomDrawerInjector$createController$1 extends FunctionReferenceImpl implements nmf<ig7, s<ig7, fg7>> {
    public static final NotificationsBottomDrawerInjector$createController$1 a = new NotificationsBottomDrawerInjector$createController$1();

    NotificationsBottomDrawerInjector$createController$1() {
        super(1, hg7.class, "init", "init(Lcom/spotify/music/features/podcast/notifications/domain/NotificationsBottomDrawerModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<ig7, fg7> invoke(ig7 ig7) {
        ig7 ig72 = ig7;
        h.e(ig72, "p1");
        h.e(ig72, "model");
        s<ig7, fg7> b = s.b(ig72);
        h.d(b, "First.first(model)");
        return b;
    }
}
