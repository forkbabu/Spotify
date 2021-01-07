package defpackage;

import com.spotify.mobile.android.ui.fragments.logic.m;
import com.spotify.player.model.PlayerError;
import io.reactivex.functions.l;

/* renamed from: b62  reason: default package */
public final /* synthetic */ class b62 implements l {
    public final /* synthetic */ Boolean a;

    public /* synthetic */ b62(Boolean bool) {
        this.a = bool;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new m((PlayerError) obj, this.a.booleanValue());
    }
}
