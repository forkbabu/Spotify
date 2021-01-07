package com.spotify.music.features.yourlibraryx.view.entities.rows;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.yourlibrary.api.sortrow.SortRowLibrary;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.player.model.ContextTrack;
import kotlin.NoWhenBranchMatchedException;
import kotlin.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public final class YourLibrarySortRowComponentViewHolder extends nh9<y.d, SortRowLibrary.Model, SortRowLibrary.Events> {
    private final eh9 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YourLibrarySortRowComponentViewHolder(Component<SortRowLibrary.Model, SortRowLibrary.Events> component, eh9 eh9) {
        super(component, j.b(y.d.class));
        h.e(component, ContextTrack.Metadata.KEY_PROVIDER);
        h.e(eh9, "logger");
        this.E = eh9;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.music.features.yourlibraryx.view.y] */
    @Override // defpackage.nh9
    public SortRowLibrary.Model m0(y.d dVar) {
        SortRowLibrary.SortOrder sortOrder;
        SortRowLibrary.ViewDensity viewDensity;
        y.d dVar2 = dVar;
        h.e(dVar2, "item");
        int ordinal = dVar2.b().ordinal();
        if (ordinal == 0) {
            sortOrder = SortRowLibrary.SortOrder.MostRelevant;
        } else if (ordinal == 1) {
            sortOrder = SortRowLibrary.SortOrder.RecentlyPlayed;
        } else if (ordinal == 2) {
            sortOrder = SortRowLibrary.SortOrder.RecentlyAdded;
        } else if (ordinal == 3) {
            sortOrder = SortRowLibrary.SortOrder.Alphabetical;
        } else if (ordinal == 4) {
            sortOrder = SortRowLibrary.SortOrder.Creator;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int ordinal2 = dVar2.a().ordinal();
        if (ordinal2 == 0) {
            viewDensity = SortRowLibrary.ViewDensity.List;
        } else if (ordinal2 == 1) {
            viewDensity = SortRowLibrary.ViewDensity.Grid;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new SortRowLibrary.Model(sortOrder, viewDensity);
    }

    /* renamed from: u0 */
    public void l0(y.d dVar, nmf<? super YourLibraryXEvent, f> nmf) {
        h.e(dVar, "item");
        h.e(nmf, "output");
        ((Component) j0()).onEvent(new YourLibrarySortRowComponentViewHolder$bindEvents$1(this, dVar, nmf));
    }
}
