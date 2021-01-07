package com.spotify.music.features.yourlibraryx.view.entities.cards;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.encore.consumer.components.yourlibrary.api.playlistcard.PlaylistCardLibrary;
import com.spotify.encore.consumer.elements.badge.download.DownloadState;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$Offline$Availability;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryEntityInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryPlaylistExtraInfo;
import com.spotify.music.features.yourlibraryx.c;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.b;
import com.spotify.music.features.yourlibraryx.view.r;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.player.model.ContextTrack;
import kotlin.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public final class YourLibraryPlaylistCardComponentViewHolder extends oh9<PlaylistCardLibrary.Model, PlaylistCardLibrary.Events> {
    private final r E;
    private final eh9 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YourLibraryPlaylistCardComponentViewHolder(Component<PlaylistCardLibrary.Model, PlaylistCardLibrary.Events> component, r rVar, eh9 eh9) {
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
        YourLibraryResponseProto$YourLibraryPlaylistExtraInfo o = aVar2.b().o();
        h.d(o, "item.entity.playlist");
        String h = o.h();
        h.d(h, "item.entity.playlist.creatorName");
        LibraryItemDescription.Model.Playlist playlist = new LibraryItemDescription.Model.Playlist(c.b(h), !this.E.B(j.b(b.e.class)));
        YourLibraryResponseProto$YourLibraryPlaylistExtraInfo o2 = aVar2.b().o();
        h.d(o2, "item.entity.playlist");
        YourLibraryResponseProto$Offline$Availability l = o2.l();
        h.d(l, "item.entity.playlist.offlineAvailability");
        DownloadState d = com.spotify.music.features.yourlibraryx.b.d(l);
        YourLibraryResponseProto$YourLibraryEntityInfo m3 = aVar2.b().m();
        h.d(m3, "item.entity.entityInfo");
        return new PlaylistCardLibrary.Model(m2, playlist, d, com.spotify.music.features.yourlibraryx.b.e(m3), this.E.B0(aVar2.b()), this.E.J0(aVar2.b()));
    }

    /* renamed from: u0 */
    public void l0(y.a aVar, nmf<? super YourLibraryXEvent, f> nmf) {
        h.e(aVar, "item");
        h.e(nmf, "output");
        YourLibraryResponseProto$YourLibraryEntityInfo m = aVar.b().m();
        h.d(m, "item.entity.entityInfo");
        ((Component) j0()).onEvent(new YourLibraryPlaylistCardComponentViewHolder$bindEvents$1(this, m.p(), aVar, nmf));
    }
}
