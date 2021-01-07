package defpackage;

import com.spotify.music.connection.OfflineState;
import io.reactivex.functions.c;

/* renamed from: st4  reason: default package */
public final /* synthetic */ class st4 implements c {
    public static final /* synthetic */ st4 a = new st4();

    private /* synthetic */ st4() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return Boolean.valueOf(!((Boolean) obj).booleanValue() || ((OfflineState) obj2).offline());
    }
}
