package defpackage;

import android.content.res.Resources;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;

/* renamed from: df7  reason: default package */
public class df7 {
    private static final Joiner b = Joiner.on(" • ").skipNulls();
    private final Resources a;

    public df7(Resources resources) {
        this.a = resources;
    }

    public String a(String str, l0 l0Var) {
        int ordinal = l0Var.q().ordinal();
        if (ordinal == 6) {
            return b.join(this.a.getString(C0707R.string.featured_content_entity_subtitle_album), MoreObjects.emptyToNull(str), new Object[0]);
        } else if (ordinal == 14) {
            return this.a.getString(C0707R.string.featured_content_entity_subtitle_artist);
        } else {
            if (ordinal == 185 || ordinal == 210) {
                return this.a.getString(C0707R.string.featured_content_entity_subtitle_playlist);
            }
            if (ordinal != 273) {
                return str;
            }
            return b.join(this.a.getString(C0707R.string.featured_content_entity_subtitle_track), MoreObjects.emptyToNull(str), new Object[0]);
        }
    }
}
