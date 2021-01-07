package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.b0;

/* access modifiers changed from: package-private */
public class d implements b0.b {
    final /* synthetic */ e a;

    d(e eVar) {
        this.a = eVar;
    }

    @Override // com.facebook.internal.b0.b
    public void a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (bundle != null && bundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED")) {
            boolean z = bundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
            if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE")) {
                str = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
            } else {
                str = this.a.d;
            }
            if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE")) {
                str2 = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
            } else {
                str2 = this.a.e;
            }
            if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE")) {
                str3 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
            } else {
                str3 = this.a.f;
            }
            if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE")) {
                str4 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
            } else {
                str4 = this.a.g;
            }
            if (bundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN")) {
                str5 = bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN");
            } else {
                str5 = this.a.h;
            }
            this.a.X(z, str, str2, str3, str4, str5);
        }
    }
}
