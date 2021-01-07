package com.spotify.music.features.yourlibraryx.view.entities.cards;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.encore.consumer.components.yourlibrary.api.podcastcard.PodcastCardLibrary;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryAlbumExtraInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryEntityInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryShowExtraInfo;
import com.spotify.music.features.yourlibraryx.c;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.b;
import com.spotify.music.features.yourlibraryx.view.r;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.player.model.ContextTrack;
import kotlin.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public final class YourLibraryPodcastCardComponentViewHolder extends oh9<PodcastCardLibrary.Model, PodcastCardLibrary.Events> {
    private final r E;
    private final eh9 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YourLibraryPodcastCardComponentViewHolder(Component<PodcastCardLibrary.Model, PodcastCardLibrary.Events> component, r rVar, eh9 eh9) {
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
        YourLibraryResponseProto$YourLibraryAlbumExtraInfo h = aVar2.b().h();
        h.d(h, "item.entity.album");
        String h2 = h.h();
        h.d(h2, "item.entity.album.artistName");
        String b = c.b(h2);
        r rVar = this.E;
        YourLibraryResponseProto$YourLibraryShowExtraInfo p = aVar2.b().p();
        h.d(p, "item.entity.show");
        LibraryItemDescription.Model.Show show = new LibraryItemDescription.Model.Show(b, rVar.S(p), !this.E.B(j.b(b.f.class)));
        YourLibraryResponseProto$YourLibraryEntityInfo m3 = aVar2.b().m();
        h.d(m3, "item.entity.entityInfo");
        return new PodcastCardLibrary.Model(m2, show, com.spotify.music.features.yourlibraryx.b.e(m3), this.E.B0(aVar2.b()), this.E.J0(aVar2.b()));
    }

    /* renamed from: u0 */
    public void l0(y.a aVar, nmf<? super YourLibraryXEvent, f> nmf) {
        h.e(aVar, "item");
        h.e(nmf, "output");
        YourLibraryResponseProto$YourLibraryEntityInfo m = aVar.b().m();
        h.d(m, "item.entity.entityInfo");
        ((Component) j0()).onEvent(new YourLibraryPodcastCardComponentViewHolder$bindEvents$1(this, m.p(), aVar, nmf));
    }
}
