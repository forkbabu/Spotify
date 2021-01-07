package com.spotify.mobile.android.storytelling.common;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

public final class h {
    private final PublishSubject<ox1> a;

    public static final class a implements ix1 {
        final /* synthetic */ h a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(h hVar) {
            this.a = hVar;
        }

        @Override // defpackage.ix1
        public void a(ox1 ox1) {
            kotlin.jvm.internal.h.e(ox1, "userRequest");
            this.a.a.onNext(ox1);
        }
    }

    public h() {
        PublishSubject<ox1> h1 = PublishSubject.h1();
        kotlin.jvm.internal.h.d(h1, "PublishSubject.create<UserRequest>()");
        this.a = h1;
    }

    public final ix1 b() {
        return new a(this);
    }

    public final s<ox1> c() {
        return this.a;
    }
}
