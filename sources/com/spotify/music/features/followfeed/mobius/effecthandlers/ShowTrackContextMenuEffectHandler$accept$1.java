package com.spotify.music.features.followfeed.mobius.effecthandlers;

import com.spotify.mobile.android.ui.contextmenu.r3;
import defpackage.n25;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class ShowTrackContextMenuEffectHandler$accept$1 extends FunctionReferenceImpl implements nmf<n25.l, r3> {
    ShowTrackContextMenuEffectHandler$accept$1(e0 e0Var) {
        super(1, e0Var, e0.class, "onCreateContextMenu", "onCreateContextMenu(Lcom/spotify/music/features/followfeed/mobius/domain/FeedEffect$ShowTrackContextMenu;)Lcom/spotify/mobile/android/ui/contextmenu/ContextMenuDelegate;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public r3 invoke(n25.l lVar) {
        n25.l lVar2 = lVar;
        h.e(lVar2, "p1");
        return e0.a((e0) this.receiver, lVar2);
    }
}
