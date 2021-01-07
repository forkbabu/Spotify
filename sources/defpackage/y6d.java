package defpackage;

import com.spotify.music.sociallistening.models.b;
import io.reactivex.functions.n;

/* renamed from: y6d  reason: default package */
public final /* synthetic */ class y6d implements n {
    public final /* synthetic */ String a;

    public /* synthetic */ y6d(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        b bVar = (b) obj;
        return bVar.b().isEmpty() || !bVar.b().equals(this.a);
    }
}
