package defpackage;

import android.content.res.Resources;
import com.spotify.music.C0707R;

/* renamed from: rrc  reason: default package */
public abstract class rrc {
    public static rrc b(Resources resources) {
        return new prc(qoc.a(resources, C0707R.dimen.call_to_action_size_percentage, C0707R.dimen.call_to_action_max_width));
    }

    public abstract int a();
}
