package defpackage;

import com.spotify.music.preview.z;
import defpackage.d05;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: j05  reason: default package */
public final class j05<T, R> implements l<z, d05> {
    public static final j05 a = new j05();

    j05() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d05 apply(z zVar) {
        z zVar2 = zVar;
        h.e(zVar2, "it");
        return new d05.e(zVar2);
    }
}
