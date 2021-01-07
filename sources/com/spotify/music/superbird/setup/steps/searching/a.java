package com.spotify.music.superbird.setup.steps.searching;

import android.companion.CompanionDeviceManager;
import android.content.IntentSender;
import com.spotify.music.superbird.setup.domain.f;
import kotlin.jvm.internal.h;

public final class a extends CompanionDeviceManager.Callback {
    final /* synthetic */ SearchingFragment a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    a(SearchingFragment searchingFragment) {
        this.a = searchingFragment;
    }

    @Override // android.companion.CompanionDeviceManager.Callback
    public void onDeviceFound(IntentSender intentSender) {
        h.e(intentSender, "chooserLauncher");
        SearchingFragment.K4(this.a).h(new f.y(intentSender));
    }

    @Override // android.companion.CompanionDeviceManager.Callback
    public void onFailure(CharSequence charSequence) {
        SearchingFragment.K4(this.a).h(f.t.a);
    }
}
