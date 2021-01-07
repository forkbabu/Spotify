package com.spotify.music.features.yourlibraryx.bottomsheet;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption;
import kotlin.NoWhenBranchMatchedException;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class a extends RecyclerView.b0 {
    private final bh9 C;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.features.yourlibraryx.bottomsheet.a$a  reason: collision with other inner class name */
    public static final class View$OnClickListenerC0266a implements View.OnClickListener {
        final /* synthetic */ cmf a;

        View$OnClickListenerC0266a(cmf cmf) {
            this.a = cmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(bh9 bh9) {
        super(bh9.a());
        h.e(bh9, "binding");
        this.C = bh9;
    }

    public final void h0(YourLibraryXSortOption yourLibraryXSortOption, boolean z, cmf<f> cmf) {
        int i;
        h.e(yourLibraryXSortOption, "sortOption");
        h.e(cmf, "clickListener");
        ConstraintLayout a = this.C.a();
        h.d(a, "binding.root");
        a.setActivated(z);
        TextView textView = this.C.b;
        h.d(textView, "binding.sortOptionTitleText");
        ConstraintLayout a2 = this.C.a();
        h.d(a2, "binding.root");
        Context context = a2.getContext();
        h.d(context, "binding.root.context");
        h.e(yourLibraryXSortOption, "$this$displayName");
        h.e(context, "context");
        int ordinal = yourLibraryXSortOption.ordinal();
        if (ordinal == 0) {
            i = C0707R.string.your_library_sort_order_most_relevant;
        } else if (ordinal == 1) {
            i = C0707R.string.your_library_sort_order_recently_played;
        } else if (ordinal == 2) {
            i = C0707R.string.your_library_sort_order_recently_added;
        } else if (ordinal == 3) {
            i = C0707R.string.your_library_sort_order_alphabetical;
        } else if (ordinal == 4) {
            i = C0707R.string.your_library_sort_order_creator;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        String string = context.getString(i);
        h.d(string, "when (this) {\n    ALPHAB…{ context.getString(it) }");
        textView.setText(string);
        this.C.a().setOnClickListener(new View$OnClickListenerC0266a(cmf));
    }
}
