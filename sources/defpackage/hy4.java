package defpackage;

import android.app.Activity;
import com.spotify.music.features.editplaylist.dialog.SavePlaylistDialog;
import com.spotify.music.imagepicker.c;
import com.squareup.picasso.Picasso;
import defpackage.fy4;
import defpackage.iw4;

/* renamed from: hy4  reason: default package */
public final class hy4 implements fy4.a {
    private final wlf<Picasso> a;
    private final wlf<Activity> b;
    private final wlf<iw4.a> c;
    private final wlf<c> d;
    private final wlf<SavePlaylistDialog> e;

    public hy4(wlf<Picasso> wlf, wlf<Activity> wlf2, wlf<iw4.a> wlf3, wlf<c> wlf4, wlf<SavePlaylistDialog> wlf5) {
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

    public fy4 b(px4 px4) {
        Picasso picasso = this.a.get();
        a(picasso, 1);
        Picasso picasso2 = picasso;
        Activity activity = this.b.get();
        a(activity, 2);
        Activity activity2 = activity;
        iw4.a aVar = this.c.get();
        a(aVar, 3);
        iw4.a aVar2 = aVar;
        c cVar = this.d.get();
        a(cVar, 4);
        c cVar2 = cVar;
        SavePlaylistDialog savePlaylistDialog = this.e.get();
        a(savePlaylistDialog, 5);
        a(px4, 6);
        return new gy4(picasso2, activity2, aVar2, cVar2, savePlaylistDialog, px4);
    }
}
