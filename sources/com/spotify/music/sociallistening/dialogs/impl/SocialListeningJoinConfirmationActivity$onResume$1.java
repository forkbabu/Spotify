package com.spotify.music.sociallistening.dialogs.impl;

import com.spotify.music.sociallistening.models.Session;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class SocialListeningJoinConfirmationActivity$onResume$1 extends FunctionReferenceImpl implements nmf<Session, f> {
    SocialListeningJoinConfirmationActivity$onResume$1(SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity) {
        super(1, socialListeningJoinConfirmationActivity, SocialListeningJoinConfirmationActivity.class, "showDialogWithSessionOwner", "showDialogWithSessionOwner(Lcom/spotify/music/sociallistening/models/Session;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Session session) {
        Session session2 = session;
        h.e(session2, "p1");
        SocialListeningJoinConfirmationActivity.a1((SocialListeningJoinConfirmationActivity) this.receiver, session2);
        return f.a;
    }
}
