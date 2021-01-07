package com.spotify.music.sociallistening.dialogs.impl;

import android.view.View;
import kotlin.f;
import kotlin.jvm.internal.h;

final class SocialListeningJoinConfirmationActivity$getSlateContentView$1 implements View.OnClickListener {
    final /* synthetic */ SocialListeningJoinConfirmationActivity a;

    SocialListeningJoinConfirmationActivity$getSlateContentView$1(SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity) {
        this.a = socialListeningJoinConfirmationActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity = this.a;
        x9d x9d = socialListeningJoinConfirmationActivity.M;
        if (x9d != null) {
            x9d.s(SocialListeningJoinConfirmationActivity.W0(socialListeningJoinConfirmationActivity));
            cfd cfd = this.a.L;
            if (cfd == null) {
                h.k("properties");
                throw null;
            } else if (!cfd.a() || SocialListeningJoinConfirmationActivity.V0(this.a)) {
                SocialListeningJoinConfirmationActivity.X0(this.a, false);
            } else {
                SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity2 = this.a;
                u7d u7d = socialListeningJoinConfirmationActivity2.K;
                if (u7d != null) {
                    u7d.b(SocialListeningJoinConfirmationActivity.U0(socialListeningJoinConfirmationActivity2), new cmf<f>(this) {
                        /* class com.spotify.music.sociallistening.dialogs.impl.SocialListeningJoinConfirmationActivity$getSlateContentView$1.AnonymousClass1 */
                        final /* synthetic */ SocialListeningJoinConfirmationActivity$getSlateContentView$1 this$0;

                        {
                            this.this$0 = r1;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // defpackage.cmf
                        public f invoke() {
                            SocialListeningJoinConfirmationActivity.X0(this.this$0.a, false);
                            return f.a;
                        }
                    }, new cmf<f>(this) {
                        /* class com.spotify.music.sociallistening.dialogs.impl.SocialListeningJoinConfirmationActivity$getSlateContentView$1.AnonymousClass2 */
                        final /* synthetic */ SocialListeningJoinConfirmationActivity$getSlateContentView$1 this$0;

                        {
                            this.this$0 = r1;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // defpackage.cmf
                        public f invoke() {
                            SocialListeningJoinConfirmationActivity.X0(this.this$0.a, true);
                            return f.a;
                        }
                    }, SocialListeningJoinConfirmationActivity.W0(this.a));
                } else {
                    h.k("socialListeningDialogs");
                    throw null;
                }
            }
        } else {
            h.k("logger");
            throw null;
        }
    }
}
