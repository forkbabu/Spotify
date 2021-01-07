package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.searchview.assistedcuration.proto.Entity;
import com.spotify.searchview.assistedcuration.proto.EntityType;

/* renamed from: rwa  reason: default package */
public class rwa implements hwa<Entity, EntityType> {
    private final Resources a;
    private final wwa b;

    public rwa(Activity activity, wwa wwa) {
        this.a = activity.getResources();
        this.b = wwa;
    }

    @Override // defpackage.pwa
    public String a(Object obj) {
        return this.b.a((Entity) obj);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String] */
    @Override // defpackage.hwa
    public String e(EntityType entityType, String str) {
        EntityType entityType2 = entityType;
        int ordinal = entityType2.ordinal();
        if (ordinal == 1) {
            return this.a.getString(C0707R.string.assisted_curation_drilldown_artist_title, str);
        }
        if (ordinal == 2) {
            return this.a.getString(C0707R.string.assisted_curation_drilldown_song_title, str);
        }
        if (ordinal == 3) {
            return this.a.getString(C0707R.string.assisted_curation_drilldown_album_title, str);
        }
        StringBuilder V0 = je.V0("Could not resolve title for entity type: ");
        V0.append(entityType2.name());
        Assertion.g(V0.toString());
        return this.a.getString(C0707R.string.assisted_curation_drilldown_search_title, str);
    }

    @Override // defpackage.pwa
    public String f(Object obj) {
        return this.b.c((Entity) obj);
    }
}
