package com.google.firebase.messaging;

import com.google.android.gms.tasks.e;

final /* synthetic */ class h implements e {
    private final FirebaseMessaging a;

    h(FirebaseMessaging firebaseMessaging) {
        this.a = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.e
    public final void onSuccess(Object obj) {
        this.a.a((w) obj);
    }
}
