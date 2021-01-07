package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import defpackage.yrc;

/* renamed from: shc  reason: default package */
public class shc implements yrc {
    private final Context a;

    /* renamed from: shc$a */
    public static class a extends csc {
        public a() {
            c(false);
        }
    }

    /* renamed from: shc$b */
    public static class b extends yrc.a {
        private final gb0 C;

        public b(gb0 gb0) {
            super(gb0.getView());
            this.C = gb0;
        }
    }

    public shc(Context context) {
        this.a = context;
    }

    @Override // defpackage.yrc
    public /* synthetic */ void a() {
        xrc.b(this);
    }

    @Override // defpackage.yrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
    }

    @Override // defpackage.yrc
    public /* synthetic */ void d(csc csc, RecyclerView.b0 b0Var) {
        xrc.a(this, csc, b0Var);
    }

    @Override // defpackage.yrc
    public yrc.a e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = this.a;
        gb0 a2 = e90.c().a(context, null);
        TextView titleView = a2.getTitleView();
        TextView subtitleView = a2.getSubtitleView();
        titleView.setSingleLine(false);
        titleView.setEllipsize(null);
        subtitleView.setSingleLine(false);
        subtitleView.setEllipsize(null);
        a2.setSubtitle(context.getString(C0707R.string.placeholder_collection_empty_show_body));
        a2.b2(false);
        a2.getTitleView().setVisibility(8);
        a2.setSubtitle(this.a.getString(C0707R.string.placeholder_collection_empty_show_body));
        return new b(a2);
    }
}
