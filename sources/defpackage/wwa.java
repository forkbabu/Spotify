package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.collect.FluentIterable;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.searchview.assistedcuration.proto.Album;
import com.spotify.searchview.assistedcuration.proto.Entity;

/* renamed from: wwa  reason: default package */
public class wwa {
    private final Resources a;

    public wwa(Activity activity) {
        this.a = activity.getResources();
    }

    private static String b(Entity entity) {
        int ordinal = entity.i().ordinal();
        if (ordinal == 1) {
            return Joiner.on(", ").join(FluentIterable.from(entity.n().o()).transform(qwa.a));
        } else if (ordinal != 2) {
            return "";
        } else {
            Album h = entity.h();
            if (h.i() > 0) {
                return h.h(0);
            }
            return "";
        }
    }

    private static String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        if (!MoreObjects.isNullOrEmpty(str2)) {
            sb.append(" • ");
            sb.append(str2);
        }
        return sb.toString();
    }

    public String a(Entity entity) {
        return b(entity);
    }

    public String c(Entity entity) {
        String b = b(entity);
        int ordinal = entity.i().ordinal();
        if (ordinal == 0) {
            return this.a.getString(C0707R.string.ac_search_subtitle_artist);
        }
        if (ordinal == 1) {
            return d(this.a.getString(C0707R.string.ac_search_subtitle_song), b);
        }
        if (ordinal == 2) {
            return d(this.a.getString(C0707R.string.ac_search_subtitle_album), b);
        }
        StringBuilder V0 = je.V0("Could not resolve subtitle for entity type: ");
        V0.append(entity.i());
        Assertion.g(V0.toString());
        return "";
    }
}
