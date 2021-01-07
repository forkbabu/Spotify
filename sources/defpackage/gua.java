package defpackage;

import com.google.common.base.Optional;
import com.spotify.searchview.proto.DrillDownViewResponse;
import com.spotify.searchview.proto.EntityType;

/* renamed from: gua  reason: default package */
public abstract class gua {
    public static gua a(String str, String str2, EntityType entityType, Optional<Integer> optional, DrillDownViewResponse drillDownViewResponse) {
        return new uta(str, str2, entityType, optional, drillDownViewResponse);
    }

    public abstract EntityType b();

    public abstract Optional<Integer> c();

    public abstract String d();

    public abstract String e();

    public abstract DrillDownViewResponse f();
}
