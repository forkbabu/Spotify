package com.spotify.music.features.editplaylist.operations;

import android.net.Uri;
import android.os.Parcelable;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.k;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.q;
import java.util.HashMap;
import java.util.List;

public abstract class u implements Parcelable {

    public interface a {
    }

    public static u a(k kVar) {
        j j = kVar.j();
        return new o(j.j(), Uri.parse(q.c(j.c(), Covers.Size.SMALL)), j.d(), kVar.getItems(), j.r(), j.w(), j.x());
    }

    public abstract String b();

    public abstract Uri c();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract List<l> h();

    public abstract String i();

    public HashMap<String, Integer> j() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < h().size(); i++) {
            hashMap.put(h().get(i).f(), Integer.valueOf(i));
        }
        return hashMap;
    }

    public abstract a k();
}
