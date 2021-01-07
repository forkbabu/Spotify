package com.spotify.music.features.partneraccountlinking;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.x;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;

public class PartnerAccountLinkingActivity extends ss2 {
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        PartnerAccountLinkingFragment partnerAccountLinkingFragment = (PartnerAccountLinkingFragment) v0().U("partner_account_linking");
        if (partnerAccountLinkingFragment != null) {
            partnerAccountLinkingFragment.h0.a();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_account_linking);
        x i = v0().i();
        Intent intent = getIntent();
        PartnerAccountLinkingFragment partnerAccountLinkingFragment = new PartnerAccountLinkingFragment();
        Bundle bundle2 = new Bundle();
        if (intent.getData() != null) {
            bundle2.putString("data", intent.getDataString());
        }
        partnerAccountLinkingFragment.r4(bundle2);
        i.c(C0707R.id.fragment, partnerAccountLinkingFragment, "partner_account_linking");
        i.i();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.SSO_PARTNERACCOUNTLINKING, null);
    }
}
