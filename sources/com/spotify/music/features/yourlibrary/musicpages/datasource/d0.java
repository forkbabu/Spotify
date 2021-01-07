package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.playlist.models.b;
import io.reactivex.functions.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final /* synthetic */ class d0 implements c {
    public static final /* synthetic */ d0 a = new d0();

    private /* synthetic */ d0() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        boolean z;
        String str = (String) obj2;
        ArrayList arrayList = new ArrayList(0);
        for (b bVar : (List) obj) {
            if (str.isEmpty()) {
                z = true;
            } else {
                StringBuilder S0 = je.S0(' ');
                S0.append(bVar.f().toLowerCase(Locale.getDefault()));
                String sb = S0.toString();
                StringBuilder S02 = je.S0(' ');
                S02.append(str.toLowerCase(Locale.getDefault()));
                z = sb.contains(S02.toString());
            }
            if (z) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }
}
