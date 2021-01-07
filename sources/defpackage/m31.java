package defpackage;

import com.spotify.metadata.proto.Metadata$Album;
import com.spotify.metadata.proto.Metadata$Disc;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import kotlin.jvm.internal.h;

/* renamed from: m31  reason: default package */
final class m31<T, R> implements l<Metadata$Album, v<? extends Metadata$Disc>> {
    public static final m31 a = new m31();

    m31() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public v<? extends Metadata$Disc> apply(Metadata$Album metadata$Album) {
        Metadata$Album metadata$Album2 = metadata$Album;
        h.e(metadata$Album2, "album");
        return s.d0(metadata$Album2.l());
    }
}
