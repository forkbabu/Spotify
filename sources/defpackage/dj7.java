package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;

/* renamed from: dj7  reason: default package */
public class dj7 extends pk9.a<b> {

    /* renamed from: dj7$a */
    static class a extends RecyclerView.l {
        private final Paint a;

        a(int i, int i2) {
            Paint paint = new Paint();
            this.a = paint;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                canvas.drawRect((float) childAt.getLeft(), (float) (childAt.getTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin), (float) childAt.getRight(), (float) (childAt.getTop() + ((int) TypedValue.applyDimension(1, (float) 1, recyclerView.getResources().getDisplayMetrics())) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin), this.a);
            }
        }
    }

    /* renamed from: dj7$b */
    static class b extends s51.c.a<ViewGroup> {
        private final cj7 b;
        private final TextView c;
        private final TextView f;
        private final TextView n;
        private final TextView o;

        protected b(ViewGroup viewGroup, cj7 cj7) {
            super(viewGroup);
            this.b = cj7;
            this.c = (TextView) viewGroup.findViewById(C0707R.id.title);
            this.f = (TextView) viewGroup.findViewById(C0707R.id.row_title);
            this.n = (TextView) viewGroup.findViewById(C0707R.id.col_one);
            this.o = (TextView) viewGroup.findViewById(C0707R.id.col_two);
            RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(C0707R.id.recycler_view);
            viewGroup.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            recyclerView.k(new a(viewGroup.getResources().getColor(R.color.gray_20), 1), -1);
            recyclerView.setAdapter(cj7);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            this.c.setText(s81.text().title());
            this.f.setText(s81.custom().bundle("chartHeader").string("title"));
            this.n.setText(s81.custom().bundle("chartHeader").string("column_0"));
            this.o.setText(s81.custom().bundle("chartHeader").string("column_1"));
            this.b.Y(s81.custom().bundleArray("items"));
            this.b.z();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new b((ViewGroup) je.G(viewGroup, C0707R.layout.premium_page_benefit_chart_component, viewGroup, false), new cj7());
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_benefit_chart;
    }
}
