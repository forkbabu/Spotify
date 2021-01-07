package defpackage;

import com.spotify.playlist.models.Episode;

/* renamed from: sf1  reason: default package */
public final /* synthetic */ class sf1 implements sg0 {
    public final /* synthetic */ rh1 a;
    public final /* synthetic */ ff0 b;

    public /* synthetic */ sf1(rh1 rh1, ff0 ff0) {
        this.a = rh1;
        this.b = ff0;
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return this.a.c(this.b, (Episode) obj);
    }
}
