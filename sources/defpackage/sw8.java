package defpackage;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.functions.l;

/* renamed from: sw8  reason: default package */
public final /* synthetic */ class sw8 implements l {
    public static final /* synthetic */ sw8 a = new sw8();

    private /* synthetic */ sw8() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return LoggingParams.builder().interactionId((String) obj).build();
    }
}
