package com.spotify.music.sociallistening.dialogs.impl;

import kotlin.f;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class SocialListeningJoinConfirmationActivity$showDialogWithSessionOwner$1 extends Lambda implements cmf<f> {
    final /* synthetic */ SocialListeningJoinConfirmationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SocialListeningJoinConfirmationActivity$showDialogWithSessionOwner$1(SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity) {
        super(0);
        this.this$0 = socialListeningJoinConfirmationActivity;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity = this.this$0;
        int i = SocialListeningJoinConfirmationActivity.T;
        socialListeningJoinConfirmationActivity.finish();
        return f.a;
    }
}
