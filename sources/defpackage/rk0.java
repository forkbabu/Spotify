package defpackage;

import android.util.Pair;
import com.google.common.base.Function;
import com.google.protobuf.ByteString;
import com.spotify.eventsender.Fragment;

/* renamed from: rk0  reason: default package */
public final /* synthetic */ class rk0 implements Function {
    public static final /* synthetic */ rk0 a = new rk0();

    private /* synthetic */ rk0() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Pair pair = (Pair) obj;
        Fragment.b n = Fragment.n();
        n.n((String) pair.first);
        n.m((ByteString) pair.second);
        return (Fragment) n.build();
    }
}
