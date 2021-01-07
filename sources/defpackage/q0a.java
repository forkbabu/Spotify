package defpackage;

import com.spotify.music.libs.assistedcuration.model.GenreCluster;
import com.spotify.music.libs.assistedcuration.model.GenreResponse;
import com.spotify.music.libs.assistedcuration.model.e;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q0a  reason: default package */
public final /* synthetic */ class q0a implements l {
    public static final /* synthetic */ q0a a = new q0a();

    private /* synthetic */ q0a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List<GenreCluster> clusters = ((GenreResponse) obj).getClusters();
        ArrayList arrayList = new ArrayList(clusters.size());
        for (GenreCluster genreCluster : clusters) {
            arrayList.add(new h1a(genreCluster.getName(), e.b(genreCluster.getTracks())));
        }
        return arrayList;
    }
}
