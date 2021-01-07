package com.spotify.music.podcast.freetierlikes.tabs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.o;

public class g implements f {
    private static final String c = ViewUris.i.toString();
    private final o a;
    private final i b;

    public g(o oVar, i iVar) {
        this.a = oVar;
        this.b = iVar;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.f
    public View a(Context context, ViewGroup viewGroup, c cVar) {
        a aVar = new a(this, context);
        String e = cVar.e();
        CharSequence d = cVar.d();
        String c2 = cVar.c();
        lb0 a2 = pb0.a(context, viewGroup);
        a2.getView().setBackgroundColor(0);
        a2.setTitle(e);
        a2.setSubtitle(d);
        a2.E(c2);
        a2.i().setOnClickListener(aVar);
        a2.getView().setId(C0707R.id.empty_state_view);
        NestedScrollView nestedScrollView = new NestedScrollView(context, null);
        nestedScrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        nestedScrollView.addView(a2.getView());
        nestedScrollView.setFillViewport(true);
        nestedScrollView.setId(C0707R.id.empty);
        return nestedScrollView;
    }

    public /* synthetic */ void b(Context context, View view) {
        o oVar = this.a;
        String str = c;
        context.startActivity(oVar.b(n.a(str).a()));
        this.b.a(str);
    }
}
