package defpackage;

import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

/* renamed from: z67  reason: default package */
public class z67 {
    private final jzc a;
    private final tsc b;

    public z67(jzc jzc, tsc tsc) {
        h.e(jzc, "shareFlow");
        h.e(tsc, "episodeRowLogger");
        this.a = jzc;
        this.b = tsc;
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        h.e(str, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(str2, "episodeUri");
        h.e(str3, "episodeName");
        h.e(str4, "podcastName");
        h.e(str5, "coverArt");
        this.a.c(pzc.e(str5, str3, str, str2).build(), rzc.a, C0707R.string.integration_id_context_menu);
        this.b.h();
    }
}
