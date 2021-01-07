package defpackage;

import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.o;
import io.reactivex.functions.l;

/* renamed from: f32  reason: default package */
public final /* synthetic */ class f32 implements l {
    public final /* synthetic */ Episode a;

    public /* synthetic */ f32(Episode episode) {
        this.a = episode;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new u3(this.a, (o) obj);
    }
}
