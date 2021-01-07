package com.spotify.music.features.playlistentity.premiumminidownloaded.toolbar;

import kotlin.f;

final class PremiumMiniRemoveAllSongsItem$bind$1 implements Runnable {
    final /* synthetic */ PremiumMiniRemoveAllSongsItem a;

    PremiumMiniRemoveAllSongsItem$bind$1(PremiumMiniRemoveAllSongsItem premiumMiniRemoveAllSongsItem) {
        this.a = premiumMiniRemoveAllSongsItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PremiumMiniRemoveAllSongsItem.c(this.a).a(new cmf<f>(this) {
            /* class com.spotify.music.features.playlistentity.premiumminidownloaded.toolbar.PremiumMiniRemoveAllSongsItem$bind$1.AnonymousClass1 */
            final /* synthetic */ PremiumMiniRemoveAllSongsItem$bind$1 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // defpackage.cmf
            public f invoke() {
                PremiumMiniRemoveAllSongsItem.e(this.this$0.a).b(PremiumMiniRemoveAllSongsItem.d(this.this$0.a).b());
                return f.a;
            }
        });
    }
}
