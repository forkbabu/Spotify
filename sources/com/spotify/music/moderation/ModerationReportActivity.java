package com.spotify.music.moderation;

import android.os.Bundle;
import androidx.fragment.app.x;
import com.spotify.music.C0707R;

public class ModerationReportActivity extends ss2 {
    public static final /* synthetic */ int G = 0;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ModerationReportFragment moderationReportFragment = (ModerationReportFragment) v0().U("moderation_fragment");
        if (moderationReportFragment != null) {
            moderationReportFragment.b();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_moderation);
        if (!(v0().U("moderation_fragment") != null)) {
            x i = v0().i();
            int i2 = ModerationReportFragment.A0;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("moderation_view_config", (yjb) getIntent().getParcelableExtra("moderation-view-config"));
            ModerationReportFragment moderationReportFragment = new ModerationReportFragment();
            moderationReportFragment.r4(bundle2);
            i.c(C0707R.id.activity_moderation_layout, moderationReportFragment, "moderation_fragment");
            i.i();
        }
    }
}
