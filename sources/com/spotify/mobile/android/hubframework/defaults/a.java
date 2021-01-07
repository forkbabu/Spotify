package com.spotify.mobile.android.hubframework.defaults;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.ui.layout_traits.a;
import java.util.Collections;
import java.util.Set;

public final /* synthetic */ class a implements a.c {
    public final /* synthetic */ u51 a;

    public /* synthetic */ a(u51 u51) {
        this.a = u51;
    }

    @Override // com.spotify.mobile.android.ui.layout_traits.a.c
    public final Set a(int i, int i2, RecyclerView.e eVar) {
        s51<?> a2 = this.a.a(i2);
        if (a2 instanceof d) {
            return ((d) a2).e();
        }
        return Collections.emptySet();
    }
}
