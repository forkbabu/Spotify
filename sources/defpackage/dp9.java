package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;
import java.util.List;

/* renamed from: dp9  reason: default package */
public class dp9 extends pk9.a<a> {
    private final boolean a;

    /* renamed from: dp9$a */
    static class a extends s51.c.a<View> {
        final TextView b;
        final TextView c;
        final LinearLayout f;
        w61<?> n;
        w61<?> o;

        a(View view, boolean z) {
            super(view);
            if (z) {
                int paddingTop = view.getPaddingTop();
                view.setPadding(view.getPaddingLeft(), com.spotify.android.goldenpath.a.g(view.getContext()) ? paddingTop + com.spotify.android.goldenpath.a.d(view.getContext()) : paddingTop, view.getPaddingRight(), view.getPaddingBottom());
            }
            this.b = (TextView) view.findViewById(C0707R.id.title);
            this.c = (TextView) view.findViewById(C0707R.id.subtitle);
            this.f = (LinearLayout) view.findViewById(C0707R.id.children);
            q4.J(view, true);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            if (iArr.length == 0) {
                g91.a(this.a, s81, aVar, iArr);
                return;
            }
            List<? extends s81> children = s81.children();
            if (!children.isEmpty()) {
                boolean z = false;
                Object obj = children.get(iArr[0]);
                obj.getClass();
                View e = this.n.e();
                int[] iArr2 = h91.a;
                g91.a(e, (s81) obj, aVar, iArr2);
                if (s81.children().size() > 1) {
                    z = true;
                }
                if (z) {
                    Object obj2 = children.get(iArr[1]);
                    obj2.getClass();
                    g91.a(this.o.e(), (s81) obj2, aVar, iArr2);
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            String title = s81.text().title();
            TextView textView = this.b;
            if (TextUtils.isEmpty(title)) {
                textView.setVisibility(8);
            } else {
                textView.setText(title);
            }
            String subtitle = s81.text().subtitle();
            TextView textView2 = this.c;
            if (TextUtils.isEmpty(subtitle)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(subtitle);
            }
            if (s81.children().isEmpty()) {
                this.f.setVisibility(8);
                return;
            }
            s81 s812 = (s81) s81.children().get(0);
            int d = w51.c().d(s812);
            if (this.n == null) {
                w61<?> b2 = w61.b(d, this.f, w51);
                this.n = b2;
                this.f.addView(b2.e());
            }
            this.n.a(0, s812, bVar);
            if (s81.children().size() > 1) {
                s81 s813 = (s81) s81.children().get(1);
                int d2 = w51.c().d(s813);
                if (this.o == null) {
                    w61<?> b3 = w61.b(d2, this.f, w51);
                    this.o = b3;
                    View e = b3.e();
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.setMargins(0, e.getContext().getResources().getDimensionPixelSize(C0707R.dimen.small), 0, 0);
                    e.setLayoutParams(layoutParams);
                    this.f.addView(e);
                }
                this.o.a(1, s813, bVar);
            }
        }
    }

    public dp9(boolean z) {
        this.a = z;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(je.G(viewGroup, C0707R.layout.free_tier_home_header, viewGroup, false), this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.free_tier_home_header;
    }
}
