package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.g;
import com.spotify.music.C0707R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ai6  reason: default package */
class ai6 {
    private final Context a;
    private final SnackbarManager b;
    private final g c;

    public ai6(SnackbarManager snackbarManager, Context context, g gVar) {
        this.a = context;
        this.b = snackbarManager;
        this.c = gVar;
    }

    public void a() {
        SpannableString spannableString = new SpannableString(this.a.getString(C0707R.string.playlist_shuffle_dialog_preview_education_body, "ICON_ICON"));
        Matcher matcher = Pattern.compile("ICON_ICON").matcher(spannableString);
        if (matcher.find()) {
            Drawable g = l70.g(this.a, (float) nud.q(16.0f, this.a.getResources()));
            g.setBounds(0, 0, g.getIntrinsicWidth(), g.getIntrinsicHeight());
            spannableString.setSpan(new ImageSpan(g, 1), matcher.start(), matcher.end(), 17);
        }
        f c2 = this.c.c(this.a.getString(C0707R.string.playlist_shuffle_dialog_preview_education_title), spannableString);
        c2.f(this.a.getString(C0707R.string.playlist_shuffle_dialog_preview_education_button), hh6.a);
        c2.b().a();
    }

    public void b() {
        je.e(C0707R.string.playlist_preview_education_message, this.b);
    }
}
