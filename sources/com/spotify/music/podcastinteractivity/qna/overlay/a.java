package com.spotify.music.podcastinteractivity.qna.overlay;

import com.spotify.music.podcastinteractivity.qna.datasource.i;
import com.spotify.music.podcastinteractivity.qna.datasource.j;
import com.spotify.podcastinteractivity.qna.model.proto.Prompt;
import com.spotify.podcastinteractivity.qna.model.proto.QAndA;
import com.spotify.podcastinteractivity.qna.model.proto.Response;
import com.spotify.podcastinteractivity.qna.model.proto.ShowMetadata;
import com.spotify.rxjava2.q;
import defpackage.auc;
import io.reactivex.functions.g;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class a {
    private final q a = new q();
    private b b;
    private final y c;
    private final com.spotify.music.podcastinteractivity.qna.datasource.b d;
    private final j e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.podcastinteractivity.qna.overlay.a$a  reason: collision with other inner class name */
    public static final class C0336a<T> implements g<ztc> {
        final /* synthetic */ a a;

        C0336a(a aVar) {
            this.a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(ztc ztc) {
            ztc ztc2 = ztc;
            auc e = ztc2.e();
            if (!h.a(e, auc.d.a)) {
                if (h.a(e, auc.a.a)) {
                    b c = this.a.c();
                    if (c != null) {
                        c.C1();
                    }
                } else if (h.a(e, auc.b.a)) {
                    b c2 = this.a.c();
                    if (c2 != null) {
                        c2.C1();
                    }
                } else if (e instanceof auc.c) {
                    h.d(ztc2, "podcastQnAModel");
                    a.a(this.a, (auc.c) e, ztc2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements g<i> {
        final /* synthetic */ a a;

        b(a aVar) {
            this.a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(i iVar) {
            b c;
            i iVar2 = iVar;
            if ((iVar2 instanceof i.a) || (iVar2 instanceof i.f)) {
                return;
            }
            if (h.a(iVar2, i.h.a) || h.a(iVar2, i.e.a) || h.a(iVar2, i.g.a)) {
                b c2 = this.a.c();
                if (c2 != null) {
                    c2.C1();
                }
            } else if (iVar2 instanceof i.b) {
                b c3 = this.a.c();
                if (c3 != null) {
                    c3.v1(((i.b) iVar2).a());
                }
            } else if (h.a(iVar2, i.d.a)) {
                b c4 = this.a.c();
                if (c4 != null) {
                    c4.a2();
                }
            } else if (h.a(iVar2, i.c.a) && (c = this.a.c()) != null) {
                c.F1();
            }
        }
    }

    public a(y yVar, com.spotify.music.podcastinteractivity.qna.datasource.b bVar, j jVar) {
        h.e(yVar, "mainScheduler");
        h.e(bVar, "podcastQnADataSource");
        h.e(jVar, "qnAEventConsumer");
        this.c = yVar;
        this.d = bVar;
        this.e = jVar;
    }

    public static final void a(a aVar, auc.c cVar, ztc ztc) {
        b bVar;
        b bVar2;
        b bVar3;
        aVar.getClass();
        QAndA a2 = cVar.a();
        if (a2.q() && (bVar3 = aVar.b) != null) {
            Prompt i = a2.i();
            h.d(i, "qna.prompt");
            bVar3.v(i);
        }
        if (a2.r() && (bVar2 = aVar.b) != null) {
            ShowMetadata m = a2.m();
            h.d(m, "qna.showMetadata");
            bVar2.S1(m);
        }
        if (!a2.s()) {
            b bVar4 = aVar.b;
            if (bVar4 != null) {
                String c2 = ztc.c();
                if (c2 == null) {
                    c2 = "";
                }
                bVar4.o0(c2);
            }
        } else {
            b bVar5 = aVar.b;
            if (bVar5 != null) {
                Response o = a2.o();
                h.d(o, "qna.userResponse");
                bVar5.M1(o);
            }
        }
        if (ztc.b() != null && (bVar = aVar.b) != null) {
            bVar.t1(ztc.b());
        }
    }

    public final void b() {
        this.d.h();
    }

    public final b c() {
        return this.b;
    }

    public final void d() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.C1();
        }
    }

    public final void e(String str) {
        h.e(str, "currentDraft");
        this.d.d(str);
    }

    public final void f(b bVar) {
        this.b = bVar;
    }

    public final void g(String str) {
        h.e(str, "episodeUri");
        this.a.a(this.d.f().o0(this.c).subscribe(new C0336a(this)));
        this.a.a(this.e.b().o0(this.c).subscribe(new b(this)));
        this.d.b(str);
    }

    public final void h() {
        this.a.c();
    }

    public final void i(String str) {
        h.e(str, "replyToSend");
        this.d.g(str);
    }
}
