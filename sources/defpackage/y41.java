package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.maybe.b;

/* renamed from: y41  reason: default package */
public final /* synthetic */ class y41 implements l {
    public static final /* synthetic */ y41 a = new y41();

    private /* synthetic */ y41() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str;
        RecentlyPlayedItems recentlyPlayedItems = (RecentlyPlayedItems) obj;
        int i = 0;
        while (true) {
            if (i >= recentlyPlayedItems.length) {
                str = null;
                break;
            } else if (!"video".equals(recentlyPlayedItems.items.get(i).mediaType)) {
                str = recentlyPlayedItems.items.get(i).getUri();
                break;
            } else {
                i++;
            }
        }
        if (str == null) {
            return b.a;
        }
        return io.reactivex.l.k(PlayerContext.createFromContextUrl(str, "context://" + str));
    }
}
