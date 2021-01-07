package com.spotify.music.playlist.extender;

import com.spotify.music.playlist.extender.model.RecTrack;
import com.spotify.playlist.models.o;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ List a;

    public /* synthetic */ b(List list) {
        this.a = list;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List<RecTrack> list = this.a;
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (RecTrack recTrack : list) {
            o oVar = (o) map.get(recTrack.getUri());
            if (oVar != null) {
                RecTrack.a builder = recTrack.toBuilder();
                builder.b(oVar.isCurrentlyPlayable());
                builder.a(oVar.isExplicit());
                builder.c(oVar.getIs19plus());
                arrayList.add(builder.build());
            } else {
                arrayList.add(recTrack);
            }
        }
        return arrayList;
    }
}
