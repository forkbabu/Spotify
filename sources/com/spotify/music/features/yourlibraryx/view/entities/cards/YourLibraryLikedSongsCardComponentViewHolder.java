package com.spotify.music.features.yourlibraryx.view.entities.cards;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.encore.consumer.components.yourlibrary.api.likedsongscard.LikedSongsCardLibrary;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$Offline$Availability;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryCollectionExtraInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryEntityInfo;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.b;
import com.spotify.music.features.yourlibraryx.view.r;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.player.model.ContextTrack;
import kotlin.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public final class YourLibraryLikedSongsCardComponentViewHolder extends oh9<LikedSongsCardLibrary.Model, LikedSongsCardLibrary.Events> {
    private final r E;
    private final eh9 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YourLibraryLikedSongsCardComponentViewHolder(Component<LikedSongsCardLibrary.Model, LikedSongsCardLibrary.Events> component, r rVar, eh9 eh9) {
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
        YourLibraryResponseProto$YourLibraryCollectionExtraInfo i = aVar2.b().i();
        h.d(i, "item.entity.collection");
        LibraryItemDescription.Model.LikedSongs likedSongs = new LibraryItemDescription.Model.LikedSongs(i.i(), !this.E.B(j.b(b.e.class)) && !this.E.B(j.b(b.f.class)));
        YourLibraryResponseProto$YourLibraryCollectionExtraInfo i2 = aVar2.b().i();
        h.d(i2, "item.entity.collection");
        YourLibraryResponseProto$Offline$Availability l = i2.l();
        h.d(l, "item.entity.collection.offlineAvailability");
        return new LikedSongsCardLibrary.Model(m2, likedSongs, com.spotify.music.features.yourlibraryx.b.d(l), this.E.B0(aVar2.b()), this.E.J0(aVar2.b()));
    }

    /* renamed from: u0 */
    public void l0(y.a aVar, nmf<? super YourLibraryXEvent, f> nmf) {
        h.e(aVar, "item");
        h.e(nmf, "output");
        YourLibraryResponseProto$YourLibraryEntityInfo m = aVar.b().m();
        h.d(m, "item.entity.entityInfo");
        ((Component) j0()).onEvent(new YourLibraryLikedSongsCardComponentViewHolder$bindEvents$1(this, m.p(), nmf));
    }
}
