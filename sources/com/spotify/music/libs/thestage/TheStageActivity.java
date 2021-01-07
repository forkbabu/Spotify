package com.spotify.music.libs.thestage;

import android.os.Bundle;
import androidx.fragment.app.x;
import com.spotify.music.C0707R;
import com.spotify.music.libs.thestage.config.c;

public class TheStageActivity extends ss2 {
    public static final /* synthetic */ int G = 0;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        TheStageFragment theStageFragment = (TheStageFragment) v0().U("the_stage_fragment");
        if (theStageFragment == null || !theStageFragment.b()) {
            super.onBackPressed();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_the_stage);
        if (!(((TheStageFragment) v0().U("the_stage_fragment")) != null)) {
            x i = v0().i();
            int i2 = TheStageFragment.A0;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("the_stage_view_config", (c) getIntent().getParcelableExtra("the-stage-config"));
            TheStageFragment theStageFragment = new TheStageFragment();
            theStageFragment.r4(bundle2);
            i.c(C0707R.id.the_stage_layout, theStageFragment, "the_stage_fragment");
            i.i();
        }
    }
}
