package defpackage;

import android.content.Context;
import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem;

/* renamed from: fi2  reason: default package */
public final /* synthetic */ class fi2 implements Predicate {
    public final /* synthetic */ Context a;

    public /* synthetic */ fi2(Context context) {
        this.a = context;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return !MoreObjects.isNullOrEmpty(((RecentlyPlayedItem) obj).getTitle(this.a));
    }
}
