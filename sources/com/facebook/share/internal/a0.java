package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.i;
import com.facebook.internal.a;

final class a0 extends s {
    final /* synthetic */ i b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a0(i iVar, i iVar2) {
        super(iVar);
        this.b = iVar2;
    }

    @Override // com.facebook.share.internal.s
    public void a(a aVar) {
        c.u(this.b);
    }

    @Override // com.facebook.share.internal.s
    public void b(a aVar, FacebookException facebookException) {
        c.v(this.b, facebookException);
    }

    @Override // com.facebook.share.internal.s
    public void c(a aVar, Bundle bundle) {
        String str;
        String str2;
        if (bundle != null) {
            if (bundle.containsKey("completionGesture")) {
                str = bundle.getString("completionGesture");
            } else {
                str = bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
            }
            if (str == null || "post".equalsIgnoreCase(str)) {
                if (bundle.containsKey("postId")) {
                    str2 = bundle.getString("postId");
                } else if (bundle.containsKey("com.facebook.platform.extra.POST_ID")) {
                    str2 = bundle.getString("com.facebook.platform.extra.POST_ID");
                } else {
                    str2 = bundle.getString("post_id");
                }
                c.w(this.b, str2);
            } else if ("cancel".equalsIgnoreCase(str)) {
                c.u(this.b);
            } else {
                c.v(this.b, new FacebookException("UnknownError"));
            }
        }
    }
}
