package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.podcast.ui.topic.g;
import com.spotify.music.podcast.ui.topic.h;
import defpackage.yrc;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wfc  reason: default package */
public class wfc implements yrc {
    private final Context a;

    /* renamed from: wfc$a */
    public static class a extends csc {
        List<g> b = new ArrayList();
    }

    /* renamed from: wfc$b */
    public static class b extends yrc.a {
        public final h C;

        public b(h hVar) {
            super(hVar.getView());
            this.C = hVar;
        }
    }

    public wfc(Context context) {
        this.a = context;
    }

    @Override // defpackage.yrc
    public /* synthetic */ void a() {
        xrc.b(this);
    }

    @Override // defpackage.yrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
        ((b) b0Var).C.b(((a) csc).b, null);
    }

    @Override // defpackage.yrc
    public /* synthetic */ void d(csc csc, RecyclerView.b0 b0Var) {
        xrc.a(this, csc, b0Var);
    }

    @Override // defpackage.yrc
    public yrc.a e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h c = h.c(this.a, viewGroup, C0707R.dimen.podcast_topics_section_spacing);
        View view = c.getView();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(view.getLayoutParams());
        marginLayoutParams.topMargin = this.a.getResources().getDimensionPixelSize(C0707R.dimen.podcast_topics_section_spacing);
        view.setLayoutParams(marginLayoutParams);
        return new b(c);
    }
}
