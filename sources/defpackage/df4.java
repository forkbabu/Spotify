package defpackage;

import com.spotify.music.features.browse.view.a;
import io.reactivex.functions.c;

/* renamed from: df4  reason: default package */
public class df4 implements c<b91, b91, b91> {
    private static boolean b(b91 b91) {
        if (!b91.body().isEmpty()) {
            int i = t71.c;
            if (!"hubs/placeholder".equals(b91.id()) && !a.g(b91) && !a.f(b91)) {
                return true;
            }
        }
        return false;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public b91 a(b91 b91, b91 b912) {
        b91 b913 = b91;
        b91 b914 = b912;
        return (!b(b913) || b(b914)) ? b914 : b913;
    }
}
