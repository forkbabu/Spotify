package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.hiddencontent.model.BansResponse;
import io.reactivex.functions.l;
import java.util.Collections;

/* renamed from: if5  reason: default package */
public final /* synthetic */ class if5 implements l {
    public static final /* synthetic */ if5 a = new if5();

    private /* synthetic */ if5() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Failed to observe bans!", new Object[0]);
        return BansResponse.create(Collections.emptyList(), Collections.emptyList());
    }
}
