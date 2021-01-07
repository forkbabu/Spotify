package defpackage;

import android.os.Bundle;
import androidx.fragment.app.o;
import com.spotify.music.features.entityselector.container.EntitySelectorFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: qy4  reason: default package */
public final class qy4 {
    private final o a;

    public qy4(o oVar) {
        h.e(oVar, "fragmentManager");
        this.a = oVar;
    }

    public final void a(String str, List<String> list) {
        h.e(list, "playlistItems");
        h.e(list, "playlistItems");
        EntitySelectorFragment entitySelectorFragment = new EntitySelectorFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("playlist_items", new ArrayList<>(list));
        if (str != null) {
            bundle.putString("list_name", str);
        }
        entitySelectorFragment.r4(bundle);
        entitySelectorFragment.Y4(this.a, "entity-selector");
    }
}
