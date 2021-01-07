package com.spotify.music.features.yourlibraryx.view.entities.cards;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.encore.consumer.components.yourlibrary.api.foldercard.FolderCardLibrary;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryEntityInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryFolderExtraInfo;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.view.r;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.player.model.ContextTrack;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class YourLibraryFolderCardComponentViewHolder extends oh9<FolderCardLibrary.Model, FolderCardLibrary.Events> {
    private final r E;
    private final eh9 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YourLibraryFolderCardComponentViewHolder(Component<FolderCardLibrary.Model, FolderCardLibrary.Events> component, r rVar, eh9 eh9) {
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
        YourLibraryResponseProto$YourLibraryFolderExtraInfo n = aVar2.b().n();
        h.d(n, "item.entity.folder");
        int l = n.l();
        YourLibraryResponseProto$YourLibraryFolderExtraInfo n2 = aVar2.b().n();
        h.d(n2, "item.entity.folder");
        return new FolderCardLibrary.Model(m2, new LibraryItemDescription.Model.Folder(l, n2.i()), this.E.J0(aVar2.b()));
    }

    /* renamed from: u0 */
    public void l0(y.a aVar, nmf<? super YourLibraryXEvent, f> nmf) {
        h.e(aVar, "item");
        h.e(nmf, "output");
        YourLibraryResponseProto$YourLibraryEntityInfo m = aVar.b().m();
        h.d(m, "item.entity.entityInfo");
        ((Component) j0()).onEvent(new YourLibraryFolderCardComponentViewHolder$bindEvents$1(this, m.p(), aVar, nmf));
    }
}
