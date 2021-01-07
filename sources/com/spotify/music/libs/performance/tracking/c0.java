package com.spotify.music.libs.performance.tracking;

import com.spotify.libs.instrumentation.performance.r;
import com.spotify.messages.ViewLoadSequence;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.y;

public class c0 extends r {
    private final PublishSubject<ViewLoadSequence> d = PublishSubject.h1();
    private final y e;
    private b f = EmptyDisposable.INSTANCE;

    public c0(y yVar) {
        this.e = yVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.libs.instrumentation.performance.r
    public void b(ViewLoadSequence viewLoadSequence) {
        this.d.onNext(viewLoadSequence);
    }

    @Override // com.spotify.libs.instrumentation.performance.r
    public synchronized void f() {
        if (!this.f.d()) {
            this.f.dispose();
        }
        this.f = this.d.o0(this.e).subscribe(new d(this), e.a);
        super.f();
    }

    @Override // com.spotify.libs.instrumentation.performance.r
    public synchronized void g() {
        if (!this.f.d()) {
            this.f.dispose();
        }
        super.g();
    }
}
