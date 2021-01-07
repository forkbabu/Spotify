package defpackage;

import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import com.spotify.playlist.endpoints.i;
import io.reactivex.z;

/* renamed from: acb  reason: default package */
public class acb implements UserMixDataSource {
    private final ccb a;
    private final i b;

    public acb(ccb ccb, i iVar) {
        this.a = ccb;
        this.b = iVar;
    }

    @Override // com.spotify.music.limitedofflineendpoints.api.UserMixDataSource
    public z<UserMixDataSource.TrackState> a(String str) {
        return this.a.a(str).d(this.b.d("spotify:playlist:37i9dQZF1EGfvr6Ga3L7Ne")).P(UserMixDataSource.TrackState.ADDED).E(new zbb(this));
    }

    @Override // com.spotify.music.limitedofflineendpoints.api.UserMixDataSource
    public z<UserMixDataSource.TrackState> b() {
        return this.a.b().d(this.b.d("spotify:playlist:37i9dQZF1EGfvr6Ga3L7Ne")).P(UserMixDataSource.TrackState.REMOVED).E(new zbb(this));
    }

    @Override // com.spotify.music.limitedofflineendpoints.api.UserMixDataSource
    public z<UserMixDataSource.TrackState> c(String str) {
        return this.a.c(str).d(this.b.d("spotify:playlist:37i9dQZF1EGfvr6Ga3L7Ne")).P(UserMixDataSource.TrackState.REMOVED).E(new zbb(this));
    }
}
