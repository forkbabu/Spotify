package com.spotify.music.features.eventshub.concertentity;

import android.net.Uri;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.features.eventshub.model.Concert;
import com.spotify.music.features.eventshub.model.ConcertEntityModel;
import com.spotify.music.features.eventshub.model.ConcertResult;
import com.spotify.music.libs.common.presenter.f;
import io.reactivex.s;
import io.reactivex.y;

public class h extends f<ConcertEntityModel> {
    private final g n;
    private final d15 o;

    public h(y yVar, s<ConcertEntityModel> sVar, s<SessionState> sVar2, g gVar, d15 d15) {
        super(yVar, sVar, sVar2);
        this.n = gVar;
        this.o = d15;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Parcelable] */
    @Override // com.spotify.music.libs.common.presenter.f
    public void e(ConcertEntityModel concertEntityModel) {
        ConcertEntityModel concertEntityModel2 = concertEntityModel;
        super.e(concertEntityModel2);
        g gVar = this.n;
        StringBuilder V0 = je.V0("spotify:concert:");
        V0.append(concertEntityModel2.getConcertResult().getConcert().getId());
        gVar.g(V0.toString());
        this.n.b();
    }

    public String k(ConcertEntityModel concertEntityModel) {
        Concert concert = concertEntityModel.getConcertResult().getConcert();
        if (concert.isFestival()) {
            return concert.getTitle();
        }
        return this.o.a(concert);
    }

    public k l() {
        return (k) b();
    }

    public void m() {
        this.n.d();
        l().E0();
    }

    public void n() {
        Uri uri;
        ConcertEntityModel concertEntityModel = (ConcertEntityModel) a();
        if (concertEntityModel != null) {
            uri = Uri.parse(concertEntityModel.getConcertResult().getClickThroughUrl());
        } else {
            uri = Uri.EMPTY;
        }
        this.n.e(String.valueOf(uri));
        l().D(uri);
    }

    public void o(Integer num, ConcertResult concertResult) {
        g gVar = this.n;
        String upcomingConcertsSource = ((ConcertEntityModel) a()).getUpcomingConcertsSource();
        upcomingConcertsSource.getClass();
        String id = concertResult.getConcert().getId();
        id.getClass();
        gVar.f(upcomingConcertsSource, num, id);
        l().j(concertResult);
    }
}
