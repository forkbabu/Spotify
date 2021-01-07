package com.spotify.mobile.android.util;

import android.content.Context;
import com.google.common.base.Supplier;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable;

public final /* synthetic */ class j implements Supplier {
    public final /* synthetic */ Context a;

    public /* synthetic */ j(Context context) {
        this.a = context;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return new DownloadIndicatorDrawable(this.a);
    }
}
