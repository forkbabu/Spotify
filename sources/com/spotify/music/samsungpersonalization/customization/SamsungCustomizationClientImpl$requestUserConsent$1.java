package com.spotify.music.samsungpersonalization.customization;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.samsung.android.sdk.customizationservice.result.CustomizationServiceException;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class SamsungCustomizationClientImpl$requestUserConsent$1 extends Lambda implements cmf<f> {
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ String $token;
    final /* synthetic */ SamsungCustomizationClientImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SamsungCustomizationClientImpl$requestUserConsent$1(SamsungCustomizationClientImpl samsungCustomizationClientImpl, Fragment fragment, String str) {
        super(0);
        this.this$0 = samsungCustomizationClientImpl;
        this.$fragment = fragment;
        this.$token = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        a h = SamsungCustomizationClientImpl.h(this.this$0);
        Fragment fragment = this.$fragment;
        String str = this.$token;
        h.getClass();
        h.e(fragment, "fragment");
        h.e(str, "token");
        rw.f();
        Intent intent = new Intent();
        intent.setAction("com.samsung.android.customizationservice.CS_SETTINGS");
        intent.putExtra("reqType", 1);
        intent.putExtra("auth_info", str);
        try {
            fragment.H4(intent, 32232, null);
            return f.a;
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            throw new CustomizationServiceException(e.getMessage(), 12);
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new CustomizationServiceException(e2.getMessage());
        }
    }
}
