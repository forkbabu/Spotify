package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.share.sharedata.s;
import io.reactivex.z;

/* renamed from: vzc  reason: default package */
public class vzc implements uzc {
    private final a2d a;
    private final Context b;

    vzc(a2d a2d, Context context) {
        this.a = a2d;
        this.b = context;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.uzc
    public z<s> a(pzc pzc) {
        String str;
        l0 z = l0.z(pzc.k().g());
        a2d a2d = this.a;
        Context context = this.b;
        String h = pzc.h();
        String g = pzc.g();
        a2d.getClass();
        StringBuilder sb = new StringBuilder();
        switch (z.q().ordinal()) {
            case 6:
            case 54:
                str = context.getString(C0707R.string.share_to_external_album_title_short);
                break;
            case 7:
            case 16:
            case 17:
            case 24:
            case 26:
            case 27:
            case 28:
            case 65:
            case 66:
            case 67:
            case 69:
            case 72:
            case 75:
            case 115:
            case 180:
            case 186:
            case 205:
            case 240:
            case 245:
            case 253:
                str = "";
                break;
            case 14:
            case 56:
                str = context.getString(C0707R.string.share_to_external_artist_title);
                break;
            case 85:
                str = context.getString(C0707R.string.share_to_external_concert_title_short);
                break;
            case 185:
            case 210:
            case 272:
                str = context.getString(C0707R.string.share_to_external_playlist_title_short);
                break;
            case 237:
            case 246:
                str = context.getString(C0707R.string.share_to_external_show_episode_title_short);
                break;
            case 273:
                str = context.getString(C0707R.string.share_to_external_song_title_short);
                break;
            default:
                StringBuilder V0 = je.V0("Unsupported link type ");
                V0.append(z.q());
                Assertion.p(V0.toString());
                str = "";
                break;
        }
        sb.append(str);
        sb.append(' ');
        sb.append(h);
        sb.append(' ');
        sb.append(g);
        return z.z(s.j(pzc.k(), sb.toString()));
    }
}
