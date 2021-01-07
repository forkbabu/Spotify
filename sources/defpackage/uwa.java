package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.searchview.assistedcuration.proto.Entity;
import com.spotify.searchview.assistedcuration.proto.EntityType;

/* renamed from: uwa  reason: default package */
public class uwa implements pwa<Entity>, twa {
    private final Resources a;
    private final wwa b;

    public uwa(Activity activity, wwa wwa) {
        this.a = activity.getResources();
        this.b = wwa;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.pwa
    public String a(Entity entity) {
        return this.b.c(entity);
    }

    @Override // defpackage.twa
    public String d(EntityType entityType) {
        int ordinal = entityType.ordinal();
        if (ordinal == 1) {
            return this.a.getString(C0707R.string.ac_see_all_title_artist);
        }
        if (ordinal == 2) {
            return this.a.getString(C0707R.string.ac_see_all_title_song);
        }
        if (ordinal == 3) {
            return this.a.getString(C0707R.string.ac_see_all_title_album);
        }
        StringBuilder V0 = je.V0("Could not resolve title for entity type: ");
        V0.append(entityType.name());
        Assertion.g(V0.toString());
        return "unknown";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.pwa
    public String f(Entity entity) {
        return this.b.c(entity);
    }
}
