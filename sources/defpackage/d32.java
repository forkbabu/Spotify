package defpackage;

import com.spotify.playlist.models.Episode;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: d32  reason: default package */
public final /* synthetic */ class d32 implements l {
    public final /* synthetic */ String a;
    public final /* synthetic */ s b;

    public /* synthetic */ d32(String str, s sVar) {
        this.a = str;
        this.b = sVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        s sVar = this.b;
        Episode episode = (Episode) obj;
        if (str == null) {
            return s.i0(new u3(episode, null));
        }
        return sVar.j0(new f32(episode));
    }
}
