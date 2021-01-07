package defpackage;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.music.libs.podcast.download.c0;
import com.spotify.playlist.models.Episode;
import io.reactivex.functions.c;

/* renamed from: z02  reason: default package */
public final /* synthetic */ class z02 implements c {
    public final /* synthetic */ b22 a;
    public final /* synthetic */ Episode b;
    public final /* synthetic */ y3 c;

    public /* synthetic */ z02(b22 b22, Episode episode, y3 y3Var) {
        this.a = b22;
        this.b = episode;
        this.c = y3Var;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return this.a.e(this.b, this.c, (c0) obj, (com.spotify.android.flags.c) obj2);
    }
}
