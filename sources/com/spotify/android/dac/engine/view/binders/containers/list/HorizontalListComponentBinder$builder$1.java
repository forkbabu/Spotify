package com.spotify.android.dac.engine.view.binders.containers.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.dac.api.components.proto.HorizontalListComponent;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class HorizontalListComponentBinder$builder$1 extends Lambda implements smf<ViewGroup, HorizontalListComponent, Boolean, View> {
    final /* synthetic */ HorizontalListComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HorizontalListComponentBinder$builder$1(HorizontalListComponentBinder horizontalListComponentBinder) {
        super(3);
        this.this$0 = horizontalListComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // defpackage.smf
    public View c(ViewGroup viewGroup, HorizontalListComponent horizontalListComponent, Boolean bool) {
        ViewGroup viewGroup2 = viewGroup;
        boolean booleanValue = bool.booleanValue();
        h.e(viewGroup2, "parentView");
        h.e(horizontalListComponent, "<anonymous parameter 1>");
        View inflate = LayoutInflater.from(viewGroup2.getContext()).inflate(C0707R.layout.horizontal_list_component_layout, viewGroup2, booleanValue);
        HorizontalListComponentBinder horizontalListComponentBinder = this.this$0;
        View findViewById = inflate.findViewById(C0707R.id.horizontal_list_component_container);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        viewGroup2.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(HorizontalListComponentBinder.a(this.this$0));
        h.d(findViewById, "findViewById<RecyclerVie…                        }");
        horizontalListComponentBinder.getClass();
        h.e((RecyclerView) findViewById, "<set-?>");
        h.d(inflate, "LayoutInflater.from(pare…      }\n                }");
        return inflate;
    }
}
