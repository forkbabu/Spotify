package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.EntityType;

/* renamed from: wf8  reason: default package */
public class wf8 implements hwa<Entity, EntityType> {
    private final Context a;
    private final cg8 b;

    public wf8(Context context, cg8 cg8) {
        this.a = context;
        this.b = cg8;
    }

    @Override // defpackage.pwa
    public String a(Object obj) {
        return this.b.a(this.a, (Entity) obj);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String] */
    @Override // defpackage.hwa
    public String e(EntityType entityType, String str) {
        switch (entityType.ordinal()) {
            case 1:
                return this.a.getString(C0707R.string.drilldown_artists_title, str);
            case 2:
                return this.a.getString(C0707R.string.drilldown_tracks_title, str);
            case 3:
                return this.a.getString(C0707R.string.drilldown_albums_title, str);
            case 4:
                return this.a.getString(C0707R.string.drilldown_playlists_title, str);
            case 5:
                return this.a.getString(C0707R.string.drilldown_genres_title, str);
            case 6:
                return this.a.getString(C0707R.string.drilldown_podcasts_and_shows_title, str);
            case 7:
                return this.a.getString(C0707R.string.drilldown_episodes_title, str);
            case 8:
                return this.a.getString(C0707R.string.drilldown_profiles_title, str);
            case 9:
                return this.a.getString(C0707R.string.drilldown_topic_title, str);
            default:
                return this.a.getString(C0707R.string.search_title, str);
        }
    }

    @Override // defpackage.pwa
    public String f(Object obj) {
        return this.b.c(this.a, (Entity) obj);
    }
}
