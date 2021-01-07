package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: kvc  reason: default package */
public final class kvc implements ttc {
    @Override // defpackage.ttc
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "layoutInflater");
        h.e(viewGroup, "parentView");
        View inflate = layoutInflater.inflate(C0707R.layout.podcast_qna_storylines_view, viewGroup, false);
        h.d(inflate, "layoutInflater.inflate(R…_view, parentView, false)");
        return inflate;
    }

    @Override // defpackage.ttc
    public void b(String str) {
        h.e(str, "episodeUri");
    }

    @Override // defpackage.ttc
    public void stop() {
    }
}
