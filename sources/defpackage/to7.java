package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.features.profile.editprofile.EditProfileActivity;
import com.spotify.music.features.profile.editprofile.p;
import com.spotify.remoteconfig.s6;
import io.reactivex.y;

/* renamed from: to7  reason: default package */
public final class to7 {
    private final wlf<lqa> a;
    private final wlf<s6> b;
    private final wlf<y> c;
    private final wlf<qu7> d;
    private final wlf<p> e;

    public to7(wlf<lqa> wlf, wlf<s6> wlf2, wlf<y> wlf3, wlf<qu7> wlf4, wlf<p> wlf5) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public so7 b(EditProfileActivity editProfileActivity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        a(editProfileActivity, 1);
        a(layoutInflater, 2);
        lqa lqa = this.a.get();
        a(lqa, 4);
        lqa lqa2 = lqa;
        s6 s6Var = this.b.get();
        a(s6Var, 5);
        s6 s6Var2 = s6Var;
        y yVar = this.c.get();
        a(yVar, 6);
        y yVar2 = yVar;
        qu7 qu7 = this.d.get();
        a(qu7, 7);
        qu7 qu72 = qu7;
        p pVar = this.e.get();
        a(pVar, 8);
        return new so7(editProfileActivity, layoutInflater, viewGroup, lqa2, s6Var2, yVar2, qu72, pVar);
    }
}
