package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.C0707R;
import com.spotify.music.sleeptimer.n;

/* renamed from: b4d  reason: default package */
public class b4d {
    private final Context a;
    private final n b;

    public b4d(n nVar, Context context) {
        this.b = nVar;
        this.a = context;
    }

    public Drawable a() {
        if (!this.b.e()) {
            return l70.i(this.a, SpotifyIconV2.SLEEPTIMER);
        }
        Context context = this.a;
        return l70.j(context, SpotifyIconV2.SLEEPTIMER, a.b(context, R.color.green_light));
    }

    public String b(LinkType linkType) {
        StringBuilder sb = new StringBuilder(15);
        sb.append(this.a.getString(C0707R.string.context_menu_sleep_timer));
        if (this.b.e()) {
            sb.append(" - ");
            if (this.b.g() >= 0) {
                int ceil = (int) Math.ceil((double) (((float) this.b.g()) / 60000.0f));
                if (ceil < 60) {
                    sb.append(String.format(this.a.getString(C0707R.string.context_menu_sleep_timer_mins_left), Integer.valueOf(ceil)));
                } else {
                    sb.append(String.format(this.a.getString(C0707R.string.context_menu_sleep_timer_hours_left), Integer.valueOf(ceil / 60)));
                }
            } else if (linkType == LinkType.SHOW_EPISODE) {
                sb.append(this.a.getString(C0707R.string.context_menu_sleep_timer_end_of_episode));
            } else {
                sb.append(this.a.getString(C0707R.string.context_menu_sleep_timer_end_of_track));
            }
        }
        return sb.toString();
    }
}
