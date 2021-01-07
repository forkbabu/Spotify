package defpackage;

import com.spotify.playlist.models.Show;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: p32  reason: default package */
public final /* synthetic */ class p32 implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ p32(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (Show) ((Map) obj).get(this.a);
    }
}
