package defpackage;

import android.os.Bundle;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.functions.l;

/* renamed from: xp5  reason: default package */
public final /* synthetic */ class xp5 implements l {
    public final /* synthetic */ cq5 a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ String c;

    public /* synthetic */ xp5(cq5 cq5, Bundle bundle, String str) {
        this.a = cq5;
        this.b = bundle;
        this.c = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.z(this.b, this.c, (LoggingParams) obj);
    }
}
