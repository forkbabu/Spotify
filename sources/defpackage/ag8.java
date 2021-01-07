package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.EntityType;
import com.spotify.searchview.proto.RecommendationsType;

/* renamed from: ag8  reason: default package */
public class ag8 implements owa<Entity> {
    private final Context a;
    private final cg8 b;

    public ag8(Context context, cg8 cg8) {
        this.a = context;
        this.b = cg8;
    }

    @Override // defpackage.pwa
    public String a(Object obj) {
        return this.b.c(this.a, (Entity) obj);
    }

    @Override // defpackage.owa
    public String b(RecommendationsType recommendationsType, String str) {
        int ordinal = recommendationsType.ordinal();
        if (ordinal == 1) {
            return this.a.getString(C0707R.string.recs_title_featuring, str);
        }
        if (ordinal == 2) {
            return this.a.getString(C0707R.string.recs_title_jump_in, str);
        }
        if (ordinal == 4) {
            return this.a.getString(C0707R.string.recs_title_song_appears_in);
        }
        if (ordinal != 5) {
            return str;
        }
        return this.a.getString(C0707R.string.recs_title_episodes, str);
    }

    @Override // defpackage.owa
    public String c(EntityType entityType) {
        switch (entityType.ordinal()) {
            case 1:
                return this.a.getString(C0707R.string.see_all_title_artist);
            case 2:
                return this.a.getString(C0707R.string.see_all_title_track);
            case 3:
                return this.a.getString(C0707R.string.see_all_title_album);
            case 4:
                return this.a.getString(C0707R.string.see_all_title_playlist);
            case 5:
                return this.a.getString(C0707R.string.see_all_title_genre);
            case 6:
                return this.a.getString(C0707R.string.see_all_title_podcast_and_show);
            case 7:
                return this.a.getString(C0707R.string.see_all_title_episode);
            case 8:
                return this.a.getString(C0707R.string.see_all_title_profile);
            case 9:
                return this.a.getString(C0707R.string.see_all_title_topic);
            default:
                StringBuilder V0 = je.V0("Could not resolve title for entity type: ");
                V0.append(entityType.name());
                Assertion.g(V0.toString());
                return "unknown";
        }
    }

    @Override // defpackage.pwa
    public String f(Object obj) {
        return this.b.c(this.a, (Entity) obj);
    }
}
