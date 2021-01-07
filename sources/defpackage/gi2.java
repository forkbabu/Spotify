package defpackage;

import android.content.Context;
import com.google.common.base.Function;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem;
import defpackage.qi2;

/* renamed from: gi2  reason: default package */
public final /* synthetic */ class gi2 implements Function {
    public final /* synthetic */ Context a;

    public /* synthetic */ gi2(Context context) {
        this.a = context;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Context context = this.a;
        RecentlyPlayedItem recentlyPlayedItem = (RecentlyPlayedItem) obj;
        qi2.b bVar = new qi2.b();
        bVar.d(recentlyPlayedItem.getTargetUri());
        bVar.c(recentlyPlayedItem.getTitle(context));
        bVar.b(recentlyPlayedItem.getImageUri());
        return bVar.a();
    }
}
