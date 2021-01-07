package com.spotify.encore.consumer.components.impl.sectionheading;

import android.view.View;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import kotlin.jvm.internal.h;

public final class TitleAcessibilityDelegateKt$headingAccessibilityDelegate$1 extends z3 {
    TitleAcessibilityDelegateKt$headingAccessibilityDelegate$1() {
    }

    @Override // defpackage.z3
    public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
        h.e(view, "host");
        h.e(d5Var, AppProtocol.LogMessage.SEVERITY_INFO);
        super.onInitializeAccessibilityNodeInfo(view, d5Var);
        d5Var.b0(true);
    }
}
