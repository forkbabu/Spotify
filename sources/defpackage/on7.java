package defpackage;

import com.spotify.music.features.profile.editprofile.EditProfileActivity;
import com.spotify.music.features.profile.editprofile.n;

/* renamed from: on7  reason: default package */
public final class on7 {
    private final wlf<to7> a;
    private final wlf<n> b;

    public on7(wlf<to7> wlf, wlf<n> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public nn7 b(EditProfileActivity editProfileActivity, mn7 mn7) {
        to7 to7 = this.a.get();
        a(to7, 1);
        n nVar = this.b.get();
        a(nVar, 2);
        a(editProfileActivity, 3);
        a(mn7, 4);
        return new nn7(to7, nVar, editProfileActivity, mn7);
    }
}
