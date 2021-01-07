package com.facebook.share.internal;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;

/* access modifiers changed from: package-private */
public final class b0 implements CallbackManagerImpl.a {
    final /* synthetic */ int a;

    b0(int i) {
        this.a = i;
    }

    @Override // com.facebook.internal.CallbackManagerImpl.a
    public boolean a(int i, Intent intent) {
        return c.t(this.a, i, intent, new a0(null, null));
    }
}
