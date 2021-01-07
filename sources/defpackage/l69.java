package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.datasource.j3;
import io.reactivex.s;
import java.util.Collections;

/* renamed from: l69  reason: default package */
public final /* synthetic */ class l69 implements j3.a {
    public final /* synthetic */ y7a a;

    public /* synthetic */ l69(y7a y7a) {
        this.a = y7a;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.j3.a
    public final s a(String[] strArr) {
        y7a y7a = this.a;
        if (strArr.length > 0) {
            return y7a.e(null, strArr).P();
        }
        return s.i0(Collections.emptyMap());
    }
}
