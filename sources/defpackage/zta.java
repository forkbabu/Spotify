package defpackage;

import com.google.common.collect.FluentIterable;
import com.spotify.searchview.proto.Entity;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: zta  reason: default package */
public final class zta {
    public static List<Entity> a(List<Entity> list) {
        return FluentIterable.from(list).filter(ota.a).toList();
    }
}
