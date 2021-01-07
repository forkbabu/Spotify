package com.spotify.libs.onboarding.allboarding.search;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import com.spotify.allboarding.model.v1.proto.SearchItem;
import com.spotify.allboarding.model.v1.proto.SearchResponse;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;
import java.util.List;
import kotlin.jvm.internal.h;

public final class e extends e0 {
    private io.reactivex.disposables.b c;
    private final u<f> d = new u<>(new f(null, null, false, 7));
    private final iw0 e;
    private final String f;
    private final String g;

    /* access modifiers changed from: package-private */
    public static final class a<T> implements g<SearchResponse> {
        final /* synthetic */ e a;
        final /* synthetic */ String b;

        a(e eVar, String str) {
            this.a = eVar;
            this.b = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: androidx.lifecycle.u */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.g
        public void accept(SearchResponse searchResponse) {
            f fVar;
            SearchResponse searchResponse2 = searchResponse;
            u uVar = this.a.d;
            if (((f) this.a.d.e()) != null) {
                String str = this.b;
                h.d(searchResponse2, "it");
                List<SearchItem> h = searchResponse2.h();
                h.d(h, "it.itemsList");
                h.e(str, "query");
                h.e(h, "searchResults");
                fVar = new f(str, h, false);
            } else {
                fVar = null;
            }
            uVar.n(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements g<Throwable> {
        final /* synthetic */ e a;

        b(e eVar) {
            this.a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: androidx.lifecycle.u */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Assertion.w("Unable to search for artists", th);
            u uVar = this.a.d;
            f fVar = (f) this.a.d.e();
            f fVar2 = null;
            if (fVar != null) {
                fVar2 = f.a(fVar, null, null, true, 3);
            }
            uVar.n(fVar2);
        }
    }

    public e(iw0 iw0, String str, String str2) {
        h.e(iw0, "allboardingProvider");
        h.e(str, "searchUrl");
        h.e(str2, "onboardingSessionId");
        this.e = iw0;
        this.f = str;
        this.g = str2;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.e0
    public void e() {
        io.reactivex.disposables.b bVar = this.c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public final void h(String str) {
        h.e(str, "query");
        io.reactivex.disposables.b bVar = this.c;
        if (bVar != null) {
            bVar.dispose();
        }
        u<f> uVar = this.d;
        f e2 = uVar.e();
        f fVar = null;
        if (e2 != null) {
            fVar = f.a(e2, str, null, false, 2);
        }
        uVar.n(fVar);
        if (!kotlin.text.e.n(str) && str.length() <= 500) {
            this.c = ((kw0) this.e).v(this.f, str, this.g).H(io.reactivex.schedulers.a.c()).B(io.reactivex.android.schedulers.a.b()).subscribe(new a(this, str), new b(this));
        }
    }

    public final LiveData<f> i() {
        return this.d;
    }

    public final void j() {
        f e2 = this.d.e();
        if (e2 != null) {
            h(e2.c());
        }
    }
}
