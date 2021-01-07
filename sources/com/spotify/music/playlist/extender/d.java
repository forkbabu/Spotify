package com.spotify.music.playlist.extender;

import com.spotify.music.playlist.extender.model.ExtenderResponse;
import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ u a;

    public /* synthetic */ d(u uVar) {
        this.a = uVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return u.d(this.a, (ExtenderResponse) obj);
    }
}
