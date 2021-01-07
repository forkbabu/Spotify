package defpackage;

import com.spotify.searchview.proto.EntityType;
import com.spotify.searchview.proto.RecommendationsType;

/* renamed from: owa  reason: default package */
public interface owa<T> extends pwa<T> {
    String b(RecommendationsType recommendationsType, String str);

    String c(EntityType entityType);
}
