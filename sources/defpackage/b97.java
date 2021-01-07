package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.spotify.music.C0707R;
import com.spotify.music.features.podcast.episode.inspector.tracklist.model.TrackListItemType;
import com.spotify.music.features.podcast.episode.inspector.tracklist.model.c;
import com.spotify.music.features.podcast.episode.inspector.tracklist.model.d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b97  reason: default package */
public class b97 implements a97 {
    private final Context a;

    public b97(Context context) {
        this.a = context;
    }

    @Override // defpackage.a97
    public k87 a(d dVar, m97 m97) {
        String str;
        List<c> f = dVar.f();
        ArrayList arrayList = new ArrayList(f.size());
        Joiner on = Joiner.on(", ");
        int i = 0;
        while (i < f.size()) {
            c cVar = f.get(i);
            String join = on.join(cVar.a());
            String d = dVar.d();
            String n = cVar.n();
            String str2 = "";
            if (!TextUtils.isEmpty(cVar.i())) {
                str = cVar.i();
            } else if (!TextUtils.isEmpty(cVar.m())) {
                str = cVar.m();
            } else {
                str = !TextUtils.isEmpty(cVar.e()) ? cVar.e() : str2;
            }
            Context context = this.a;
            if (!TextUtils.isEmpty(cVar.h())) {
                join = cVar.h();
            } else if (TextUtils.isEmpty(join)) {
                join = context.getString(C0707R.string.track_list_item_subtitle_placeholder);
            }
            long k = cVar.k();
            if (!TextUtils.isEmpty(cVar.g())) {
                str2 = cVar.g();
            } else if (!TextUtils.isEmpty(cVar.l())) {
                str2 = cVar.l();
            } else if (!TextUtils.isEmpty(cVar.d())) {
                str2 = cVar.d();
            }
            boolean z = i == 0;
            boolean z2 = i == f.size() + -1;
            boolean z3 = m97.b().equals(dVar.d()) && m97.d() == i;
            TrackListItemType j = cVar.j();
            TrackListItemType trackListItemType = TrackListItemType.MUSIC;
            arrayList.add(j87.a(d, n, str, join, k, str2, z, z2, z3, j == trackListItemType, cVar.j(), cVar.f() && cVar.j() == trackListItemType));
            i++;
            f = f;
            on = on;
        }
        return k87.b(Optional.fromNullable(dVar.e()), Joiner.on(", ").join(dVar.a()), dVar.d(), arrayList, dVar.c());
    }
}
