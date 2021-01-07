package defpackage;

import com.spotify.music.features.podcast.episode.transcript.ui.page.c;
import com.spotify.music.features.podcast.episode.transcript.ui.page.k;
import com.spotify.music.yourlibrary.quickscroll.a0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: nb7  reason: default package */
public final class nb7 implements a0 {
    private List<String> a = EmptyList.a;

    @Override // com.spotify.music.yourlibrary.quickscroll.a0
    public String a(int i) {
        return i < this.a.size() ? this.a.get(i) : "";
    }

    public final void b(k kVar) {
        String str;
        h.e(kVar, "viewModel");
        List<c> a2 = kVar.a();
        ArrayList arrayList = new ArrayList(d.e(a2, 10));
        for (T t : a2) {
            if (t instanceof c.b) {
                str = t.c();
            } else if (t instanceof c.a) {
                str = "";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(str);
        }
        this.a = arrayList;
    }
}
