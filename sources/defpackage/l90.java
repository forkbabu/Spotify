package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.music.C0707R;

/* renamed from: l90  reason: default package */
public class l90 extends Dialog {
    private final FrameLayout a = ((FrameLayout) findViewById(C0707R.id.bottom_sheet_content));

    /* renamed from: l90$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l90.this.dismiss();
        }
    }

    public l90(Context context) {
        super(context, C0707R.style.res_2132083484_theme_bottomsheetdialog);
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.glue_bottom_sheet, (ViewGroup) null);
        setContentView(inflate);
        inflate.setOnClickListener(new a());
    }

    public void a(View view) {
        this.a.removeAllViews();
        this.a.addView(view, new FrameLayout.LayoutParams(-1, -1));
    }
}
