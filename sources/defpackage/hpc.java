package defpackage;

import android.content.res.Resources;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;

/* renamed from: hpc  reason: default package */
public abstract class hpc {

    /* renamed from: hpc$a */
    private static final class a {
        static hpc a(Resources resources) {
            return d(resources, C0707R.dimen.episode_card_size_percentage_large, C0707R.dimen.episode_card_max_width_large, C0707R.dimen.episode_card_placeholder_size_large, R.style.TextAppearance_Encore_MestoBold, R.color.white, 0, C0707R.dimen.episode_card_text_offset_large, C0707R.dimen.episode_card_title_top_margin_large);
        }

        static hpc b(Resources resources) {
            return d(resources, C0707R.dimen.episode_card_size_percentage_medium, C0707R.dimen.episode_card_max_width_medium, C0707R.dimen.episode_card_placeholder_size_medium, R.style.TextAppearance_Encore_MestoBold, R.color.white, 0, C0707R.dimen.episode_card_text_offset_large, C0707R.dimen.episode_card_title_top_margin_medium);
        }

        static hpc c(Resources resources) {
            return d(resources, C0707R.dimen.episode_card_size_percentage_small, C0707R.dimen.episode_card_max_width_small, C0707R.dimen.episode_card_placeholder_size_small, R.style.TextAppearance_Encore_Mesto, R.color.gray_70, 8, C0707R.dimen.episode_card_text_offset_small, C0707R.dimen.episode_card_title_top_margin_small);
        }

        private static gpc d(Resources resources, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int a = qoc.a(resources, i, i2);
            float f = (float) a;
            return new gpc(a, (int) (qoc.c(resources, C0707R.dimen.episode_card_description_percentage) * f), (int) (qoc.c(resources, C0707R.dimen.episode_card_podcast_art_percentage) * f), resources.getDimensionPixelSize(i3), i4, i5, i6, resources.getDimensionPixelSize(i7), resources.getDimensionPixelSize(i8));
        }
    }

    public static hpc c(Resources resources, int i) {
        if (i == 1) {
            return a.b(resources);
        }
        if (i != 2) {
            return a.c(resources);
        }
        return a.a(resources);
    }

    public abstract int a();

    public abstract int b();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();
}
