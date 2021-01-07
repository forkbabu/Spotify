package com.spotify.music.podcastinteractivity.qna.presenter;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replyrow.ReplyRowQnA;
import com.spotify.music.podcastinteractivity.qna.datasource.i;
import com.spotify.music.podcastinteractivity.qna.datasource.j;
import com.spotify.podcastinteractivity.qna.model.proto.Prompt;
import com.spotify.podcastinteractivity.qna.model.proto.QAndA;
import com.spotify.podcastinteractivity.qna.model.proto.Response;
import com.spotify.podcastinteractivity.qna.model.proto.Responses;
import com.spotify.rxjava2.q;
import defpackage.auc;
import io.reactivex.functions.g;
import io.reactivex.y;
import java.util.List;
import kotlin.jvm.internal.h;

public final class PodcastQnAPresenter implements m {
    private final q a = new q();
    private vtc b;
    private final y c;
    private final com.spotify.music.podcastinteractivity.qna.datasource.b f;
    private final hvc n;
    private final j o;

    static final class a<T> implements g<ztc> {
        final /* synthetic */ PodcastQnAPresenter a;

        a(PodcastQnAPresenter podcastQnAPresenter) {
            this.a = podcastQnAPresenter;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(ztc ztc) {
            auc e = ztc.e();
            if (h.a(e, auc.d.a) || h.a(e, auc.a.a) || h.a(e, auc.b.a)) {
                vtc c = this.a.c();
                if (c != null) {
                    c.w(false);
                }
            } else if (e instanceof auc.c) {
                PodcastQnAPresenter.b(this.a, ((auc.c) e).a());
            }
        }
    }

    static final class b<T> implements g<i> {
        final /* synthetic */ PodcastQnAPresenter a;

        b(PodcastQnAPresenter podcastQnAPresenter) {
            this.a = podcastQnAPresenter;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(i iVar) {
            vtc c;
            i iVar2 = iVar;
            if (iVar2 instanceof i.a) {
                vtc c2 = this.a.c();
                if (c2 != null) {
                    c2.A(((i.a) iVar2).a());
                }
            } else if (!(iVar2 instanceof i.b)) {
                if (h.a(iVar2, i.h.a)) {
                    vtc c3 = this.a.c();
                    if (c3 != null) {
                        c3.B();
                    }
                } else if (h.a(iVar2, i.g.a)) {
                    vtc c4 = this.a.c();
                    if (c4 != null) {
                        c4.C();
                    }
                } else if (h.a(iVar2, i.d.a) || h.a(iVar2, i.c.a)) {
                } else {
                    if (h.a(iVar2, i.f.a)) {
                        vtc c5 = this.a.c();
                        if (c5 != null) {
                            c5.D();
                        }
                    } else if (h.a(iVar2, i.e.a) && (c = this.a.c()) != null) {
                        c.y();
                    }
                }
            }
        }
    }

    public PodcastQnAPresenter(y yVar, com.spotify.music.podcastinteractivity.qna.datasource.b bVar, hvc hvc, j jVar, n nVar) {
        h.e(yVar, "mainScheduler");
        h.e(bVar, "podcastQnADataSource");
        h.e(hvc, "replyRowQnAMapper");
        h.e(jVar, "qnAEventConsumer");
        h.e(nVar, "owner");
        this.c = yVar;
        this.f = bVar;
        this.n = hvc;
        this.o = jVar;
        nVar.A().a(this);
    }

    public static final void b(PodcastQnAPresenter podcastQnAPresenter, QAndA qAndA) {
        podcastQnAPresenter.n.getClass();
        h.e(qAndA, "qna");
        int n2 = qAndA.n();
        boolean s = qAndA.s();
        Response o2 = qAndA.o();
        h.d(o2, "userResponse");
        ReplyRowQnA.Model model = new ReplyRowQnA.Model(n2, s, o2.i());
        if (qAndA.q()) {
            vtc vtc = podcastQnAPresenter.b;
            if (vtc != null) {
                Prompt i = qAndA.i();
                h.d(i, "qna.prompt");
                vtc.v(i);
                vtc.x(model);
                Responses l = qAndA.l();
                h.d(l, "qna.responses");
                List<Response> i2 = l.i();
                h.d(i2, "qna.responses.responsesList");
                vtc.z(i2);
                vtc.w(true);
                return;
            }
            return;
        }
        vtc vtc2 = podcastQnAPresenter.b;
        if (vtc2 != null) {
            vtc2.w(false);
        }
    }

    public final void a() {
        this.f.c();
    }

    public final vtc c() {
        return this.b;
    }

    public final void d(String str) {
        h.e(str, "episodeUri");
        this.f.b(str);
    }

    public final void e() {
        this.f.e();
    }

    public final void f(vtc vtc) {
        this.b = vtc;
    }

    @w(Lifecycle.Event.ON_START)
    public final void start() {
        this.a.a(this.f.f().o0(this.c).subscribe(new a(this)));
        this.a.a(this.o.b().o0(this.c).subscribe(new b(this)));
    }

    @w(Lifecycle.Event.ON_STOP)
    public final void stop() {
        this.a.c();
    }
}
