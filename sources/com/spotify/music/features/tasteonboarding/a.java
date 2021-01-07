package com.spotify.music.features.tasteonboarding;

import android.os.Bundle;
import com.google.common.base.Function;

public final /* synthetic */ class a implements Function {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("fragment_snapshot", ((gz1) obj).e().a);
        return bundle;
    }
}
