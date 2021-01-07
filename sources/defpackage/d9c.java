package defpackage;

import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import com.spotify.music.offlinetrials.limited.uicomponents.w;
import com.spotify.playlist.models.offline.a;
import io.reactivex.disposables.b;
import io.reactivex.f;
import io.reactivex.y;

/* renamed from: d9c  reason: default package */
public class d9c {
    private final UserMixDataSource a;
    private final y b;
    private b c;
    private final w d;

    d9c(UserMixDataSource userMixDataSource, y yVar, w wVar) {
        this.a = userMixDataSource;
        this.b = yVar;
        this.d = wVar;
    }

    public void a(String str, f fVar, UserMixDataSource.TrackState trackState) {
        Object obj;
        this.d.b(trackState, new x8c(this, str, fVar));
        if (fVar != null) {
            if (trackState.ordinal() != 0) {
                obj = a.f.a;
            } else {
                obj = a.C0377a.a;
            }
            fVar.onNext(obj);
        }
    }

    public void b(String str, f fVar, UserMixDataSource.TrackState trackState) {
        Object obj;
        this.d.b(trackState, new y8c(this, str, fVar));
        if (fVar != null) {
            if (trackState.ordinal() != 0) {
                obj = a.f.a;
            } else {
                obj = a.C0377a.a;
            }
            fVar.onNext(obj);
        }
    }

    public void c(String str, f<a> fVar) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.c = this.a.a(str).B(this.b).subscribe(new a9c(this, str, fVar));
    }

    public void d(String str, f<a> fVar) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.c = this.a.c(str).B(this.b).subscribe(new z8c(this, str, fVar));
    }
}
