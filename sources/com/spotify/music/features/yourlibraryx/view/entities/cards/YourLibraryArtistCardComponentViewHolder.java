package com.spotify.music.features.yourlibraryx.view.entities.cards;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.yourlibrary.api.artistcard.ArtistCardLibrary;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryEntityInfo;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.b;
import com.spotify.music.features.yourlibraryx.view.r;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.player.model.ContextTrack;
import kotlin.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public final class YourLibraryArtistCardComponentViewHolder extends oh9<ArtistCardLibrary.Model, ArtistCardLibrary.Events> {
    private final r E;
    private final eh9 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YourLibraryArtistCardComponentViewHolder(Component<ArtistCardLibrary.Model, ArtistCardLibrary.Events> component, r rVar, eh9 eh9) {
        super(component);
        h.e(component, ContextTrack.Metadata.KEY_PROVIDER);
        h.e(rVar, "decorator");
        h.e(eh9, "logger");
        this.E = rVar;
        this.F = eh9;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.music.features.yourlibraryx.view.y] */
    @Override // defpackage.nh9
    public Object m0(y.a aVar) {
        y.a aVar2 = aVar;
        h.e(aVar2, "item");
        YourLibraryResponseProto$YourLibraryEntityInfo m = aVar2.b().m();
        h.d(m, "item.entity.entityInfo");
        String m2 = m.m();
        h.d(m2, "item.entity.entityInfo.name");
        LibraryItemDescription.Model.Artist artist = new LibraryItemDescription.Model.Artist(!this.E.B(j.b(b.C0269b.class)));
        YourLibraryResponseProto$YourLibraryEntityInfo m3 = aVar2.b().m();
        h.d(m3, "item.entity.entityInfo");
        return new ArtistCardLibrary.Model(m2, artist, com.spotify.music.features.yourlibraryx.b.e(m3), this.E.B0(aVar2.b()), this.E.J0(aVar2.b()));
    }

    /* renamed from: u0 */
    public void l0(y.a aVar, nmf<? super YourLibraryXEvent, f> nmf) {
        h.e(aVar, "item");
        h.e(nmf, "output");
        YourLibraryResponseProto$YourLibraryEntityInfo m = aVar.b().m();
        h.d(m, "item.entity.entityInfo");
        ((Component) j0()).onEvent(new YourLibraryArtistCardComponentViewHolder$bindEvents$1(this, m.p(), aVar, nmf));
    }
}
