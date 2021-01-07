package com.spotify.music.features.assistedcuration.search;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ AssistedCurationSearchActivity a;

    public /* synthetic */ a(AssistedCurationSearchActivity assistedCurationSearchActivity) {
        this.a = assistedCurationSearchActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        AssistedCurationSearchActivity.V0(this.a, (SessionState) obj);
    }
}
