package com.spotify.mobile.android.recentlyplayed;

import android.content.Context;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;

public class b {
    private final Context a;

    public b(Context context) {
        this.a = context;
    }

    public String a(RecentlyPlayedItem recentlyPlayedItem) {
        switch (recentlyPlayedItem.type.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
                return recentlyPlayedItem.name;
            case 6:
                return this.a.getResources().getString(C0707R.string.recently_played_liked_songs);
            case 8:
                return this.a.getResources().getString(C0707R.string.recently_played_your_episodes);
            default:
                StringBuilder V0 = je.V0("Unknown type with link: ");
                V0.append(recentlyPlayedItem.link);
                Assertion.p(V0.toString());
                return "";
        }
    }
}
