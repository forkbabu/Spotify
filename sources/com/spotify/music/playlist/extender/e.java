package com.spotify.music.playlist.extender;

import io.reactivex.functions.g;
import java.util.List;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ u a;

    public /* synthetic */ e(u uVar) {
        this.a = uVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        u.e(this.a, (List) obj);
    }
}
