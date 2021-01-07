package defpackage;

import com.spotify.playlist.models.o;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: b32  reason: default package */
public final /* synthetic */ class b32 implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ b32(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (o) ((Map) obj).get(this.a);
    }
}
