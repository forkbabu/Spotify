package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.music.C0707R;
import com.spotify.music.features.freetierartist.datasource.y;
import com.spotify.playlist.models.b;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b85  reason: default package */
public class b85 implements w<b91, b91> {
    private final Context a;
    private final String b;
    private final y c;

    public b85(Context context, String str, y yVar) {
        this.a = context;
        this.b = str;
        this.c = yVar;
    }

    /* access modifiers changed from: package-private */
    public b91 a(b91 b91, Optional<b> optional) {
        if (!optional.isPresent()) {
            return b91;
        }
        b bVar = optional.get();
        ArrayList arrayList = new ArrayList(b91.body().size());
        List<? extends s81> body = b91.body();
        int g = bVar.g();
        for (s81 s81 : body) {
            if (!je.B(s81, "artist:likedSongsRow")) {
                arrayList.add(s81);
            } else if (g != 0) {
                int g2 = bVar.g();
                arrayList.add(s81.toBuilder().y(s81.text().toBuilder().d(this.a.getResources().getQuantityString(C0707R.plurals.artist_number_of_songs, g2, Integer.valueOf(g2), bVar.f()))).l());
            }
        }
        return je.L(b91, arrayList);
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        return s.n(sVar, this.c.c(this.b).E(), new y75(this));
    }
}
