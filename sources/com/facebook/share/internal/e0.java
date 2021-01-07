package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.f0;
import com.facebook.internal.z;
import com.facebook.share.model.ShareMedia;
import java.util.List;
import java.util.UUID;

/* access modifiers changed from: package-private */
public final class e0 implements f0.c<ShareMedia, Bundle> {
    final /* synthetic */ UUID a;
    final /* synthetic */ List b;

    e0(UUID uuid, List list) {
        this.a = uuid;
        this.b = list;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.internal.f0.c
    public Bundle apply(ShareMedia shareMedia) {
        ShareMedia shareMedia2 = shareMedia;
        z.b a2 = c.a(this.a, shareMedia2);
        this.b.add(a2);
        Bundle bundle = new Bundle();
        bundle.putString("type", shareMedia2.a().name());
        bundle.putString("uri", a2.g());
        return bundle;
    }
}
