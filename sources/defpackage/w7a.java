package defpackage;

import com.spotify.music.libs.collection.util.k;
import com.spotify.music.libs.collection.util.l;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.s;
import io.reactivex.z;

/* renamed from: w7a  reason: default package */
public class w7a {
    private static final c c = ViewUris.q1;
    private final k a;
    private final y7a b;

    public w7a(y7a y7a, l lVar) {
        this.b = y7a;
        this.a = lVar.b(c);
    }

    /* JADX WARN: Incorrect args count in method signature: (Ljava/lang/String;[Ljava/lang/String;)Lio/reactivex/z<Ljava/util/Map<Ljava/lang/String;Lcom/spotify/music/libs/collection/model/a;>;>; */
    public z a(String... strArr) {
        String str = strArr[0];
        return s.n(this.b.e(str, str).P(), this.a.b(str), new v7a(str)).N0(1).B0();
    }
}
