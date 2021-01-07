package com.spotify.music.features.ads.cmp;

import android.os.Bundle;
import androidx.fragment.app.x;
import com.spotify.music.C0707R;

public class CMPActivity extends ss2 {
    public static final /* synthetic */ int G = 0;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        CMPWebFragment cMPWebFragment = (CMPWebFragment) v0().U("one_trust_fragment");
        if (cMPWebFragment == null || !cMPWebFragment.b()) {
            super.onBackPressed();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_one_trust);
        if (!(((CMPWebFragment) v0().U("one_trust_fragment")) != null)) {
            x i = v0().i();
            i.c(C0707R.id.one_trust_layout, new CMPWebFragment(), "one_trust_fragment");
            i.i();
        }
    }
}
