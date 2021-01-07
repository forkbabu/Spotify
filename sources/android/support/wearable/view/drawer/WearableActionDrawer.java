package android.support.wearable.view.drawer;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.wearable.view.drawer.c;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

@Deprecated
public class WearableActionDrawer extends WearableDrawerView {
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final boolean F;
    private final ImageView G;
    private final ImageView H;
    private d I;
    private final RecyclerView.e<RecyclerView.b0> J;
    private Menu K;
    private CharSequence L;
    private final RecyclerView x;
    private final int y;
    private final int z;

    /* access modifiers changed from: package-private */
    public class a implements c.AbstractC0014c {
        a() {
        }
    }

    private final class b extends RecyclerView.b0 {
        public final View C;
        public final ImageView D;
        public final TextView E;

        public b(WearableActionDrawer wearableActionDrawer, View view) {
            super(view);
            this.C = view;
            ImageView imageView = (ImageView) view.findViewById(C0707R.id.wearable_support_action_drawer_item_icon);
            this.D = imageView;
            ((LinearLayout.LayoutParams) imageView.getLayoutParams()).setMarginEnd(wearableActionDrawer.E);
            this.E = (TextView) view.findViewById(C0707R.id.wearable_support_action_drawer_item_text);
        }
    }

    private final class c extends RecyclerView.e<RecyclerView.b0> {
        private final Menu c;
        private final View.OnClickListener f = new a();

        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int X = WearableActionDrawer.this.x.X(view) - (WearableActionDrawer.q(WearableActionDrawer.this) ? 1 : 0);
                if (X != -1) {
                    WearableActionDrawer.this.D(X);
                }
            }
        }

        public c() {
            this.c = WearableActionDrawer.this.getMenu();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public void K(RecyclerView.b0 b0Var, int i) {
            int i2 = WearableActionDrawer.q(WearableActionDrawer.this) ? i - 1 : i;
            if (b0Var instanceof b) {
                b bVar = (b) b0Var;
                View view = bVar.C;
                int i3 = WearableActionDrawer.this.A;
                WearableActionDrawer wearableActionDrawer = WearableActionDrawer.this;
                view.setPadding(i3, i == 0 ? wearableActionDrawer.C : wearableActionDrawer.y, WearableActionDrawer.this.B, i == u() + -1 ? WearableActionDrawer.this.D : WearableActionDrawer.this.z);
                Drawable icon = this.c.getItem(i2).getIcon();
                if (icon != null) {
                    icon = icon.getConstantState().newDrawable().mutate();
                }
                CharSequence title = this.c.getItem(i2).getTitle();
                bVar.E.setText(title);
                bVar.E.setContentDescription(title);
                bVar.D.setContentDescription(title);
                bVar.D.setImageDrawable(icon);
            } else if (b0Var instanceof e) {
                e eVar = (e) b0Var;
                eVar.C.setPadding(WearableActionDrawer.this.A, WearableActionDrawer.this.C, WearableActionDrawer.this.B, WearableActionDrawer.this.z);
                eVar.D.setText(WearableActionDrawer.this.L);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new e(je.G(viewGroup, C0707R.layout.action_drawer_title_view, viewGroup, false));
            }
            View G = je.G(viewGroup, C0707R.layout.action_drawer_item_view, viewGroup, false);
            G.setOnClickListener(this.f);
            return new b(WearableActionDrawer.this, G);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public int u() {
            return this.c.size() + (WearableActionDrawer.q(WearableActionDrawer.this) ? 1 : 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public int w(int i) {
            return (!WearableActionDrawer.q(WearableActionDrawer.this) || i != 0) ? 0 : 1;
        }
    }

    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    private static final class e extends RecyclerView.b0 {
        public final View C;
        public final TextView D;

        public e(View view) {
            super(view);
            this.C = view;
            this.D = (TextView) view.findViewById(C0707R.id.wearable_support_action_drawer_title);
        }
    }

    public WearableActionDrawer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void D(int i) {
        d dVar;
        if (i >= 0 && i < getMenu().size()) {
            c.b bVar = (c.b) getMenu().getItem(i);
            if (!bVar.c() && (dVar = this.I) != null) {
                dVar.onMenuItemClick(bVar);
            }
        }
    }

    static boolean q(WearableActionDrawer wearableActionDrawer) {
        return wearableActionDrawer.L != null;
    }

    static void u(WearableActionDrawer wearableActionDrawer) {
        if (wearableActionDrawer.G != null && wearableActionDrawer.H != null) {
            Menu menu = wearableActionDrawer.getMenu();
            int size = menu.size();
            if (size > 1) {
                wearableActionDrawer.setDrawerContent(wearableActionDrawer.x);
                wearableActionDrawer.H.setVisibility(0);
            } else {
                wearableActionDrawer.setDrawerContent(null);
                wearableActionDrawer.H.setVisibility(8);
            }
            if (size >= 1) {
                Drawable icon = menu.getItem(0).getIcon();
                if (icon != null) {
                    icon = icon.getConstantState().newDrawable().mutate();
                    icon.clearColorFilter();
                }
                wearableActionDrawer.G.setImageDrawable(icon);
                wearableActionDrawer.G.setContentDescription(menu.getItem(0).getTitle());
            }
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return f();
    }

    public Menu getMenu() {
        if (this.K == null) {
            this.K = new c(getContext(), new a());
        }
        return this.K;
    }

    @Override // android.support.wearable.view.drawer.WearableDrawerView
    public void k(View view) {
        if (this.F) {
            super.k(view);
        } else {
            D(0);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.wearable.view.drawer.WearableDrawerView
    public int m() {
        return 80;
    }

    public void setOnMenuItemClickListener(d dVar) {
        this.I = dVar;
    }

    public void setTitle(CharSequence charSequence) {
        if (!g.a(charSequence, this.L)) {
            CharSequence charSequence2 = this.L;
            this.L = charSequence;
            if (charSequence2 == null) {
                this.J.C(0);
            } else if (charSequence == null) {
                this.J.I(0);
            } else {
                this.J.A(0);
            }
        }
    }

    public WearableActionDrawer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z2;
        int i2;
        setShouldLockWhenNotOpenOrPeeking(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.o, i, 0);
            try {
                this.L = obtainStyledAttributes.getString(1);
                z2 = obtainStyledAttributes.getBoolean(2, false);
                i2 = obtainStyledAttributes.getResourceId(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            z2 = false;
            i2 = 0;
        }
        this.F = z2;
        if (!z2) {
            View inflate = LayoutInflater.from(context).inflate(C0707R.layout.action_drawer_peek_view, getPeekContainer(), false);
            setPeekContent(inflate);
            this.G = (ImageView) inflate.findViewById(C0707R.id.wearable_support_action_drawer_peek_action_icon);
            this.H = (ImageView) inflate.findViewById(C0707R.id.wearable_support_action_drawer_expand_icon);
        } else {
            this.G = null;
            this.H = null;
        }
        if (i2 != 0) {
            new MenuInflater(context).inflate(i2, getMenu());
        }
        int i3 = context.getResources().getDisplayMetrics().widthPixels;
        int i4 = context.getResources().getDisplayMetrics().heightPixels;
        Resources resources = getResources();
        this.y = resources.getDimensionPixelOffset(C0707R.dimen.action_drawer_item_top_padding);
        this.z = resources.getDimensionPixelOffset(C0707R.dimen.action_drawer_item_bottom_padding);
        this.A = q.d(context, i3, C0707R.fraction.action_drawer_item_left_padding);
        this.B = q.d(context, i3, C0707R.fraction.action_drawer_item_right_padding);
        this.C = q.d(context, i4, C0707R.fraction.action_drawer_item_first_item_top_padding);
        this.D = q.d(context, i4, C0707R.fraction.action_drawer_item_last_item_bottom_padding);
        this.E = resources.getDimensionPixelOffset(C0707R.dimen.action_drawer_item_icon_right_margin);
        RecyclerView recyclerView = new RecyclerView(context, null);
        this.x = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        getMenu();
        c cVar = new c();
        this.J = cVar;
        recyclerView.setAdapter(cVar);
        setDrawerContent(recyclerView);
    }
}
