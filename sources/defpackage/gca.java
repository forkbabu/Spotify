package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.v;
import io.reactivex.x;

/* renamed from: gca  reason: default package */
public final /* synthetic */ class gca implements v {
    public final /* synthetic */ Fragment a;

    public /* synthetic */ gca(Fragment fragment) {
        this.a = fragment;
    }

    @Override // io.reactivex.v
    public final void subscribe(x xVar) {
        Fragment fragment = this.a;
        String str = null;
        String path = fragment instanceof mfd ? ((mfd) fragment).g1().path() : null;
        if (fragment instanceof c.a) {
            str = ((c.a) fragment).getViewUri().toString();
        }
        xVar.onNext(new u3(path, str));
    }
}
