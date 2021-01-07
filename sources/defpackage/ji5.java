package defpackage;

import android.content.Context;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.functions.d;
import java.util.List;

/* renamed from: ji5  reason: default package */
public class ji5 implements d<RecentlyPlayedItems, RecentlyPlayedItems> {
    private final Context a;

    public ji5(Context context) {
        this.a = context;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.d
    public boolean a(RecentlyPlayedItems recentlyPlayedItems, RecentlyPlayedItems recentlyPlayedItems2) {
        RecentlyPlayedItems recentlyPlayedItems3 = recentlyPlayedItems;
        RecentlyPlayedItems recentlyPlayedItems4 = recentlyPlayedItems2;
        if (recentlyPlayedItems3.length == recentlyPlayedItems4.length) {
            List<RecentlyPlayedItem> items = recentlyPlayedItems3.getItems();
            List<RecentlyPlayedItem> items2 = recentlyPlayedItems4.getItems();
            for (int i = 0; i < items2.size(); i++) {
                RecentlyPlayedItem recentlyPlayedItem = items.get(i);
                RecentlyPlayedItem recentlyPlayedItem2 = items2.get(i);
                if (recentlyPlayedItem.getUri().equals(recentlyPlayedItem2.getUri()) && recentlyPlayedItem.getImageUri().equals(recentlyPlayedItem2.getImageUri()) && recentlyPlayedItem.getTitle(this.a).equals(recentlyPlayedItem2.getTitle(this.a))) {
                }
            }
            return true;
        }
        return false;
    }
}
