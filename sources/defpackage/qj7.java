package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.Locale;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: qj7  reason: default package */
public class qj7 implements tc0 {
    private static final Pattern b = Pattern.compile("_");
    private View a;

    qj7() {
    }

    private SpotifyIconDrawable b(Context context, String str) {
        int b2 = a.b(context, R.color.white);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.valueOf(str.toUpperCase(Locale.US)), (float) context.getResources().getDimensionPixelSize(C0707R.dimen.premium_benefit_chart_component_icon));
        spotifyIconDrawable.r(b2);
        return spotifyIconDrawable;
    }

    public void a(View view, s81 s81) {
        SpotifyIconDrawable spotifyIconDrawable;
        View findViewById = view.findViewById(C0707R.id.logo_container);
        this.a = findViewById;
        ImageView imageView = (ImageView) findViewById.findViewById(C0707R.id.logo);
        String icon = s81.images().icon();
        SpotifyIconDrawable spotifyIconDrawable2 = null;
        if (icon == null) {
            Assertion.g("visual header icon missing");
        } else {
            String upperCase = icon.toUpperCase(Locale.US);
            String replaceAll = b.matcher(upperCase).replaceAll("");
            try {
                spotifyIconDrawable = c(imageView, upperCase);
            } catch (Exception unused) {
                spotifyIconDrawable = null;
            }
            if (spotifyIconDrawable == null) {
                try {
                    spotifyIconDrawable2 = d(imageView, replaceAll);
                } catch (Exception e) {
                    Assertion.i("Unable to parse icon as " + upperCase + " or " + replaceAll, e);
                }
            } else {
                spotifyIconDrawable2 = spotifyIconDrawable;
            }
        }
        imageView.setImageDrawable(spotifyIconDrawable2);
    }

    public /* synthetic */ SpotifyIconDrawable c(ImageView imageView, String str) {
        return b(imageView.getContext(), str);
    }

    public /* synthetic */ SpotifyIconDrawable d(ImageView imageView, String str) {
        return b(imageView.getContext(), str);
    }

    @Override // defpackage.tc0
    public void e0(int i, float f) {
        View view = this.a;
        if (view != null) {
            view.setAlpha(1.0f - (f * 1.3f));
        }
    }
}
