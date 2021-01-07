package com.spotify.music.features.yourlibraryx.view.entities.swipe;

import com.spotify.encore.Component;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.view.r;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.player.model.ContextTrack;
import kotlin.f;
import kotlin.jvm.internal.h;

public abstract class YourLibraryXSwipeableEntityViewHolder<M, E> extends oh9<M, E> implements c {
    public static final /* synthetic */ int G = 0;
    private SwipeAction E;
    private final r F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YourLibraryXSwipeableEntityViewHolder(Component<M, E> component, r rVar) {
        super(component);
        h.e(component, ContextTrack.Metadata.KEY_PROVIDER);
        h.e(rVar, "decorator");
        this.F = rVar;
    }

    @Override // com.spotify.music.features.yourlibraryx.view.entities.swipe.c
    public SwipeAction f() {
        return null;
    }

    @Override // defpackage.nh9, defpackage.qh9
    public void h0(y yVar, nmf<? super YourLibraryXEvent, f> nmf) {
        h.e(yVar, "item");
        h.e(nmf, "output");
        super.h0(yVar, nmf);
        SwipeAction swipeAction = null;
        if (((y.a) (!(yVar instanceof y.a) ? null : yVar)) != null) {
            SwipeAction Y1 = this.F.Y1(((y.a) yVar).b());
            if (Y1 != null) {
                swipeAction = SwipeAction.a(Y1, 0, null, new YourLibraryXSwipeableEntityViewHolder$bind$$inlined$let$lambda$1(this, yVar, nmf), 3);
            }
            this.E = swipeAction;
        }
    }

    @Override // com.spotify.music.features.yourlibraryx.view.entities.swipe.c
    public SwipeAction l() {
        return this.E;
    }
}
