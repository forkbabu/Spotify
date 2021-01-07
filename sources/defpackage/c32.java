package defpackage;

import com.spotify.playlist.models.Episode;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: c32  reason: default package */
public final /* synthetic */ class c32 implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ c32(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (Episode) ((Map) obj).get(this.a);
    }
}
