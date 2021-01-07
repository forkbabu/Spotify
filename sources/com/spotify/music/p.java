package com.spotify.music;

import com.spotify.music.features.navigation.BottomTab;
import io.reactivex.functions.l;

public final /* synthetic */ class p implements l {
    public final /* synthetic */ String a;
    public final /* synthetic */ BottomTab b;

    public /* synthetic */ p(String str, BottomTab bottomTab) {
        this.a = str;
        this.b = bottomTab;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        BottomTab bottomTab = this.b;
        ej9 ej9 = (ej9) obj;
        if (!(ej9 instanceof fj9)) {
            return ej9;
        }
        fj9 fj9 = (fj9) ej9;
        if (fj9.e() == null) {
            fj9 = fj9.g(str);
        }
        return fj9.f(bottomTab.d());
    }
}
