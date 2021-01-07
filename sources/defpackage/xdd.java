package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.sociallistening.participantlist.impl.g;
import com.squareup.picasso.Picasso;

/* renamed from: xdd  reason: default package */
public final class xdd {
    private final wlf<g> a;
    private final wlf<x9d> b;
    private final wlf<Picasso> c;
    private final wlf<Activity> d;

    public xdd(wlf<g> wlf, wlf<x9d> wlf2, wlf<Picasso> wlf3, wlf<Activity> wlf4) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public wdd b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        a(layoutInflater, 1);
        LayoutInflater layoutInflater2 = layoutInflater;
        g gVar = this.a.get();
        a(gVar, 3);
        g gVar2 = gVar;
        x9d x9d = this.b.get();
        a(x9d, 4);
        x9d x9d2 = x9d;
        Picasso picasso = this.c.get();
        a(picasso, 5);
        Picasso picasso2 = picasso;
        Activity activity = this.d.get();
        a(activity, 6);
        return new wdd(layoutInflater2, viewGroup, gVar2, x9d2, picasso2, activity);
    }
}
