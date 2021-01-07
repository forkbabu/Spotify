package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.browse.view.a;
import io.reactivex.g;
import io.reactivex.k;

/* renamed from: jf4  reason: default package */
public class jf4 implements k<b91, String> {
    private final String a;

    public jf4(String str) {
        str.getClass();
        this.a = str;
    }

    public static Optional b(jf4 jf4, b91 b91) {
        jf4.getClass();
        if (!b91.body().isEmpty()) {
            String[] stringArray = b91.custom().stringArray("pageIdentifier");
            if (stringArray == null || stringArray.length <= 0) {
                return Optional.of(jf4.a);
            }
            return Optional.of(stringArray[0]);
        } else if (a.e(b91) || a.g(b91)) {
            return Optional.of(jf4.a);
        } else {
            return Optional.absent();
        }
    }

    /* Return type fixed from 'tpf' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.g] */
    @Override // io.reactivex.k
    public tpf<String> a(g<b91> gVar) {
        return gVar.O(new md4(this)).C(pc4.a).O(xd4.a);
    }
}
