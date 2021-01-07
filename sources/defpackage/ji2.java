package defpackage;

import android.content.Context;
import com.google.common.collect.FluentIterable;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.functions.l;

/* renamed from: ji2  reason: default package */
public final /* synthetic */ class ji2 implements l {
    public final /* synthetic */ Context a;

    public /* synthetic */ ji2(Context context) {
        this.a = context;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Context context = this.a;
        return FluentIterable.from(((RecentlyPlayedItems) obj).items).filter(ci2.a).filter(new fi2(context)).transform(new gi2(context)).toList();
    }
}
