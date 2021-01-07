package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.LoggingBehavior;
import com.facebook.i;
import com.facebook.internal.a;
import com.facebook.internal.a0;
import com.facebook.internal.y;
import com.facebook.k;

/* access modifiers changed from: package-private */
public class j extends s {
    final /* synthetic */ Bundle b;
    final /* synthetic */ e c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j(e eVar, i iVar, Bundle bundle) {
        super(null);
        this.c = eVar;
        this.b = bundle;
    }

    @Override // com.facebook.share.internal.s
    public void a(a aVar) {
        b(aVar, new FacebookOperationCanceledException());
    }

    @Override // com.facebook.share.internal.s
    public void b(a aVar, FacebookException facebookException) {
        LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
        String unused = e.o;
        int i = y.e;
        k.v(loggingBehavior);
        Bundle bundle = this.b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("call_id", aVar.b().toString());
        this.c.R("present_dialog", bundle);
        e.F(this.c, "com.facebook.sdk.LikeActionController.DID_ERROR", a0.d(facebookException));
    }

    @Override // com.facebook.share.internal.s
    public void c(a aVar, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (bundle != null && bundle.containsKey("object_is_liked")) {
            boolean z = bundle.getBoolean("object_is_liked");
            String str6 = this.c.d;
            String str7 = this.c.e;
            if (bundle.containsKey("like_count_string")) {
                str2 = bundle.getString("like_count_string");
                str = str2;
            } else {
                str2 = str6;
                str = str7;
            }
            String str8 = this.c.f;
            String str9 = this.c.g;
            if (bundle.containsKey("social_sentence")) {
                str4 = bundle.getString("social_sentence");
                str3 = str4;
            } else {
                str4 = str8;
                str3 = str9;
            }
            if (bundle.containsKey("object_is_liked")) {
                str5 = bundle.getString("unlike_token");
            } else {
                str5 = this.c.h;
            }
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("call_id", aVar.b().toString());
            this.c.J().g("fb_like_control_dialog_did_succeed", bundle2);
            this.c.X(z, str2, str, str4, str3, str5);
        }
    }
}
