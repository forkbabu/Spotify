package com.spotify.music.moderation;

import com.google.common.base.Joiner;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ yjb a;

    public /* synthetic */ b(yjb yjb) {
        this.a = yjb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        yjb yjb = this.a;
        int i = ModerationReportFragment.A0;
        StringBuilder V0 = je.V0("Error rendering model for uri(s): ");
        V0.append(Joiner.on(",").join(yjb.b()));
        Logger.e((Throwable) obj, V0.toString(), new Object[0]);
    }
}
