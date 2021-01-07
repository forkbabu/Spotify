package com.facebook.share.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.b0;

/* access modifiers changed from: package-private */
@Deprecated
public final class p extends b0 {
    private String s;

    p(Context context, String str, String str2) {
        super(context, 65542, 65543, 20141001, str);
        this.s = str2;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.internal.b0
    public void d(Bundle bundle) {
        bundle.putString("com.facebook.platform.extra.OBJECT_ID", this.s);
    }
}
