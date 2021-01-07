package com.spotify.mobile.android.service.feature;

import com.spotify.android.flags.g;
import io.reactivex.functions.f;

public final /* synthetic */ class e implements f {
    public final /* synthetic */ FlagsManager a;
    public final /* synthetic */ g b;

    public /* synthetic */ e(FlagsManager flagsManager, g gVar) {
        this.a = flagsManager;
        this.b = gVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.t(this.b);
    }
}
