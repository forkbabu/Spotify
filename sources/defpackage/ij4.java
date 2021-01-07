package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.core.content.a;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.playlistentity.header.v0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: ij4  reason: default package */
public class ij4 implements v0, kb6 {
    private final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
    private final Context b;
    private final dj4 c;

    public ij4(Context context, dj4 dj4) {
        this.b = context;
        this.c = dj4;
    }

    private int c(h76 h76) {
        String str = (String) ImmutableMap.copyOf(h76.l().f()).getOrDefault("new_entries_count", Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        str.getClass();
        return Integer.parseInt(str);
    }

    @Override // com.spotify.music.features.playlistentity.header.v0
    public boolean a(h76 h76, String str, TextView textView) {
        String str2;
        CharSequence charSequence = "";
        String str3 = (String) ImmutableMap.copyOf(h76.l().f()).getOrDefault("last_updated", "2000-01-01:00:00:00Z");
        try {
            str3.getClass();
            str2 = this.c.f(this.a.parse(str3.replace("Z", "+00:00")).getTime());
        } catch (ParseException e) {
            Logger.e(e, "Failed to parse chart last updated date", new Object[0]);
            str2 = charSequence;
        }
        int c2 = c(h76);
        String e2 = this.c.e(c2);
        if (c2 > 0 && !str2.isEmpty()) {
            charSequence = je.y0(e2, " • ", str2);
        } else if (c2 > 0) {
            charSequence = e2;
        } else if (!str2.isEmpty()) {
            charSequence = str2;
        }
        textView.setText(charSequence);
        if (c(h76) > 0) {
            Resources resources = this.b.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C0707R.dimen.charts_chart_legend_icon_size);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new bk4(dimensionPixelSize));
            shapeDrawable.getPaint().setColor(a.b(this.b, C0707R.color.charts_legend_circle));
            shapeDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            shapeDrawable.setPadding(new Rect(0, 0, 0, 0));
            textView.setCompoundDrawables(shapeDrawable, null, null, null);
            textView.setCompoundDrawablePadding(resources.getDimensionPixelSize(C0707R.dimen.charts_header_new_entry_spacing));
        }
        return !TextUtils.isEmpty(charSequence);
    }

    @Override // defpackage.kb6
    public boolean b(h76 h76, String str, TextView textView) {
        return a(h76, str, textView);
    }
}
