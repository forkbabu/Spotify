package com.spotify.music.superbird.setup.steps.searching;

import android.companion.CompanionDeviceManager;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class SearchingFragment$deviceManager$2 extends Lambda implements cmf<CompanionDeviceManager> {
    final /* synthetic */ SearchingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchingFragment$deviceManager$2(SearchingFragment searchingFragment) {
        super(0);
        this.this$0 = searchingFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public CompanionDeviceManager invoke() {
        return (CompanionDeviceManager) this.this$0.l4().getSystemService(CompanionDeviceManager.class);
    }
}
