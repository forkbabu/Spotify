package com.spotify.music.features.go.connection;

import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b {
    private final Map<String, a> a = new HashMap(2);

    public a a(ae5 ae5) {
        if (this.a.get(ae5.a()) != null) {
            return null;
        }
        a aVar = new a(ae5);
        this.a.put(ae5.a(), aVar);
        return aVar;
    }

    public List<a> b() {
        Collection<a> values = this.a.values();
        ArrayList arrayList = new ArrayList(2);
        for (a aVar : values) {
            if (aVar.d()) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public a c(ae5 ae5) {
        return this.a.get(ae5.a());
    }

    public void d(ae5 ae5) {
        if (this.a.remove(ae5.a()) == null) {
            Assertion.g("Connection could not be removed because it is not present.");
        }
    }
}
