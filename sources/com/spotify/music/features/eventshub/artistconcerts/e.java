package com.spotify.music.features.eventshub.artistconcerts;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.artist.uri.ArtistUri;
import com.spotify.music.features.eventshub.locationsearch.LocationSearchFragment;
import com.spotify.music.features.eventshub.model.ArtistConcertsModel;
import com.spotify.music.features.eventshub.model.ConcertResult;
import com.spotify.music.libs.common.presenter.f;
import io.reactivex.s;
import io.reactivex.y;

public class e extends f<ArtistConcertsModel> {
    private final d n;
    private final ifd o;
    private String p;

    public e(y yVar, s<ArtistConcertsModel> sVar, s<SessionState> sVar2, d dVar, ifd ifd) {
        super(yVar, sVar, sVar2);
        dVar.getClass();
        this.n = dVar;
        this.o = ifd;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Parcelable] */
    @Override // com.spotify.music.libs.common.presenter.f
    public void e(ArtistConcertsModel artistConcertsModel) {
        ArtistConcertsModel artistConcertsModel2 = artistConcertsModel;
        super.e(artistConcertsModel2);
        String format = String.format("spotify:artist:%s:concerts", new ArtistUri(artistConcertsModel2.getArtist().getUri()).a());
        this.p = format;
        this.n.b(format, this.o);
    }

    public void k() {
        this.h = null;
        String str = LocationSearchFragment.E0;
        ((g) b()).I(str);
        this.n.a(str);
    }

    public void l(int i, ConcertResult concertResult) {
        StringBuilder V0 = je.V0("spotify:concert:");
        V0.append(concertResult.getConcert().getId());
        String sb = V0.toString();
        Boolean nearUser = concertResult.getNearUser();
        nearUser.getClass();
        this.n.c(this.p, this.o, nearUser.booleanValue() ? "nearyou-listing" : "othervenues-listing", i, sb);
        Boolean nearUser2 = concertResult.getNearUser();
        nearUser2.getClass();
        if (nearUser2.booleanValue()) {
            this.n.d(this.p, i, sb);
        } else {
            this.n.e(this.p, i, sb);
        }
        ((g) b()).j(concertResult);
    }
}
