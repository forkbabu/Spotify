package com.spotify.music.features.login.startview.blueprint;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButtonConfiguration;
import com.spotify.libs.pse.model.a;
import com.spotify.libs.pse.model.e;
import com.spotify.loginflow.navigation.d;
import com.spotify.loginflow.w;
import com.spotify.music.C0707R;
import defpackage.ce0;
import defpackage.je0;
import kotlin.jvm.internal.h;

public final class BlueprintActionsFragment extends Fragment implements w {
    public static final /* synthetic */ int n0 = 0;
    public d g0;
    public ComponentFactory<AuthenticationButton, AuthenticationButtonConfiguration> h0;
    public ae0 i0;
    public e j0;
    public a k0;
    public b l0;
    public zy0 m0;

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        ae0 ae0 = this.i0;
        if (ae0 != null) {
            ae0.a(new ce0.k(je0.b.b));
        } else {
            h.k("authTracker");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b7  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Q3(android.view.View r10, android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 457
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.login.startview.blueprint.BlueprintActionsFragment.Q3(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        return layoutInflater.inflate(C0707R.layout.cta_actions_fragment, viewGroup, false);
    }
}
