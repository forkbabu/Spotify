package com.spotify.music.moderation;

import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ ModerationReportFragment a;
    public final /* synthetic */ yjb b;

    public /* synthetic */ a(ModerationReportFragment moderationReportFragment, yjb yjb) {
        this.a = moderationReportFragment;
        this.b = yjb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k5(this.b, (String) obj);
    }
}
