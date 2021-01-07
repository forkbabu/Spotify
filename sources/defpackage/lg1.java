package defpackage;

import com.spotify.playlist.models.Episode;

/* renamed from: lg1  reason: default package */
public final /* synthetic */ class lg1 implements sg0 {
    public final /* synthetic */ wi1 a;
    public final /* synthetic */ ff0 b;

    public /* synthetic */ lg1(wi1 wi1, ff0 ff0) {
        this.a = wi1;
        this.b = ff0;
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return this.a.c(this.b, (Episode) obj);
    }
}
