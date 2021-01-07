package com.spotify.mobile.android.hubframework.defaults.components.common;

import android.view.View;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import java.util.EnumSet;

final class b extends l91<View> implements d<View> {
    b() {
        super(C0707R.layout.loading_view_indeterminate);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.SPINNER);
    }
}
