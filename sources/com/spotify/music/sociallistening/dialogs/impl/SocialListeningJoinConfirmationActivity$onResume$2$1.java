package com.spotify.music.sociallistening.dialogs.impl;

import com.spotify.music.sociallistening.dialogs.impl.SocialListeningJoinConfirmationActivity;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class SocialListeningJoinConfirmationActivity$onResume$2$1 extends Lambda implements cmf<f> {
    final /* synthetic */ SocialListeningJoinConfirmationActivity.d this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SocialListeningJoinConfirmationActivity$onResume$2$1(SocialListeningJoinConfirmationActivity.d dVar) {
        super(0);
        this.this$0 = dVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity = this.this$0.a;
        int i = SocialListeningJoinConfirmationActivity.T;
        socialListeningJoinConfirmationActivity.finish();
        return f.a;
    }
}
