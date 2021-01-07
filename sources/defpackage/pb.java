package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pb  reason: default package */
public class pb {
    private final List<jb<h, Path>> a;
    private final List<jb<Integer, Integer>> b;
    private final List<Mask> c;

    public pb(List<Mask> list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(list.get(i).b().a());
            this.b.add(list.get(i).c().a());
        }
    }

    public List<jb<h, Path>> a() {
        return this.a;
    }

    public List<Mask> b() {
        return this.c;
    }

    public List<jb<Integer, Integer>> c() {
        return this.b;
    }
}
