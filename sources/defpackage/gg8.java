package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;

/* renamed from: gg8  reason: default package */
public class gg8 {
    private final Resources a;
    private final String b;
    private final String c;

    gg8(Activity activity, String str, String str2) {
        this.a = activity.getResources();
        this.b = str;
        this.c = str2;
    }

    public String a() {
        String str = this.b;
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1409097913:
                if (str.equals("artist")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1183266158:
                if (str.equals("audio_episode")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3529469:
                if (str.equals("show")) {
                    c2 = 2;
                    break;
                }
                break;
            case 92896879:
                if (str.equals("album")) {
                    c2 = 3;
                    break;
                }
                break;
            case 98240899:
                if (str.equals("genre")) {
                    c2 = 4;
                    break;
                }
                break;
            case 110546223:
                if (str.equals("topic")) {
                    c2 = 5;
                    break;
                }
                break;
            case 110621003:
                if (str.equals(AppProtocol.TrackData.TYPE_TRACK)) {
                    c2 = 6;
                    break;
                }
                break;
            case 1216225589:
                if (str.equals("user_profile")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1879474642:
                if (str.equals("playlist")) {
                    c2 = '\b';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return this.a.getString(C0707R.string.drilldown_artists_title, this.c);
            case 1:
                return this.a.getString(C0707R.string.drilldown_episodes_title, this.c);
            case 2:
                return this.a.getString(C0707R.string.drilldown_podcasts_and_shows_title, this.c);
            case 3:
                return this.a.getString(C0707R.string.drilldown_albums_title, this.c);
            case 4:
                return this.a.getString(C0707R.string.drilldown_genres_title, this.c);
            case 5:
                return this.a.getString(C0707R.string.drilldown_topic_title, this.c);
            case 6:
                return this.a.getString(C0707R.string.drilldown_tracks_title, this.c);
            case 7:
                return this.a.getString(C0707R.string.drilldown_profiles_title, this.c);
            case '\b':
                return this.a.getString(C0707R.string.drilldown_playlists_title, this.c);
            default:
                return this.a.getString(C0707R.string.search_title, this.c);
        }
    }
}
