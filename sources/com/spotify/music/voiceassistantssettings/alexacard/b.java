package com.spotify.music.voiceassistantssettings.alexacard;

import com.spotify.music.voiceassistantssettings.alexacard.c;
import com.spotify.rxjava2.q;
import io.reactivex.d0;
import io.reactivex.e;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.y;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class b implements c.a {
    private c a;
    private final q b = new q();
    private final y c;
    private final de2 d;
    private final se2 e;
    private final oe2 f;
    private final com.spotify.music.alexaaccountlinking.errors.a g;

    static final class a<T, R> implements l<ee2, d0<? extends Pair<? extends String, ? extends String>>> {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends Pair<? extends String, ? extends String>> apply(ee2 ee2) {
            ee2 ee22 = ee2;
            h.e(ee22, "alexaAuthorizationResult");
            return ((ve2) this.a.e).c().A(new a(ee22));
        }
    }

    /* renamed from: com.spotify.music.voiceassistantssettings.alexacard.b$b  reason: collision with other inner class name */
    static final class C0353b<T, R> implements l<Pair<? extends String, ? extends String>, e> {
        final /* synthetic */ b a;

        C0353b(b bVar) {
            this.a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public e apply(Pair<? extends String, ? extends String> pair) {
            Pair<? extends String, ? extends String> pair2 = pair;
            h.e(pair2, "<name for destructuring parameter 0>");
            return this.a.f.a((String) pair2.a(), (String) pair2.b());
        }
    }

    static final class c implements io.reactivex.functions.a {
        final /* synthetic */ b a;

        c(b bVar) {
            this.a = bVar;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            c cVar = this.a.a;
            if (cVar != null) {
                cVar.setLinkState(LinkState.LINKED);
            }
        }
    }

    static final class d<T> implements g<Throwable> {
        final /* synthetic */ b a;

        d(b bVar) {
            this.a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            this.a.g();
        }
    }

    public b(y yVar, de2 de2, se2 se2, oe2 oe2, com.spotify.music.alexaaccountlinking.errors.a aVar) {
        h.e(yVar, "mainScheduler");
        h.e(de2, "alexaAccountAuthorizer");
        h.e(se2, "spotifyAccountAuthorizer");
        h.e(oe2, "alexaAccountLinkingRepository");
        h.e(aVar, "errorBanner");
        this.c = yVar;
        this.d = de2;
        this.e = se2;
        this.f = oe2;
        this.g = aVar;
    }

    @Override // com.spotify.music.voiceassistantssettings.alexacard.c.a
    public void a() {
    }

    @Override // com.spotify.music.voiceassistantssettings.alexacard.c.a
    public void b() {
        this.b.a(this.d.a().s(new a(this)).t(new C0353b(this)).A(this.c).subscribe(new c(this), new d(this)));
    }

    public final void f() {
        this.b.c();
    }

    public final void g() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.o(this.g);
        }
        c cVar2 = this.a;
        if (cVar2 != null) {
            cVar2.setLinkState(LinkState.UNLINKED);
        }
    }

    public final void h(c cVar) {
        h.e(cVar, "viewBinder");
        this.a = cVar;
        cVar.setListener(this);
    }

    public final void i() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.setListener(null);
        }
    }
}
