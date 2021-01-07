package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* renamed from: sa0  reason: default package */
public class sa0 {
    private final ha0 a = new ha0();
    private final b b = new b(null);

    /* renamed from: sa0$b */
    public static class b {
        b(a aVar) {
        }

        public ia0 a(Context context, ViewGroup viewGroup) {
            ja0 ja0 = new ja0(LayoutInflater.from(context).inflate(C0707R.layout.solar_sectionheader, viewGroup, false));
            ja0.getView().setTag(C0707R.id.glue_viewholder_tag, ja0);
            return ja0;
        }

        public ia0 b(Context context, ViewGroup viewGroup) {
            ja0 ja0 = new ja0(LayoutInflater.from(context).inflate(C0707R.layout.solar_sectionheader_extra_small, viewGroup, false));
            ja0.getView().setTag(C0707R.id.glue_viewholder_tag, ja0);
            return ja0;
        }

        public ia0 c(Context context, ViewGroup viewGroup) {
            ja0 ja0 = new ja0(LayoutInflater.from(context).inflate(C0707R.layout.solar_sectionheader_large, viewGroup, false));
            ja0.getView().setTag(C0707R.id.glue_viewholder_tag, ja0);
            return ja0;
        }

        public ia0 d(Context context, ViewGroup viewGroup) {
            ja0 ja0 = new ja0(LayoutInflater.from(context).inflate(C0707R.layout.solar_sectionheader_small, viewGroup, false));
            ja0.getView().setTag(C0707R.id.glue_viewholder_tag, ja0);
            return ja0;
        }

        public oa0 e(Context context, ViewGroup viewGroup) {
            pa0 pa0 = new pa0(LayoutInflater.from(context).inflate(C0707R.layout.solar_sectionheader_with_metadata, viewGroup, false));
            pa0.getView().setTag(C0707R.id.glue_viewholder_tag, pa0);
            return pa0;
        }

        public qa0 f(Context context, ViewGroup viewGroup) {
            ra0 ra0 = new ra0(LayoutInflater.from(context).inflate(C0707R.layout.solar_sectionheader_with_subtitle, viewGroup, false));
            ra0.getView().setTag(C0707R.id.glue_viewholder_tag, ra0);
            return ra0;
        }
    }

    public ia0 a(Context context, ViewGroup viewGroup) {
        this.a.getClass();
        ja0 ja0 = new ja0(LayoutInflater.from(context).inflate(C0707R.layout.glue_sectionheader_large, viewGroup, false));
        ja0.getView().setTag(C0707R.id.glue_viewholder_tag, ja0);
        return ja0;
    }

    public qa0 b(Context context, ViewGroup viewGroup) {
        this.a.getClass();
        ra0 ra0 = new ra0(LayoutInflater.from(context).inflate(C0707R.layout.glue_sectionheader_large_description, viewGroup, false));
        ra0.getView().setTag(C0707R.id.glue_viewholder_tag, ra0);
        return ra0;
    }

    public ka0 c(Context context, ViewGroup viewGroup) {
        this.a.getClass();
        la0 la0 = new la0(LayoutInflater.from(context).inflate(C0707R.layout.glue_setionheader_large_description_icon, viewGroup, false));
        la0.getView().setTag(C0707R.id.glue_viewholder_tag, la0);
        return la0;
    }

    public ia0 d(Context context, ViewGroup viewGroup) {
        this.a.getClass();
        ja0 ja0 = new ja0(LayoutInflater.from(context).inflate(C0707R.layout.glue_sectionheader_small, viewGroup, false));
        ja0.getView().setTag(C0707R.id.glue_viewholder_tag, ja0);
        return ja0;
    }

    public qa0 e(Context context, ViewGroup viewGroup) {
        this.a.getClass();
        ra0 ra0 = new ra0(LayoutInflater.from(context).inflate(C0707R.layout.glue_sectionheader_small_description, viewGroup, false));
        ra0.getView().setTag(C0707R.id.glue_viewholder_tag, ra0);
        return ra0;
    }

    public ma0 f(Context context, ViewGroup viewGroup) {
        this.a.getClass();
        na0 na0 = new na0(LayoutInflater.from(context).inflate(C0707R.layout.glue_sectionheader_small_icon, (ViewGroup) null, false));
        na0.getView().setTag(C0707R.id.glue_viewholder_tag, na0);
        return na0;
    }

    public b g() {
        return this.b;
    }
}
