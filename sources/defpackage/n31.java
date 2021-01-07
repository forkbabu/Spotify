package defpackage;

import com.spotify.metadata.proto.Metadata$Disc;
import com.spotify.metadata.proto.Metadata$Track;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import kotlin.jvm.internal.h;

/* renamed from: n31  reason: default package */
final class n31<T, R> implements l<Metadata$Disc, v<? extends Metadata$Track>> {
    public static final n31 a = new n31();

    n31() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public v<? extends Metadata$Track> apply(Metadata$Disc metadata$Disc) {
        Metadata$Disc metadata$Disc2 = metadata$Disc;
        h.e(metadata$Disc2, "disc");
        return s.d0(metadata$Disc2.h());
    }
}
