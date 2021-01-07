package com.spotify.music.features.yourlibraryx.view.entities.rows;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.encore.consumer.components.yourlibrary.api.folderrow.FolderRowLibrary;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryEntityInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryFolderExtraInfo;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.view.entities.swipe.YourLibraryXSwipeableEntityViewHolder;
import com.spotify.music.features.yourlibraryx.view.r;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.player.model.ContextTrack;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class YourLibraryFolderRowComponentViewHolder extends YourLibraryXSwipeableEntityViewHolder<FolderRowLibrary.Model, FolderRowLibrary.Events> {
    private final r H;
    private final eh9 I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YourLibraryFolderRowComponentViewHolder(Component<FolderRowLibrary.Model, FolderRowLibrary.Events> component, r rVar, eh9 eh9) {
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
        YourLibraryResponseProto$YourLibraryFolderExtraInfo n = aVar2.b().n();
        h.d(n, "item.entity.folder");
        int l = n.l();
        YourLibraryResponseProto$YourLibraryFolderExtraInfo n2 = aVar2.b().n();
        h.d(n2, "item.entity.folder");
        return new FolderRowLibrary.Model(m2, new LibraryItemDescription.Model.Folder(l, n2.i()), aVar2.a(), this.H.J0(aVar2.b()));
    }

    /* renamed from: u0 */
    public void l0(y.a aVar, nmf<? super YourLibraryXEvent, f> nmf) {
        h.e(aVar, "item");
        h.e(nmf, "output");
        YourLibraryResponseProto$YourLibraryEntityInfo m = aVar.b().m();
        h.d(m, "item.entity.entityInfo");
        ((Component) j0()).onEvent(new YourLibraryFolderRowComponentViewHolder$bindEvents$1(this, m.p(), aVar, nmf));
    }
}
