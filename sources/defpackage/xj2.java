package defpackage;

import com.spotify.http.u;
import com.spotify.music.artist.model.ArtistModel;
import io.reactivex.s;

/* renamed from: xj2  reason: default package */
public class xj2 {
    private final zj2 a;

    public xj2(u uVar) {
        this.a = (zj2) uVar.c(zj2.class);
    }

    public s<ArtistModel> a(String str) {
        return this.a.a(str).P();
    }
}
