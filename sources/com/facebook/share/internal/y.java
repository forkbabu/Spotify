package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.f0;
import com.facebook.internal.z;

/* access modifiers changed from: package-private */
public final class y implements f0.c<z.b, Bundle> {
    y() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.internal.f0.c
    public Bundle apply(z.b bVar) {
        z.b bVar2 = bVar;
        Bundle bundle = new Bundle();
        bundle.putString("uri", bVar2.g());
        String s = c.s(bVar2.h());
        if (s != null) {
            f0.L(bundle, "extension", s);
        }
        return bundle;
    }
}
