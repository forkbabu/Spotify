package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.e;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.o;
import com.google.android.video.exo.d;
import com.google.common.io.BaseEncoding;
import com.spotify.android.flags.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.mobile.android.util.x;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.offline.i0;
import com.spotify.mobile.android.video.u;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.t;
import com.spotify.mobius.z;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import okhttp3.y;
import org.json.JSONArray;

/* renamed from: z42  reason: default package */
public final class z42 {
    public static int A(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    public static int B() {
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    public static boolean C(c cVar) {
        return !((Boolean) cVar.M0(g51.d)).booleanValue();
    }

    public static String D(Context context, int i) {
        Locale locale = Locale.ENGLISH;
        if (i <= 100) {
            return context.getString(C0707R.string.waze_distance_now);
        }
        if (i <= 250) {
            return String.format(locale, context.getString(C0707R.string.waze_distance_meters), 250);
        }
        if (i <= 500) {
            return String.format(locale, context.getString(C0707R.string.waze_distance_meters), 500);
        }
        if (i <= 1000) {
            return String.format(locale, context.getString(C0707R.string.waze_distance_km_fmt), 1);
        }
        String string = context.getString(C0707R.string.waze_distance_km_fmt);
        double d = (double) i;
        Double.isNaN(d);
        return String.format(locale, string, Double.valueOf(Math.ceil(d / 1000.0d)));
    }

    @Deprecated
    public static SortOption E(ane ane) {
        SortOption sortOption = new SortOption(ane.c(), true);
        sortOption.h(ane.e(), false);
        ane f = ane.f();
        if (f != null) {
            sortOption.i(E(f));
        }
        return sortOption;
    }

    public static ane F(SortOption sortOption) {
        SortOption e = sortOption.e();
        return new ane(sortOption.a(), sortOption.f(), e != null ? F(e) : null);
    }

    public static void a(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static <M, E, F> MobiusLoop.g<M, E> b(MobiusLoop.h<M, E, F> hVar, M m) {
        return z.b(hVar, m, u92.b());
    }

    public static <M, E, F> MobiusLoop.g<M, E> c(MobiusLoop.h<M, E, F> hVar, M m, t<M, F> tVar) {
        return z.a(hVar, m, tVar, u92.b());
    }

    public static k.a d(y yVar, o oVar, u uVar) {
        d dVar = new d(yVar, null, oVar);
        if (uVar == null) {
            return dVar;
        }
        if (uVar instanceof com.spotify.mobile.android.video.offline.z) {
            return new e(uVar.a(), dVar, new FileDataSource.a(), null, 0, null, new i0());
        }
        Cache a = uVar.a();
        return new e(a, dVar, new FileDataSource.a(), new com.google.android.exoplayer2.upstream.cache.c(a, 5242880), 0, null, null);
    }

    public static Drawable e(Context context, SpotifyIconV2 spotifyIconV2) {
        return f(context, spotifyIconV2, nud.i(context, C0707R.attr.pasteColorAccessory));
    }

    public static Drawable f(Context context, SpotifyIconV2 spotifyIconV2, ColorStateList colorStateList) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) nud.g(24.0f, context.getResources()));
        spotifyIconDrawable.s(colorStateList);
        spotifyIconDrawable.w((float) nud.g(24.0f, context.getResources()));
        return spotifyIconDrawable;
    }

    public static ImageButton g(Context context) {
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(context, null, C0707R.attr.pasteButtonStyleBorderlessTransparent);
        stateListAnimatorImageButton.setFocusable(false);
        stateListAnimatorImageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        stateListAnimatorImageButton.setPadding(context.getResources().getDimensionPixelSize(C0707R.dimen.quick_action_padding_left), 0, 0, 0);
        stateListAnimatorImageButton.setMinimumWidth(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        stateListAnimatorImageButton.setLayoutParams(layoutParams);
        return stateListAnimatorImageButton;
    }

    public static ImageButton h(Context context, Drawable drawable) {
        ImageButton g = g(context);
        g.setImageDrawable(drawable);
        return g;
    }

    public static ImageButton i(Context context, SpotifyIconV2 spotifyIconV2) {
        return j(context, spotifyIconV2, nud.i(context, C0707R.attr.pasteColorAccessory));
    }

    public static ImageButton j(Context context, SpotifyIconV2 spotifyIconV2, ColorStateList colorStateList) {
        ImageButton g = g(context);
        g.setImageDrawable(f(context, spotifyIconV2, colorStateList));
        return g;
    }

    public static View k(Context context, SpotifyIconV2 spotifyIconV2) {
        SpotifyIconView spotifyIconView = new SpotifyIconView(context, null);
        spotifyIconView.setIcon(spotifyIconV2);
        spotifyIconView.setColorStateList(nud.i(context, C0707R.attr.pasteColorAccessory));
        spotifyIconView.getDrawable().w((float) nud.g(24.0f, context.getResources()));
        return spotifyIconView;
    }

    @SafeVarargs
    public static <F, G extends F> Set<F> l(G... gArr) {
        HashSet hashSet = new HashSet(gArr.length);
        for (G g : gArr) {
            g.getClass();
        }
        Collections.addAll(hashSet, gArr);
        return hashSet;
    }

    public static Spanned m(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }

    public static String n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        if (th != null) {
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                arrayList.add(p(cause));
            }
        }
        return new JSONArray((Collection) arrayList).toString();
    }

    public static String o(Throwable th) {
        String stackTraceString = th != null ? Log.getStackTraceString(th) : "Stack trace N/A";
        if (stackTraceString.length() > 2500) {
            stackTraceString = stackTraceString.substring(0, 2499);
        }
        return stackTraceString.replace('\t', ' ').replace('\n', ' ');
    }

    public static String p(Throwable th) {
        return th != null ? th.getClass().getSimpleName() : "";
    }

    public static int q(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 17) {
            return configuration.getLayoutDirection();
        }
        return (configuration.screenLayout & 192) == 128 ? 1 : 0;
    }

    public static Locale r(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return configuration.getLocales().get(0);
        }
        return configuration.locale;
    }

    public static String s(PlayerTrack playerTrack, String str) {
        return playerTrack == null ? "" : (String) x.n(playerTrack.metadata().get(str), "");
    }

    public static String t(d0 d0Var) {
        return d0Var.c().get("endvideo_track_uid");
    }

    public static byte[] u(String str) {
        try {
            return BaseEncoding.base16().lowerCase().decode(str.toLowerCase(Locale.US));
        } catch (IllegalArgumentException e) {
            Assertion.i("Cannot decode hex string (will return empty byte array): " + str, e);
            return new byte[0];
        }
    }

    public static <T> Set<T> v(Set<? extends T> set) {
        set.getClass();
        for (T t : set) {
            t.getClass();
        }
        return Collections.unmodifiableSet(new HashSet(set));
    }

    public static boolean w(int i) {
        return View.MeasureSpec.getMode(i) == 1073741824;
    }

    public static boolean x(c cVar) {
        return ((Boolean) cVar.M0(g51.e)).booleanValue() && !((Boolean) cVar.M0(g51.f)).booleanValue();
    }

    public static boolean y(c cVar) {
        return "premium".equals(cVar.M0(g51.c));
    }

    public static boolean z(int i) {
        return View.MeasureSpec.getMode(i) == 0;
    }
}
