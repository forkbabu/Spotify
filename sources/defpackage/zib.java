package defpackage;

import com.spotify.music.C0707R;
import com.spotify.music.marketingformats.constants.MarketingFormatsCustomKey;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: zib  reason: default package */
public final class zib {
    public static final a a = new a(null);

    /* renamed from: zib$a */
    public static final class a {
        public a(f fVar) {
        }

        public final String a(s81 s81) {
            h.e(s81, "data");
            return s81.custom().string("appearance");
        }

        public final String b(s81 s81) {
            h.e(s81, "data");
            x81 background = s81.images().background();
            if (background != null) {
                return background.uri();
            }
            return null;
        }

        public final String c(s81 s81) {
            h.e(s81, "data");
            return s81.custom().string("backgroundVideoUrl");
        }

        public final String d(s81 s81) {
            h.e(s81, "data");
            return s81.metadata().string(MarketingFormatsCustomKey.KEY_URI.d());
        }

        public final int e(String str) {
            return (str != null && str.hashCode() == 3075958 && str.equals("dark")) ? C0707R.color.text_color_dark_label : C0707R.color.text_color_light_label;
        }

        public final int f(String str) {
            return (str != null && str.hashCode() == 3075958 && str.equals("dark")) ? C0707R.color.text_color_dark_metadata : C0707R.color.text_color_light_metadata;
        }

        public final int g(String str) {
            return (str != null && str.hashCode() == 3075958 && str.equals("dark")) ? C0707R.color.text_color_dark_subtitle : C0707R.color.text_color_light_subtitle;
        }

        public final int h(String str) {
            return (str != null && str.hashCode() == 3075958 && str.equals("dark")) ? C0707R.color.text_color_dark_title : C0707R.color.text_color_light_title;
        }
    }
}
