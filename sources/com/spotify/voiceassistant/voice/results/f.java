package com.spotify.voiceassistant.voice.results;

import com.google.common.base.Optional;
import com.spotify.voice.results.model.e;
import com.spotify.voiceassistant.player.models.metadata.Image;
import com.spotify.voiceassistant.player.models.metadata.MetadataItem;
import io.reactivex.internal.operators.maybe.b;
import io.reactivex.l;
import java.util.List;
import kotlin.jvm.internal.h;

public final class f implements nmf<h, l<e.a>> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public l<e.a> invoke(h hVar) {
        Optional<String> url;
        h hVar2 = hVar;
        h.e(hVar2, "metaDataWrapper");
        MetadataItem b = hVar2.b();
        boolean a = hVar2.a();
        String orNull = b.displayName().orNull();
        String orNull2 = b.uri().orNull();
        List<Image> orNull3 = b.artwork().orNull();
        String str = null;
        boolean z = true;
        if (orNull3 != null) {
            Object[] array = orNull3.toArray(new Image[0]);
            if (array != null) {
                Image[] imageArr = (Image[]) array;
                h.e(imageArr, "$this$firstOrNull");
                Image image = imageArr.length == 0 ? null : imageArr[0];
                if (!(image == null || (url = image.getUrl()) == null)) {
                    str = url.orNull();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        String or = b.subtitle().or((Optional<String>) "");
        Boolean or2 = b.explicit().or((Optional<Boolean>) Boolean.FALSE);
        if (!(orNull == null || orNull.length() == 0)) {
            if (!(orNull2 == null || orNull2.length() == 0)) {
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    boolean a2 = ngf.a(orNull2);
                    h.d(or2, "explicit");
                    l<e.a> k = l.k(e.a.b(orNull, str, orNull2, orNull2, a, or, or2.booleanValue(), a2));
                    h.d(k, "Maybe.just(\n            …          )\n            )");
                    return k;
                }
            }
        }
        b bVar = b.a;
        h.d(bVar, "Maybe.empty()");
        return bVar;
    }
}
