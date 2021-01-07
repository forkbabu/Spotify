package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.playlist.models.offline.a;

/* renamed from: ag9  reason: default package */
public class ag9 {
    private final Context a;

    public ag9(Context context) {
        this.a = context;
    }

    private void a(StringBuilder sb, a aVar) {
        if (aVar != null) {
            sb.append(". ");
            sb.append((String) aVar.a(qf9.a, new vf9(this), new uf9(this), new tf9(this), pf9.a, of9.a, rf9.a, sf9.a));
        }
    }

    public String b(MusicItem musicItem) {
        int ordinal = musicItem.type().ordinal();
        if (ordinal == 1) {
            StringBuilder sb = new StringBuilder(this.a.getString(C0707R.string.your_library_music_pages_content_description_row_album, musicItem.w(), musicItem.u()));
            a(sb, musicItem.p());
            return sb.toString();
        } else if (ordinal != 16) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder(musicItem.w());
            sb2.append(". ");
            sb2.append(musicItem.u());
            a(sb2, musicItem.p());
            return sb2.toString();
        }
    }

    public /* synthetic */ String c(a.h hVar) {
        return this.a.getString(C0707R.string.your_library_music_pages_content_description_offline_state_waiting);
    }

    public /* synthetic */ String d(a.b bVar) {
        return this.a.getString(C0707R.string.your_library_music_pages_content_description_offline_state_downloading, Integer.valueOf(bVar.c()));
    }

    public /* synthetic */ String e(a.C0377a aVar) {
        return this.a.getString(C0707R.string.your_library_music_pages_content_description_offline_state_downloaded);
    }
}
