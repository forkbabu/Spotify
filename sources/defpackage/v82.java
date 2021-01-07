package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.android.goldenpath.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorItem;
import com.spotify.mobile.android.ui.view.anchorbar.f;
import com.spotify.mobile.android.waze.model.WazeBannerModel;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.IllegalFormatConversionException;

/* renamed from: v82  reason: default package */
public class v82 extends f {
    private final int f;
    private TextView n;
    private TextView o;
    private RelativeLayout p;
    private ImageButton q;
    private TextView r;
    private LinearLayout s;
    private final int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private WazeBannerModel x;
    private w82 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v82(AnchorBar anchorBar, String str) {
        super(anchorBar, C0707R.layout.waze_banner, str);
        int i;
        Context context = anchorBar.getContext();
        if (!a.g(context)) {
            i = 0;
        } else {
            i = a.e(context.getResources());
        }
        this.t = i;
        this.f = C0707R.layout.waze_banner;
    }

    private void j(boolean z, boolean z2) {
        boolean z3 = z || z2;
        if (this.u != z3) {
            this.u = z3;
            if (z3) {
                setVisible(false);
                return;
            }
            WazeBannerModel wazeBannerModel = this.x;
            if (wazeBannerModel != null) {
                e(wazeBannerModel);
            }
        }
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public void a(ViewGroup viewGroup) {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(viewGroup.getContext()).inflate(this.f, viewGroup, false);
        this.p = relativeLayout;
        this.n = (TextView) relativeLayout.findViewById(C0707R.id.waze_message);
        this.o = (TextView) this.p.findViewById(C0707R.id.waze_distance);
        ImageButton imageButton = (ImageButton) this.p.findViewById(C0707R.id.waze_action);
        this.q = imageButton;
        Context context = viewGroup.getContext();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.X, (float) nud.g(32.0f, context.getResources()));
        spotifyIconDrawable.r(androidx.core.content.a.b(context, R.color.white));
        imageButton.setImageDrawable(spotifyIconDrawable);
        this.r = (TextView) this.p.findViewById(C0707R.id.waze_exit);
        this.s = (LinearLayout) this.p.findViewById(C0707R.id.waze_no_distance);
        if (this.t != 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.p.getLayoutParams();
            layoutParams.topMargin = this.t;
            this.p.setLayoutParams(layoutParams);
        }
        this.p.setOnClickListener(new u82(this));
        this.q.setOnClickListener(new t82(this));
        viewGroup.addView(this.p);
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.f, com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public void b(AnchorItem.Type type, AnchorItem.Priority priority) {
        if (type == AnchorItem.Type.NAVIGATION) {
            int ordinal = priority.ordinal();
            AnchorItem.Priority priority2 = AnchorItem.Priority.DEFAULT;
            boolean z = ordinal > 0;
            this.v = z;
            j(z, this.w);
        }
    }

    public void e(WazeBannerModel wazeBannerModel) {
        this.x = wazeBannerModel;
        if (!this.u) {
            int ordinal = wazeBannerModel.h().ordinal();
            int i = 0;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    TextView textView = this.n;
                    String str = null;
                    if (textView != null) {
                        textView.setText((CharSequence) null);
                        TextView textView2 = this.o;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            this.n.setVisibility(8);
                            LinearLayout linearLayout = this.s;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                            }
                        }
                    }
                    int f2 = wazeBannerModel.f();
                    TextView textView3 = this.r;
                    if (textView3 != null) {
                        textView3.setBackgroundResource(f2);
                    }
                    if (wazeBannerModel.d() != null) {
                        String d = wazeBannerModel.d();
                        TextView textView4 = this.o;
                        if (textView4 != null) {
                            textView4.setText(d);
                        }
                    } else {
                        String c = wazeBannerModel.c();
                        if (c != null) {
                            try {
                                str = z42.D(this.p.getContext(), Integer.parseInt(c));
                            } catch (IllegalFormatConversionException unused) {
                                Logger.d("Bad distance: %s", c);
                            }
                        }
                        TextView textView5 = this.o;
                        if (textView5 != null) {
                            textView5.setText(str);
                            this.o.setVisibility(str != null ? 0 : 8);
                        }
                        boolean z = str != null;
                        LinearLayout linearLayout2 = this.s;
                        if (linearLayout2 != null) {
                            if (!z) {
                                i = 8;
                            }
                            linearLayout2.setVisibility(i);
                        }
                    }
                    int a = wazeBannerModel.a();
                    ImageButton imageButton = this.q;
                    if (imageButton != null) {
                        imageButton.setImageResource(a);
                    }
                    setVisible(true);
                    String e = wazeBannerModel.e();
                    TextView textView6 = this.r;
                    if (textView6 != null) {
                        textView6.setText(e);
                        return;
                    }
                    return;
                } else if (ordinal != 2) {
                    return;
                }
            }
            setVisible(false);
        }
    }

    public void f(View view) {
        w82 w82 = this.y;
        if (w82 != null) {
            w82.b();
        }
    }

    public void g(View view) {
        w82 w82 = this.y;
        if (w82 != null) {
            w82.close();
        }
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.f, com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public AnchorItem.Type getType() {
        return AnchorItem.Type.NAVIGATION;
    }

    public void h(w82 w82) {
        this.y = w82;
    }

    public void i(boolean z) {
        this.w = z;
        j(this.v, z);
    }

    public v82(AnchorBar anchorBar, String str, int i) {
        super(anchorBar, C0707R.layout.waze_banner, str);
        this.t = i;
        this.f = C0707R.layout.waze_banner;
    }
}
