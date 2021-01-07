package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: o3d  reason: default package */
public class o3d implements qud {
    private final Context a;
    private final Drawable b;
    private final int c;

    public o3d(Context context, SpotifyIconV2 spotifyIconV2) {
        this.a = context;
        int g = nud.g(48.0f, context.getResources());
        this.c = g;
        int g2 = nud.g(16.0f, context.getResources());
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) (g - (g2 * 2)));
        spotifyIconDrawable.r(-1);
        this.b = new InsetDrawable((Drawable) spotifyIconDrawable, g2);
    }

    public Drawable b() {
        return new LayerDrawable(new Drawable[]{new ColorDrawable(a.b(this.a, R.color.gray_20)), this.b});
    }

    @Override // defpackage.pud
    public Drawable createDrawable(Bitmap bitmap) {
        Bitmap bitmap2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            bitmap2 = Bitmap.createBitmap(bitmap, (width / 2) - (height / 2), 0, height, height);
        } else {
            bitmap2 = Bitmap.createBitmap(bitmap, 0, (height / 2) - (width / 2), width, width);
        }
        n3d n3d = new n3d(this, this.a.getResources(), bitmap2);
        n3d.setColorFilter(a.b(this.a, R.color.black_40), PorterDuff.Mode.SRC_ATOP);
        return new LayerDrawable(new Drawable[]{n3d, this.b});
    }
}
