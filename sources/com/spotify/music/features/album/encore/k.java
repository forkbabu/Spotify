package com.spotify.music.features.album.encore;

import android.content.Context;
import android.view.View;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class k extends z3 {
    final /* synthetic */ boolean a;

    k(boolean z) {
        this.a = z;
    }

    @Override // defpackage.z3
    public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
        h.e(view, "host");
        h.e(d5Var, AppProtocol.LogMessage.SEVERITY_INFO);
        super.onInitializeAccessibilityNodeInfo(view, d5Var);
        Context context = view.getContext();
        h.d(context, "host.context");
        String string = context.getApplicationContext().getString(C0707R.string.entity_page_accessibility_currently_playing);
        h.d(string, "host.context.application…bility_currently_playing)");
        if (!this.a) {
            string = "";
        }
        d5Var.V(string);
    }
}
