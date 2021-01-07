package defpackage;

import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosResponse$PodcastSegmentsResponse;
import io.reactivex.functions.l;

/* renamed from: z77  reason: default package */
public final /* synthetic */ class z77 implements l {
    public final /* synthetic */ c87 a;
    public final /* synthetic */ String b;

    public /* synthetic */ z77(c87 c87, String str) {
        this.a = c87;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (PodcastSegmentsCosmosResponse$PodcastSegmentsResponse) obj);
    }
}
