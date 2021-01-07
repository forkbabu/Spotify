package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.ui.view.anchorbar.f;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.Locale;

/* renamed from: zr5  reason: default package */
class zr5 extends f {
    private Runnable f = gr5.a;
    private Runnable n = fr5.a;
    private Runnable o = cr5.a;
    private Runnable p = ir5.a;
    private View q;
    private TextView r;
    private Context s;
    private Button t;
    private Button u;
    private Button v;
    private View w;
    private ProgressBar x;

    zr5(AnchorBar anchorBar, int i) {
        super(anchorBar, i, "Start trip");
    }

    public static void e(zr5 zr5, View view) {
        zr5.p.run();
    }

    public static void f(zr5 zr5, View view) {
        zr5.n.run();
    }

    public static void g(zr5 zr5, View view) {
        zr5.o.run();
    }

    public static void h(zr5 zr5, View view) {
        zr5.f.run();
    }

    private static void m(Context context, Button button, int i) {
        Drawable d = a.d(context, i);
        d.getClass();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.std_16dp);
        Resources resources = context.getResources();
        Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        d.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        d.draw(canvas);
        button.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(resources, createBitmap), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public void a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.s = context;
        int i = 0;
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.layout_starttrip_banner, viewGroup, false);
        this.q = inflate;
        inflate.getClass();
        if (com.spotify.android.goldenpath.a.g(context)) {
            i = com.spotify.android.goldenpath.a.e(context.getResources());
        }
        if (i != 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) inflate.getLayoutParams();
            layoutParams.topMargin += i;
            inflate.setLayoutParams(layoutParams);
        }
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.DEVICE_CAR, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.empty_view_icon_size));
        spotifyIconDrawable.r(a.b(context, R.color.white));
        ((ImageView) inflate.findViewById(C0707R.id.start_trip_icon)).setImageDrawable(spotifyIconDrawable);
        this.r = (TextView) inflate.findViewById(C0707R.id.start_trip_title);
        Button button = (Button) inflate.findViewById(C0707R.id.start_trip_google_maps);
        this.t = button;
        button.setOnClickListener(new dr5(this));
        m(context, button, C0707R.drawable.app_logo_googlemaps);
        Button button2 = (Button) inflate.findViewById(C0707R.id.start_trip_waze);
        this.u = button2;
        button2.setOnClickListener(new hr5(this));
        m(context, button2, C0707R.drawable.wazelogobig);
        Button button3 = (Button) inflate.findViewById(C0707R.id.start_trip_more_options);
        button3.setOnClickListener(new er5(this));
        if (Build.VERSION.SDK_INT >= 21) {
            button3.setLetterSpacing(0.0f);
        }
        this.v = button3;
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(C0707R.id.close_progress_button);
        this.x = progressBar;
        progressBar.setOnClickListener(new ar5(this));
        this.w = inflate.findViewById(C0707R.id.start_trip_horizontal_bar);
        viewGroup.addView(inflate);
    }

    public void i(Runnable runnable) {
        this.p = runnable;
    }

    public void j(Runnable runnable) {
        TextView textView = this.r;
        textView.getClass();
        Context context = this.s;
        context.getClass();
        View view = this.q;
        view.getClass();
        Button button = this.t;
        button.getClass();
        Button button2 = this.u;
        button2.getClass();
        Button button3 = this.v;
        button3.getClass();
        View view2 = this.w;
        view2.getClass();
        textView.setText(String.format(Locale.getDefault(), "%s\n%s", context.getString(C0707R.string.starttrip_banner_carbluetoothconnected), context.getString(C0707R.string.starttrip_banner_connect)));
        view.setOnClickListener(new br5(runnable));
        button.setVisibility(8);
        button2.setVisibility(8);
        button3.setVisibility(8);
        view2.setVisibility(8);
    }

    public void k(Runnable runnable) {
        this.n = runnable;
    }

    public void l(boolean z) {
        Button button = this.t;
        button.getClass();
        if (z) {
            button.setVisibility(0);
        } else {
            button.setVisibility(8);
        }
    }

    public void n(Runnable runnable) {
        this.o = runnable;
    }

    public void o() {
        TextView textView = this.r;
        textView.getClass();
        View view = this.q;
        view.getClass();
        Context context = this.s;
        context.getClass();
        Button button = this.v;
        button.getClass();
        View view2 = this.w;
        view2.getClass();
        textView.setText(context.getText(C0707R.string.starttrip_banner_starttrip));
        button.setVisibility(0);
        view2.setVisibility(0);
        view.setOnClickListener(null);
    }

    public void p(Runnable runnable) {
        this.f = runnable;
    }

    public void q(boolean z) {
        Button button = this.u;
        button.getClass();
        if (z) {
            button.setVisibility(0);
        } else {
            button.setVisibility(8);
        }
    }

    public void r(int i) {
        ProgressBar progressBar = this.x;
        progressBar.getClass();
        progressBar.setProgress(i);
    }
}
