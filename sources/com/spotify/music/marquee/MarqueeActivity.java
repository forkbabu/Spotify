package com.spotify.music.marquee;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.music.C0707R;
import com.spotify.music.marquee.feedback.h;
import com.spotify.music.marquee.overlay.MarqueeOverlayFragment;
import java.util.ArrayList;

public class MarqueeActivity extends ss2 implements i {
    public static final /* synthetic */ int I = 0;
    j G;
    cj9 H = new cj9(this);

    public ArrayList<h> U0() {
        return (getIntent() == null || !getIntent().hasExtra("extra_marquee_randomized_feedback_list")) ? new ArrayList<>(0) : getIntent().getParcelableArrayListExtra("extra_marquee_randomized_feedback_list");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment T = v0().T(C0707R.id.marquee_fragment_container);
        if (!(T instanceof ws2) || !((ws2) T).b()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_marquee);
        if (v0().T(C0707R.id.marquee_fragment_container) == null) {
            c b = d.b(this);
            MarqueeOverlayFragment marqueeOverlayFragment = new MarqueeOverlayFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("key_marquee", (hjb) getIntent().getParcelableExtra("extra_marquee"));
            marqueeOverlayFragment.r4(bundle2);
            d.a(marqueeOverlayFragment, b);
            x i = v0().i();
            i.q(C0707R.id.marquee_fragment_container, marqueeOverlayFragment, null);
            i.i();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.G.a();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.G.b();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.c(this.H);
    }

    @Override // androidx.fragment.app.c
    public void x0(Fragment fragment) {
        this.H.e(fragment);
    }
}
