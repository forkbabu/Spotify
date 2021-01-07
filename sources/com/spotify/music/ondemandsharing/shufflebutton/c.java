package com.spotify.music.ondemandsharing.shufflebutton;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;

public final /* synthetic */ class c implements Function {
    public final /* synthetic */ boolean a;

    public /* synthetic */ c(boolean z) {
        this.a = z;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        s81 s81 = (s81) obj;
        return s81 != null ? s81.toBuilder().m(FluentIterable.from(s81.children()).transform(new d(this.a, s81)).toList()).l() : s81;
    }
}
