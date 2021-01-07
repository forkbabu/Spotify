package defpackage;

import android.content.res.Resources;
import com.spotify.music.C0707R;

/* renamed from: yd8  reason: default package */
public class yd8 implements hta {
    private final Resources a;

    public yd8(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.hta
    public gta a() {
        return gta.a(this.a.getString(C0707R.string.search_section_tracks_synced), "");
    }

    @Override // defpackage.hta
    public gta b() {
        return gta.a(this.a.getString(C0707R.string.search_section_episodes_synced), this.a.getString(C0707R.string.search_section_episodes_subtitle));
    }

    @Override // defpackage.hta
    public gta c() {
        return gta.a(this.a.getString(C0707R.string.search_section_playlists), this.a.getString(C0707R.string.search_section_playlists_subtitle));
    }
}
