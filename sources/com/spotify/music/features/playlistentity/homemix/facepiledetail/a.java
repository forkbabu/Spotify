package com.spotify.music.features.playlistentity.homemix.facepiledetail;

import com.spotify.music.features.playlistentity.homemix.facepiledetail.d;
import com.spotify.playlist.models.k;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ d.a a;

    public /* synthetic */ a(d.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        k kVar = (k) obj;
        d.d(d.this, kVar.j(), kVar.getItems());
    }
}
