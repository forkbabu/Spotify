package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.c;

/* renamed from: yaa  reason: default package */
public final /* synthetic */ class yaa implements c {
    public static final /* synthetic */ yaa a = new yaa();

    private /* synthetic */ yaa() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        gba gba = (gba) obj;
        int i = hba.h;
        return ((PlayerState) obj2).track().isPresent() ? gba : gba.d();
    }
}
