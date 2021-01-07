package com.spotify.music.features.pinpairing;

import android.os.Bundle;
import androidx.fragment.app.x;
import com.spotify.music.C0707R;

public class PinPairingActivity extends ss2 {
    public static final /* synthetic */ int G = 0;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        PinPairingFragment pinPairingFragment = (PinPairingFragment) v0().U("fragment");
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_pin_pairing);
        if (((PinPairingFragment) v0().U("fragment")) == null) {
            x i = v0().i();
            String stringExtra = getIntent().getStringExtra("url");
            int i2 = PinPairingFragment.B0;
            Bundle E = je.E("pairing-url", stringExtra);
            PinPairingFragment pinPairingFragment = new PinPairingFragment();
            pinPairingFragment.r4(E);
            i.c(C0707R.id.container_pin_pairing, pinPairingFragment, "fragment");
            i.i();
        }
    }
}
