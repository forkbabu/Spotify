package defpackage;

import com.spotify.nowplaying.core.immersive.ImmersiveMode;
import io.reactivex.functions.c;

/* renamed from: bmb  reason: default package */
public final /* synthetic */ class bmb implements c {
    public static final /* synthetic */ bmb a = new bmb();

    private /* synthetic */ bmb() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (((Boolean) obj2).booleanValue()) {
            return ImmersiveMode.SEMI_IMMERSIVE;
        }
        return booleanValue ? ImmersiveMode.NO_IMMERSIVE : ImmersiveMode.FULL_IMMERSIVE;
    }
}
