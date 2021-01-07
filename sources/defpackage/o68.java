package defpackage;

import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;

/* renamed from: o68  reason: default package */
public class o68 implements v51 {
    private final c.a a;

    public o68(c.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.v51
    public int d(s81 s81) {
        if ((s81.componentId().id().equals("search:podcastEpisodeRow") || s81.componentId().id().equals("search:musicAndTalkEpisodeRow")) && this.a.getViewUri().toString().equals("spotify:search")) {
            return C0707R.id.recent_search_podcast_episode_row;
        }
        if (!s81.componentId().id().equals("search:trackWithLyrics") || !this.a.getViewUri().toString().equals("spotify:search")) {
            return 0;
        }
        return C0707R.id.hub_glue_row_two_line_image;
    }
}
