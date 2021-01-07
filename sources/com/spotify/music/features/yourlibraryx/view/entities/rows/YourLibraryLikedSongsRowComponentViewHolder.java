package com.spotify.music.features.yourlibraryx.view.entities.rows;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.encore.consumer.components.yourlibrary.api.likedsongsrow.LikedSongsRowLibrary;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$Offline$Availability;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryCollectionExtraInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryEntityInfo;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.b;
import com.spotify.music.features.yourlibraryx.view.entities.swipe.YourLibraryXSwipeableEntityViewHolder;
import com.spotify.music.features.yourlibraryx.view.r;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.player.model.ContextTrack;
import kotlin.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public final class YourLibraryLikedSongsRowComponentViewHolder extends YourLibraryXSwipeableEntityViewHolder<LikedSongsRowLibrary.Model, LikedSongsRowLibrary.Events> {
    private final r H;
    private final eh9 I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YourLibraryLikedSongsRowComponentViewHolder(Component<LikedSongsRowLibrary.Model, LikedSongsRowLibrary.Events> component, r rVar, eh9 eh9) {
        super(component, rVar);
        h.e(component, ContextTrack.Metadata.KEY_PROVIDER);
        h.e(rVar, "decorator");
        h.e(eh9, "logger");
        this.H = rVar;
        this.I = eh9;
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
        LibraryItemDescription.Model.LikedSongs likedSongs = new LibraryItemDescription.Model.LikedSongs(i.i(), !this.H.B(j.b(b.e.class)));
        YourLibraryResponseProto$YourLibraryCollectionExtraInfo i2 = aVar2.b().i();
        h.d(i2, "item.entity.collection");
        YourLibraryResponseProto$Offline$Availability l = i2.l();
        h.d(l, "item.entity.collection.offlineAvailability");
        return new LikedSongsRowLibrary.Model(m2, likedSongs, com.spotify.music.features.yourlibraryx.b.d(l), this.H.B0(aVar2.b()), aVar2.a(), this.H.J0(aVar2.b()));
    }

    /* renamed from: u0 */
    public void l0(y.a aVar, nmf<? super YourLibraryXEvent, f> nmf) {
        h.e(aVar, "item");
        h.e(nmf, "output");
        YourLibraryResponseProto$YourLibraryEntityInfo m = aVar.b().m();
        h.d(m, "item.entity.entityInfo");
        ((Component) j0()).onEvent(new YourLibraryLikedSongsRowComponentViewHolder$bindEvents$1(this, m.p(), aVar, nmf));
    }
}
