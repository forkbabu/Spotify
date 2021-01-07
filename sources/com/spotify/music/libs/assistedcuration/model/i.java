package com.spotify.music.libs.assistedcuration.model;

import android.os.Bundle;
import com.spotify.music.libs.assistedcuration.model.g;
import java.util.ArrayList;
import java.util.List;

public abstract class i {

    public interface a {
        a a(List<byte[]> list);

        a b(int i);

        i build();

        a c(String str);
    }

    public static a a() {
        return new g.b();
    }

    public static i e(Bundle bundle) {
        int i = bundle.getInt("cards_state_length", 0);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(bundle.getByteArray("cards_state_item" + i2));
        }
        g.b bVar = new g.b();
        bVar.a(arrayList);
        g.b bVar2 = bVar;
        bVar2.b(bundle.getInt("cards_count", 0));
        g.b bVar3 = bVar2;
        bVar3.c(bundle.getString("current_card_id"));
        return bVar3.build();
    }

    public abstract int b();

    public abstract List<byte[]> c();

    public abstract String d();
}
