package com.google.firebase.iid;

final /* synthetic */ class j implements Runnable {
    private final FirebaseInstanceId a;

    j(FirebaseInstanceId firebaseInstanceId) {
        this.a = firebaseInstanceId;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.v();
    }
}
