package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.functions.g;

/* renamed from: ii5  reason: default package */
public final /* synthetic */ class ii5 implements g {
    public final /* synthetic */ ni5 a;

    public /* synthetic */ ii5(ni5 ni5) {
        this.a = ni5;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ni5.b(this.a, (RecentlyPlayedItems) obj);
    }
}
