package com.spotify.mobile.android.hubframework.defaults;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import com.spotify.mobile.android.ui.layout_traits.TraitsLayoutManager;
import com.spotify.mobile.android.ui.layout_traits.a;

/* access modifiers changed from: package-private */
public class n implements m {
    private final Context a;
    private final a b;
    private final int c;

    public n(Context context, a aVar, int i) {
        this.a = context;
        this.b = aVar;
        this.c = i;
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.m
    public GridLayoutManager create() {
        return new TraitsLayoutManager(this.a, this.b, this.c);
    }
}
