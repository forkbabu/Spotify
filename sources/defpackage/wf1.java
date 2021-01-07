package defpackage;

import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.libs.podcast.loader.m;
import io.reactivex.functions.l;

/* renamed from: wf1  reason: default package */
public final /* synthetic */ class wf1 implements l {
    public final /* synthetic */ m a;

    public /* synthetic */ wf1(m mVar) {
        this.a = mVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        m mVar = this.a;
        mVar.b().i((SortOption) obj);
        return mVar.a();
    }
}
