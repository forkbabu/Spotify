package defpackage;

import android.content.res.Resources;
import com.spotify.music.C0707R;

/* renamed from: zoc  reason: default package */
public abstract class zoc {
    public static zoc b(Resources resources, int i) {
        if (i != 2) {
            return new yoc(qoc.a(resources, C0707R.dimen.discovery_card_size_percentage_medium, C0707R.dimen.discovery_card_max_width_medium));
        }
        return new yoc(qoc.a(resources, C0707R.dimen.discovery_card_size_percentage_large, C0707R.dimen.discovery_card_max_width_large));
    }

    public abstract int a();
}
