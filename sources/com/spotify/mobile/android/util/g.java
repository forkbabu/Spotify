package com.spotify.mobile.android.util;

import android.content.Context;
import com.google.common.base.Supplier;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable;

public final /* synthetic */ class g implements Supplier {
    public final /* synthetic */ Context a;

    public /* synthetic */ g(Context context) {
        this.a = context;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return new DownloadIndicatorDrawable(this.a);
    }
}
