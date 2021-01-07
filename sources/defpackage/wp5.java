package defpackage;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.functions.l;

/* renamed from: wp5  reason: default package */
public final /* synthetic */ class wp5 implements l {
    public static final /* synthetic */ wp5 a = new wp5();

    private /* synthetic */ wp5() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return LoggingParams.builder().interactionId((String) obj).build();
    }
}
