package defpackage;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: m3c  reason: default package */
public final class m3c {
    public static final List<ContextTrack> a(List<? extends ContextTrack> list) {
        h.e(list, "$this$filterHiddenTracks");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (!Boolean.parseBoolean((String) je.e0(t, "$this$isHidden", ContextTrack.Metadata.KEY_HIDDEN))) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
