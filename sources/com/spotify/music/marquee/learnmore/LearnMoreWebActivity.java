package com.spotify.music.marquee.learnmore;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import com.spotify.music.C0707R;

public class LearnMoreWebActivity extends ss2 {
    public static final /* synthetic */ int H = 0;
    cj9 G = new cj9(this);

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, C0707R.anim.marquee_learn_more_exit);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LearnMoreWebFragment learnMoreWebFragment = (LearnMoreWebFragment) v0().T(C0707R.id.learn_more_fragment_container);
        if (learnMoreWebFragment == null || !learnMoreWebFragment.b()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z = false;
        overridePendingTransition(C0707R.anim.marquee_learn_more_enter, 0);
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_learn_more);
        if (v0().T(C0707R.id.learn_more_fragment_container) != null) {
            z = true;
        }
        if (!z) {
            LearnMoreWebFragment learnMoreWebFragment = new LearnMoreWebFragment();
            x i = v0().i();
            i.b(C0707R.id.learn_more_fragment_container, learnMoreWebFragment);
            i.i();
        }
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.c(this.G);
    }

    @Override // androidx.fragment.app.c
    public void x0(Fragment fragment) {
        this.G.e(fragment);
    }
}
