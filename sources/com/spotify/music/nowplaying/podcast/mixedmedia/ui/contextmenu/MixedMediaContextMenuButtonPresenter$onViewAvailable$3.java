package com.spotify.music.nowplaying.podcast.mixedmedia.ui.contextmenu;

import com.spotify.music.nowplaying.common.view.contextmenu.o;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class MixedMediaContextMenuButtonPresenter$onViewAvailable$3 extends FunctionReferenceImpl implements nmf<o, f> {
    MixedMediaContextMenuButtonPresenter$onViewAvailable$3(MixedMediaContextMenuButtonPresenter mixedMediaContextMenuButtonPresenter) {
        super(1, mixedMediaContextMenuButtonPresenter, MixedMediaContextMenuButtonPresenter.class, "onContextMenuConfigurationChanged", "onContextMenuConfigurationChanged(Lcom/spotify/music/nowplaying/common/view/contextmenu/ContextMenuConfiguration;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(o oVar) {
        o oVar2 = oVar;
        h.e(oVar2, "p1");
        MixedMediaContextMenuButtonPresenter.b((MixedMediaContextMenuButtonPresenter) this.receiver, oVar2);
        return f.a;
    }
}
