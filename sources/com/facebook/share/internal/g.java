package com.facebook.share.internal;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;

/* access modifiers changed from: package-private */
public final class g implements CallbackManagerImpl.a {
    g() {
    }

    @Override // com.facebook.internal.CallbackManagerImpl.a
    public boolean a(int i, Intent intent) {
        return e.P(CallbackManagerImpl.RequestCodeOffset.Like.d(), i, intent);
    }
}
