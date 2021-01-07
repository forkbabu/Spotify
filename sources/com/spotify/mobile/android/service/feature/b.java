package com.spotify.mobile.android.service.feature;

import io.reactivex.functions.g;
import java.util.Map;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ FlagsManager a;

    public /* synthetic */ b(FlagsManager flagsManager) {
        this.a = flagsManager;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        FlagsManager.r(this.a, (Map) obj);
    }
}
