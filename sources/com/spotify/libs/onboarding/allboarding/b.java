package com.spotify.libs.onboarding.allboarding;

import androidx.lifecycle.e0;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import defpackage.b70;
import defpackage.ij9;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class b extends e0 {
    private final com.jakewharton.rxrelay2.b<ej9> c = com.jakewharton.rxrelay2.b.g1();
    private io.reactivex.disposables.b d;
    private final ij9.a e;

    static final class a implements ij9.a {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.ij9.a
        public final s<ej9> a() {
            return this.a.c;
        }
    }

    public b() {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        h.d(emptyDisposable, "Disposables.disposed()");
        this.d = emptyDisposable;
        this.e = new a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.e0
    public void e() {
        this.d.dispose();
    }

    public final void h(int i) {
        if (i != C0707R.id.initial_loading_fragment && i != C0707R.id.skipDialogFragment) {
            if (i == C0707R.id.pickerFragment) {
                com.jakewharton.rxrelay2.b<ej9> bVar = this.c;
                b70.a aVar = b70.a.c;
                bVar.accept(fj9.b(aVar.a().toString(), aVar.b().toString()));
            } else if (i == C0707R.id.searchFragment) {
                com.jakewharton.rxrelay2.b<ej9> bVar2 = this.c;
                b70.b bVar3 = b70.b.c;
                bVar2.accept(fj9.b(bVar3.a().toString(), bVar3.b().toString()));
            } else if (i == C0707R.id.ShowLoadingFragment) {
                com.jakewharton.rxrelay2.b<ej9> bVar4 = this.c;
                b70.c cVar = b70.c.c;
                bVar4.accept(fj9.b(cVar.a().toString(), cVar.b().toString()));
            } else {
                this.c.accept(fj9.b(PageIdentifiers.UNKNOWN.path(), null));
            }
        }
    }

    public final ij9.a i() {
        return this.e;
    }
}
