package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.spotify.music.coverimage.CoverImageActivity;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: e47  reason: default package */
public class e47 implements d47 {
    private final InteractionLogger a;
    private final String b;

    public e47(InteractionLogger interactionLogger, String str) {
        this.a = interactionLogger;
        this.b = str;
    }

    @Override // defpackage.d47
    public void a(Context context, ImageView imageView, Uri uri) {
        this.a.a(this.b, "cover-art", -1, InteractionLogger.InteractionType.HIT, "cover-art-clicked");
        int i = CoverImageActivity.P;
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        CoverImageActivity.X0(context, iArr[0], iArr[1], imageView.getWidth(), imageView.getHeight(), uri, context.getResources().getConfiguration().orientation);
    }
}
