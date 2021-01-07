package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import defpackage.zn4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ao4  reason: default package */
public class ao4 {
    private static final Pattern c = Pattern.compile("==", 16);
    private final WeakReference<Context> a;
    private List<zn4> b;

    public ao4(Context context) {
        this.a = new WeakReference<>(context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: android.text.SpannableStringBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    private static zn4.b a(Context context, String str, String str2) {
        if (str2.contains("==")) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.DEVICES, (float) nud.g(17.0f, context.getResources()));
            spotifyIconDrawable.r(a.b(context, R.color.gray_50));
            spotifyIconDrawable.setBounds(0, 0, spotifyIconDrawable.getIntrinsicWidth(), spotifyIconDrawable.getIntrinsicHeight());
            String replaceAll = c.matcher(str2).replaceAll(Matcher.quoteReplacement("\n=="));
            spannableStringBuilder.append((CharSequence) replaceAll);
            spannableStringBuilder.setSpan(new ImageSpan(spotifyIconDrawable, 0), replaceAll.indexOf("\n=="), replaceAll.indexOf("\n==") + 3, 17);
            str2 = spannableStringBuilder;
        }
        return new zn4.b(str, str2);
    }

    public List<zn4> b() {
        zn4 zn4;
        zn4 zn42;
        zn4 zn43;
        zn4 zn44;
        zn4 zn45;
        zn4 zn46;
        if (this.b == null) {
            ArrayList arrayList = new ArrayList(6);
            Context context = this.a.get();
            if (context == null) {
                zn4 = zn4.a();
            } else {
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(a(context, context.getString(C0707R.string.connect_education_step_computer_1), context.getString(C0707R.string.connect_education_step_computer_description_1)));
                arrayList2.add(a(context, context.getString(C0707R.string.connect_education_step_computer_2), context.getString(C0707R.string.connect_education_step_computer_description_2)));
                arrayList2.add(a(context, context.getString(C0707R.string.connect_education_step_computer_3), context.getString(C0707R.string.connect_education_step_computer_description_3)));
                zn4 = new zn4(0, context.getString(C0707R.string.connect_education_title_computer), context.getString(C0707R.string.connect_education_step_additional_computer), "https://www.spotify.com/connect/?utm_source=spotify%26utm_medium=android_app%26utm_campaign=connect_devicemenu_tutorial", context.getString(C0707R.string.connect_education_short_description_computer), arrayList2);
            }
            arrayList.add(zn4);
            Context context2 = this.a.get();
            if (context2 == null) {
                zn42 = zn4.a();
            } else {
                ArrayList arrayList3 = new ArrayList(3);
                arrayList3.add(a(context2, context2.getString(C0707R.string.connect_education_step_tv_1), context2.getString(C0707R.string.connect_education_step_tv_description_1)));
                arrayList3.add(a(context2, context2.getString(C0707R.string.connect_education_step_tv_2), context2.getString(C0707R.string.connect_education_step_tv_description_2)));
                arrayList3.add(a(context2, context2.getString(C0707R.string.connect_education_step_tv_3), context2.getString(C0707R.string.connect_education_step_tv_description_3)));
                zn42 = new zn4(1, context2.getString(C0707R.string.connect_education_title_tv), context2.getString(C0707R.string.connect_education_step_additional_tv), "https://www.spotify.com/tv/?utm_source=spotify%26utm_medium=android_app%26utm_campaign=connect_devicemenu_tutorial", context2.getString(C0707R.string.connect_education_short_description_tv), arrayList3);
            }
            arrayList.add(zn42);
            Context context3 = this.a.get();
            if (context3 == null) {
                zn43 = zn4.a();
            } else {
                ArrayList arrayList4 = new ArrayList(3);
                arrayList4.add(a(context3, context3.getString(C0707R.string.connect_education_step_speaker_1), context3.getString(C0707R.string.connect_education_step_speaker_description_1)));
                arrayList4.add(a(context3, context3.getString(C0707R.string.connect_education_step_speaker_2), context3.getString(C0707R.string.connect_education_step_speaker_description_2)));
                arrayList4.add(a(context3, context3.getString(C0707R.string.connect_education_step_speaker_3), context3.getString(C0707R.string.connect_education_step_speaker_description_3)));
                zn43 = new zn4(2, context3.getString(C0707R.string.connect_education_title_speaker), context3.getString(C0707R.string.connect_education_step_additional_speaker), "https://www.spotify.com/speakers/?utm_source=spotify%26utm_medium=android_app%26utm_campaign=connect_devicemenu_tutorial", context3.getString(C0707R.string.connect_education_short_description_speaker), arrayList4);
            }
            arrayList.add(zn43);
            Context context4 = this.a.get();
            if (context4 == null) {
                zn44 = zn4.a();
            } else {
                ArrayList arrayList5 = new ArrayList(3);
                arrayList5.add(a(context4, null, context4.getString(C0707R.string.connect_education_step_gameconsole_description_1)));
                arrayList5.add(a(context4, context4.getString(C0707R.string.connect_education_step_gameconsole_title_ps), context4.getString(C0707R.string.connect_education_step_gameconsole_description_ps)));
                arrayList5.add(a(context4, context4.getString(C0707R.string.connect_education_step_gameconsole_title_xbox), context4.getString(C0707R.string.connect_education_step_gameconsole_description_xbox)));
                zn44 = new zn4(3, context4.getString(C0707R.string.connect_education_title_gameconsole), null, null, null, arrayList5);
            }
            arrayList.add(zn44);
            Context context5 = this.a.get();
            if (context5 == null) {
                zn45 = zn4.a();
            } else {
                ArrayList arrayList6 = new ArrayList(3);
                arrayList6.add(a(context5, context5.getString(C0707R.string.connect_education_step_chromecast_1), context5.getString(C0707R.string.connect_education_step_chromecast_description_1)));
                arrayList6.add(a(context5, context5.getString(C0707R.string.connect_education_step_chromecast_2), context5.getString(C0707R.string.connect_education_step_chromecast_description_2)));
                arrayList6.add(a(context5, context5.getString(C0707R.string.connect_education_step_chromecast_3), context5.getString(C0707R.string.connect_education_step_chromecast_description_3)));
                zn45 = new zn4(4, context5.getString(C0707R.string.connect_education_title_chromecast), context5.getString(C0707R.string.connect_education_step_additional_chromecast), "https://www.spotify.com/chromecast/?utm_source=spotify%26utm_medium=android_app%26utm_campaign=connect_devicemenu_tutorial", null, arrayList6);
            }
            arrayList.add(zn45);
            Context context6 = this.a.get();
            if (context6 == null) {
                zn46 = zn4.a();
            } else {
                ArrayList arrayList7 = new ArrayList(4);
                arrayList7.add(a(context6, context6.getString(C0707R.string.connect_education_step_bluetooth_1), context6.getString(C0707R.string.connect_education_step_bluetooth_description_1)));
                arrayList7.add(a(context6, context6.getString(C0707R.string.connect_education_step_bluetooth_2), context6.getString(C0707R.string.connect_education_step_bluetooth_description_2)));
                arrayList7.add(a(context6, context6.getString(C0707R.string.connect_education_step_bluetooth_3), context6.getString(C0707R.string.connect_education_step_bluetooth_description_3)));
                arrayList7.add(a(context6, context6.getString(C0707R.string.connect_education_step_bluetooth_4), context6.getString(C0707R.string.connect_education_step_bluetooth_description_4)));
                zn46 = new zn4(5, context6.getString(C0707R.string.connect_education_title_bluetooth), context6.getString(C0707R.string.connect_education_step_additional_bluetooth), "android.settings.BLUETOOTH_SETTINGS", null, arrayList7);
            }
            arrayList.add(zn46);
            this.b = arrayList;
        }
        return this.b;
    }
}
