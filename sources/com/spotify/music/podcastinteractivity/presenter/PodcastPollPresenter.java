package com.spotify.music.podcastinteractivity.presenter;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.google.common.collect.Collections2;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.podcastinteractivity.di.PollContainerPageIdProvider;
import com.spotify.music.podcastinteractivity.proto.ClientPollResponse;
import com.spotify.music.podcastinteractivity.proto.ClientPollsForEntityResponse;
import com.spotify.music.podcastinteractivity.proto.Poll;
import com.spotify.music.podcastinteractivity.proto.PollOption;
import com.spotify.music.podcastinteractivity.proto.PollStatus;
import com.spotify.music.podcastinteractivity.proto.PollType;
import com.spotify.music.podcastinteractivity.proto.PollVoteRequest;
import com.spotify.rxjava2.q;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.List;

public class PodcastPollPresenter implements m {
    private final stc a;
    private final y b;
    private final PollContainerPageIdProvider.ContainerPageId c;
    private final ajf<ltc> f;
    private final q n = new q();
    private dwc o;
    private int p;

    public PodcastPollPresenter(stc stc, y yVar, n nVar, PollContainerPageIdProvider.ContainerPageId containerPageId, ajf<ltc> ajf) {
        this.a = stc;
        this.b = yVar;
        this.c = containerPageId;
        this.f = ajf;
        nVar.A().a(this);
    }

    public static void b(PodcastPollPresenter podcastPollPresenter, Throwable th) {
        ((bwc) podcastPollPresenter.o).m();
        ((bwc) podcastPollPresenter.o).h(false);
        Logger.d("Podcast Poll ERROR %s", th.getMessage());
    }

    public static void d(PodcastPollPresenter podcastPollPresenter, ClientPollsForEntityResponse clientPollsForEntityResponse) {
        podcastPollPresenter.getClass();
        if (clientPollsForEntityResponse.i() > 0) {
            podcastPollPresenter.j(clientPollsForEntityResponse.h(0));
        }
    }

    private void j(ClientPollResponse clientPollResponse) {
        PollType pollType = PollType.SINGLE_CHOICE;
        if (clientPollResponse.l()) {
            Poll h = clientPollResponse.h();
            this.p = h.l();
            List<Integer> i = clientPollResponse.i();
            List<PollOption> m = h.m();
            ArrayList arrayList = new ArrayList();
            for (Integer num : i) {
                for (PollOption pollOption : m) {
                    if (num.intValue() == pollOption.i()) {
                        arrayList.add(pollOption);
                    }
                }
            }
            boolean z = false;
            int i2 = 0;
            for (PollOption pollOption2 : h.m()) {
                i2 += pollOption2.m();
            }
            ((bwc) this.o).i(h, i2);
            if (!arrayList.isEmpty() || h.o() != PollStatus.LIVE) {
                ((bwc) this.o).k(h, arrayList, i2);
                ltc ltc = this.f.get();
                int l = h.l();
                if (h.p() == pollType) {
                    z = true;
                }
                ltc.b(l, z);
                return;
            }
            ((bwc) this.o).j(h);
            ltc ltc2 = this.f.get();
            int l2 = h.l();
            if (h.p() == pollType) {
                z = true;
            }
            ltc2.a(l2, z);
            return;
        }
        ((bwc) this.o).d();
    }

    private void m(int i, List<PollOption> list) {
        ((bwc) this.o).h(true);
        PollVoteRequest.b l = PollVoteRequest.l();
        l.m(list);
        l.n(i);
        this.n.a(this.a.a((PollVoteRequest) l.build()).B(this.b).subscribe(new b(this), new c(this)));
    }

    public void a() {
        if (this.c == PollContainerPageIdProvider.ContainerPageId.EPISODE_PAGE) {
            ((bwc) this.o).l();
        }
    }

    public /* synthetic */ void c(Throwable th) {
        ((bwc) this.o).d();
    }

    public /* synthetic */ void e(ClientPollResponse clientPollResponse) {
        ((bwc) this.o).h(false);
        j(clientPollResponse);
    }

    public void f(String str) {
        this.n.a(this.a.b(str).B(this.b).subscribe(new d(this), new a(this)));
    }

    public void g(int i, List<PollOption> list) {
        this.f.get().d(i);
        m(i, list);
    }

    public void h(int i, PollOption pollOption, int i2) {
        this.f.get().c(i, pollOption, i2);
    }

    public void i() {
        this.f.get().e(this.p);
    }

    public void k(dwc dwc) {
        this.o = dwc;
    }

    public void l(int i, PollOption pollOption, int i2) {
        this.f.get().f(i, pollOption, i2);
        m(i, Collections2.newArrayList(pollOption));
    }

    @w(Lifecycle.Event.ON_STOP)
    public void stop() {
        this.n.c();
    }
}
