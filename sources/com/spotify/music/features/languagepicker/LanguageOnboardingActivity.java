package com.spotify.music.features.languagepicker;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import com.spotify.music.C0707R;
import com.spotify.music.features.languagepicker.view.LanguagePickerFragment;
import com.spotify.music.sociallistening.participantlist.impl.m;

public class LanguageOnboardingActivity extends ss2 {
    public static final /* synthetic */ int H = 0;
    private final cj9 G = new cj9(this);

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment T = v0().T(C0707R.id.container);
        if (!(T instanceof ws2) || !((ws2) T).b()) {
            super.onBackPressed();
        }
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_language_onboarding);
        LanguagePickerFragment languagePickerFragment = new LanguagePickerFragment();
        x i = v0().i();
        m.d(languagePickerFragment, bu9.p);
        i.b(C0707R.id.container, languagePickerFragment);
        i.i();
        this.G.e(languagePickerFragment);
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.c(this.G);
    }
}
