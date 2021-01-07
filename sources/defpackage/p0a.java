package defpackage;

import com.spotify.music.libs.assistedcuration.model.RecentlyPlayedTracksResponse;
import io.reactivex.functions.l;

/* renamed from: p0a  reason: default package */
public final /* synthetic */ class p0a implements l {
    public static final /* synthetic */ p0a a = new p0a();

    private /* synthetic */ p0a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((RecentlyPlayedTracksResponse) obj).getTracks();
    }
}
