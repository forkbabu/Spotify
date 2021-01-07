package defpackage;

import android.os.Bundle;
import androidx.fragment.app.o;
import com.spotify.music.features.entityselector.pages.search.SearchFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: sz4  reason: default package */
public final class sz4 {
    private final o a;

    public sz4(o oVar) {
        h.e(oVar, "fragmentManager");
        this.a = oVar;
    }

    public final void a(List<String> list, String str) {
        h.e(list, "playlistItems");
        h.e(list, "playlistItems");
        SearchFragment searchFragment = new SearchFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("playlist_items", new ArrayList<>(list));
        if (str != null) {
            bundle.putString("list_name", str);
        }
        searchFragment.r4(bundle);
        searchFragment.Y4(this.a, "search");
    }
}
