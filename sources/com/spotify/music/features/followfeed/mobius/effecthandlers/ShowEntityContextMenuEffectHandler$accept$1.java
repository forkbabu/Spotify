package com.spotify.music.features.followfeed.mobius.effecthandlers;

import com.spotify.mobile.android.ui.contextmenu.r3;
import defpackage.n25;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class ShowEntityContextMenuEffectHandler$accept$1 extends FunctionReferenceImpl implements nmf<n25.k, r3> {
    ShowEntityContextMenuEffectHandler$accept$1(b0 b0Var) {
        super(1, b0Var, b0.class, "onCreateContextMenu", "onCreateContextMenu(Lcom/spotify/music/features/followfeed/mobius/domain/FeedEffect$ShowEntityContextMenu;)Lcom/spotify/mobile/android/ui/contextmenu/ContextMenuDelegate;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public r3 invoke(n25.k kVar) {
        n25.k kVar2 = kVar;
        h.e(kVar2, "p1");
        return b0.a((b0) this.receiver, kVar2);
    }
}
