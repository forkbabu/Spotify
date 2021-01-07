package defpackage;

import com.spotify.music.features.eventshub.model.ConcertResult;
import com.spotify.music.navigation.t;
import io.reactivex.functions.g;

/* renamed from: b15  reason: default package */
public final /* synthetic */ class b15 implements g {
    public final /* synthetic */ t a;

    public /* synthetic */ b15(t tVar) {
        this.a = tVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        t tVar = this.a;
        StringBuilder V0 = je.V0("spotify:concert:");
        V0.append(((ConcertResult) obj).getConcert().getId());
        tVar.d(V0.toString());
    }
}
