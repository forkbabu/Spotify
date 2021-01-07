package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replycard.ReplyCardEpisodePage;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.music.libs.podcast.download.f0;
import com.spotify.podcastinteractivity.qna.model.proto.Response;
import com.spotify.podcastinteractivity.qna.model.proto.UserInfo;
import com.spotify.podcastinteractivity.qna.proto.Timestamp;
import kotlin.jvm.internal.h;

/* renamed from: fvc  reason: default package */
public final class fvc {
    private final pvc a;
    private final Context b;

    public fvc(pvc pvc, Context context) {
        h.e(pvc, "podcastQnADateUtils");
        h.e(context, "context");
        this.a = pvc;
        this.b = context;
    }

    public final ReplyCardEpisodePage.Model a(Response response) {
        h.e(response, "response");
        String m = response.m();
        pvc pvc = this.a;
        Timestamp l = response.l();
        h.d(l, "this.repliedAt");
        Resources resources = this.b.getResources();
        h.d(resources, "context.resources");
        String a2 = pvc.a(l, resources);
        UserInfo n = response.n();
        h.d(n, "this.userInfo");
        String i = n.i();
        UserInfo n2 = response.n();
        h.d(n2, "this.userInfo");
        Artwork.ImageData imageData = new Artwork.ImageData(n2.l());
        UserInfo n3 = response.n();
        h.d(n3, "this.userInfo");
        String a3 = f0.a(n3.i());
        h.d(a3, "ProfileSignature.getSign…his.userInfo.displayName)");
        Context context = this.b;
        UserInfo n4 = response.n();
        h.d(n4, "this.userInfo");
        return new ReplyCardEpisodePage.Model(m, a2, i, new Artwork.Model.User(imageData, a3, iqa.a(context, n4.i()), false, 8, null));
    }
}
