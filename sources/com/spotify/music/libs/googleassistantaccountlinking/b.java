package com.spotify.music.libs.googleassistantaccountlinking;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.libs.googleassistantaccountlinking.l;
import io.reactivex.functions.g;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.c;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class b implements g {
    private final c<l> a;
    private final sga b;

    static final class a<T> implements g<io.reactivex.disposables.b> {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(io.reactivex.disposables.b bVar) {
            this.a.sendBroadcast(new Intent("com.spotify.music.libs.googleassistantaccountlinking.ACTION_AUTH_FLOW"));
        }
    }

    /* renamed from: com.spotify.music.libs.googleassistantaccountlinking.b$b  reason: collision with other inner class name */
    static final class C0295b implements io.reactivex.functions.a {
        final /* synthetic */ b a;

        C0295b(b bVar) {
            this.a = bVar;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            this.a.b.b();
        }
    }

    public b(sga sga) {
        h.e(sga, "googleAssistantLinkStateProvider");
        this.b = sga;
        PublishSubject h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create()");
        this.a = h1;
    }

    @Override // com.spotify.music.libs.googleassistantaccountlinking.g
    public void a() {
        this.a.onNext(l.a.a);
    }

    @Override // com.spotify.music.libs.googleassistantaccountlinking.g
    public void b() {
        this.a.onNext(l.b.a);
    }

    @Override // com.spotify.music.libs.googleassistantaccountlinking.g
    public z<l> c(Context context) {
        h.e(context, "context");
        z<l> k = this.a.N0(1).B0().o(new a(context)).k(new C0295b(this));
        h.d(k, "subject.take(1)\n        …StateProvider.refresh() }");
        return k;
    }
}
