package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.goldenpath.a;
import com.spotify.android.paste.app.d;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: k74  reason: default package */
public class k74 implements j74 {
    private final TextView a;
    private final TextView b;
    private final ImageView c;
    private final View d;
    private final RecyclerView e;
    private final View f;
    private final View g;
    private final l74 h;
    private final boolean i;

    public k74(ViewGroup viewGroup, boolean z) {
        Context context = viewGroup.getContext();
        boolean z2 = false;
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.browse_header_editorial, viewGroup, false);
        this.d = inflate;
        View findViewById = inflate.findViewById(C0707R.id.editorial_header_toolbar);
        this.g = findViewById;
        TextView textView = (TextView) inflate.findViewById(C0707R.id.txt_title);
        this.b = textView;
        if (z) {
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C0707R.dimen.content_area_horizontal_margin);
            textView.setPadding(dimensionPixelOffset, textView.getPaddingTop(), dimensionPixelOffset, textView.getPaddingBottom());
        }
        this.a = (TextView) inflate.findViewById(C0707R.id.txt_description);
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.img_background);
        this.c = imageView;
        View findViewById2 = inflate.findViewById(C0707R.id.img_text_gradient);
        this.f = findViewById2;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.rcl_topics);
        this.e = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.h = new l74(inflate, imageView, findViewById2, findViewById);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = d.b(context) + a.e(context.getResources());
        findViewById.setLayoutParams(layoutParams);
        findViewById.setAlpha(0.0f);
        this.i = inflate.getResources().getConfiguration().orientation == 2 ? true : z2;
    }

    private static void b(View view, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i2, -1290661358});
        int i3 = q4.g;
        int i4 = Build.VERSION.SDK_INT;
        view.setBackground(gradientDrawable);
    }

    @Override // defpackage.r74.a
    public void a(q74 q74) {
        if (TextUtils.isEmpty(q74.d())) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.b.setText(q74.d());
        }
        if (TextUtils.isEmpty(q74.d()) || q74.a().a() == null || this.i) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
            b(this.f, 0);
        }
        if (TextUtils.isEmpty(q74.b())) {
            this.a.setVisibility(8);
        } else {
            this.a.setVisibility(0);
            this.a.setText(q74.b());
        }
        b(this.d, q74.c());
        this.g.setBackgroundColor(q74.c());
        if (q74.a().a() != null) {
            this.c.setImageBitmap(q74.a().a());
        } else {
            this.c.setImageBitmap(null);
        }
    }

    public View c() {
        return this.d;
    }

    public void d(int i2, float f2) {
        this.h.b(i2, f2);
    }

    public void e(RecyclerView.e<? extends RecyclerView.b0> eVar) {
        this.e.setAdapter(eVar);
    }
}
