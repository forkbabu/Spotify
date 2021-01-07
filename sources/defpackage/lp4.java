package defpackage;

import com.spotify.music.connection.OfflineState;
import io.reactivex.functions.c;
import java.util.Collections;
import java.util.List;

/* renamed from: lp4  reason: default package */
public final /* synthetic */ class lp4 implements c {
    public static final /* synthetic */ lp4 a = new lp4();

    private /* synthetic */ lp4() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return ((OfflineState) obj).offline() ? Collections.emptyList() : (List) obj2;
    }
}
