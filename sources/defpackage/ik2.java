package defpackage;

import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import io.reactivex.functions.g;

/* renamed from: ik2  reason: default package */
public final /* synthetic */ class ik2 implements g {
    public final /* synthetic */ jk2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ ik2(jk2 jk2, String str) {
        this.a = jk2;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, (TrackAnnotationSet) obj);
    }
}
