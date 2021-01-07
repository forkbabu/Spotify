package android.support.wearable.watchface.decompositionface;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.graphics.drawable.RotateDrawable;
import android.os.Handler;
import android.os.Looper;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.rendering.ComplicationDrawable;
import android.support.wearable.watchface.decomposition.ComplicationComponent;
import android.support.wearable.watchface.decomposition.FontComponent;
import android.support.wearable.watchface.decomposition.ImageComponent;
import android.support.wearable.watchface.decomposition.NumberComponent;
import android.support.wearable.watchface.decomposition.WatchFaceDecomposition;
import android.util.ArrayMap;
import android.util.SparseArray;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class b extends Drawable {
    private final Context a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final a c = new a();
    private final Rect d = new Rect();
    private final Path e = new Path();
    private WatchFaceDecomposition f;
    private boolean g;
    private ArrayList<WatchFaceDecomposition.DrawnComponent> h;
    private Map<Icon, RotateDrawable> i;
    private SparseArray<e> j;
    private SparseArray<ComplicationDrawable> k;
    private ComplicationData l;
    private long m;
    private boolean n;
    private final Drawable.Callback o = new a();

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }
    }

    /* renamed from: android.support.wearable.watchface.decompositionface.b$b  reason: collision with other inner class name */
    class C0015b implements Comparator<WatchFaceDecomposition.DrawnComponent> {
        C0015b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(WatchFaceDecomposition.DrawnComponent drawnComponent, WatchFaceDecomposition.DrawnComponent drawnComponent2) {
            return drawnComponent.b() - drawnComponent2.b();
        }
    }

    public b(Context context) {
        this.a = context;
    }

    private void c(ComplicationComponent complicationComponent, Canvas canvas, a aVar) {
        ComplicationDrawable complicationDrawable = this.k.get(complicationComponent.h());
        complicationDrawable.setCurrentTimeMillis(this.m);
        complicationDrawable.setInAmbientMode(false);
        complicationDrawable.setBurnInProtection(false);
        complicationDrawable.setLowBitAmbient(false);
        aVar.a(complicationComponent.e(), this.d);
        complicationDrawable.setBounds(this.d);
        complicationDrawable.draw(canvas);
    }

    public void d(boolean z) {
        this.n = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f != null) {
            Rect bounds = getBounds();
            if (this.n) {
                canvas.save();
                canvas.clipPath(this.e);
            }
            this.c.e(bounds);
            Iterator<WatchFaceDecomposition.DrawnComponent> it = this.h.iterator();
            while (it.hasNext()) {
                WatchFaceDecomposition.DrawnComponent next = it.next();
                if (next.a()) {
                    if (next instanceof ImageComponent) {
                        ImageComponent imageComponent = (ImageComponent) next;
                        a aVar = this.c;
                        RotateDrawable rotateDrawable = this.i.get(imageComponent.h());
                        if (rotateDrawable != null) {
                            aVar.a(imageComponent.e(), this.d);
                            rotateDrawable.setBounds(this.d);
                            float i2 = imageComponent.i();
                            float f2 = imageComponent.f();
                            long offset = this.m + ((long) TimeZone.getDefault().getOffset(this.m));
                            TimeUnit timeUnit = TimeUnit.DAYS;
                            float millis = (((f2 * ((float) (offset % timeUnit.toMillis(1)))) / ((float) timeUnit.toMillis(1))) + i2) % 360.0f;
                            float g2 = imageComponent.g();
                            if (g2 > 0.0f) {
                                millis = ((float) ((int) (millis / g2))) * g2;
                            }
                            rotateDrawable.setFromDegrees(millis);
                            rotateDrawable.setToDegrees(millis);
                            if (millis > 0.0f) {
                                rotateDrawable.setPivotX((float) (aVar.b(imageComponent.j().x) - this.d.left));
                                rotateDrawable.setPivotY((float) (aVar.c(imageComponent.j().y) - this.d.top));
                            }
                            rotateDrawable.setLevel(rotateDrawable.getLevel() + 1);
                            rotateDrawable.draw(canvas);
                        }
                    } else if (next instanceof NumberComponent) {
                        NumberComponent numberComponent = (NumberComponent) next;
                        a aVar2 = this.c;
                        e eVar = this.j.get(numberComponent.f());
                        if (eVar != null) {
                            String e2 = numberComponent.e(this.m);
                            PointF h2 = numberComponent.h();
                            int intrinsicWidth = eVar.getIntrinsicWidth();
                            int intrinsicHeight = eVar.getIntrinsicHeight();
                            int log10 = (((((int) Math.log10((double) numberComponent.g())) + 1) - 1) * intrinsicWidth) + aVar2.b(h2.x);
                            int c2 = aVar2.c(h2.y);
                            this.d.set(log10, c2, log10 + intrinsicWidth, intrinsicHeight + c2);
                            int length = e2.length();
                            while (true) {
                                length--;
                                if (length < 0) {
                                    break;
                                }
                                eVar.setBounds(this.d);
                                eVar.a(Character.digit(e2.charAt(length), 10));
                                eVar.draw(canvas);
                                this.d.offset(-intrinsicWidth, 0);
                            }
                        }
                    } else if (!this.g && (next instanceof ComplicationComponent)) {
                        c((ComplicationComponent) next, canvas, this.c);
                    }
                }
            }
            if (this.g) {
                canvas.drawColor(this.a.getColor(C0707R.color.config_scrim_color));
                Iterator<WatchFaceDecomposition.DrawnComponent> it2 = this.h.iterator();
                while (it2.hasNext()) {
                    WatchFaceDecomposition.DrawnComponent next2 = it2.next();
                    if (next2 instanceof ComplicationComponent) {
                        c((ComplicationComponent) next2, canvas, this.c);
                    }
                }
            }
            if (this.n) {
                canvas.restore();
            }
        }
    }

    public void e(long j2) {
        this.m = j2;
    }

    public void f(WatchFaceDecomposition watchFaceDecomposition, boolean z) {
        ComplicationDrawable complicationDrawable;
        this.f = watchFaceDecomposition;
        this.g = z;
        ArrayList<WatchFaceDecomposition.DrawnComponent> arrayList = new ArrayList<>();
        this.h = arrayList;
        arrayList.addAll(watchFaceDecomposition.c());
        this.h.addAll(watchFaceDecomposition.e());
        this.h.addAll(watchFaceDecomposition.a());
        Collections.sort(this.h, new C0015b());
        this.i = new ArrayMap();
        for (ImageComponent imageComponent : this.f.c()) {
            Icon h2 = imageComponent.h();
            h2.loadDrawableAsync(this.a, new c(this, h2), this.b);
        }
        this.j = new SparseArray<>();
        for (FontComponent fontComponent : this.f.b()) {
            fontComponent.g().loadDrawableAsync(this.a, new d(this, fontComponent), this.b);
        }
        this.k = new SparseArray<>();
        for (ComplicationComponent complicationComponent : this.f.a()) {
            ComplicationDrawable f2 = complicationComponent.f();
            if (this.g) {
                complicationDrawable = new ComplicationDrawable(this.a);
                complicationDrawable.setBorderColorActive(-1);
                complicationDrawable.setBorderDashWidthActive(this.a.getResources().getDimensionPixelSize(C0707R.dimen.blank_config_dash_width));
                complicationDrawable.setBorderDashGapActive(this.a.getResources().getDimensionPixelSize(C0707R.dimen.blank_config_dash_gap));
                if (f2 != null) {
                    complicationDrawable.setBounds(f2.getBounds());
                }
            } else {
                complicationDrawable = f2 == null ? new ComplicationDrawable() : new ComplicationDrawable(f2);
            }
            complicationDrawable.setContext(this.a);
            complicationDrawable.setCallback(this.o);
            complicationDrawable.setLowBitAmbient(true);
            complicationDrawable.setBurnInProtection(true);
            this.k.put(complicationComponent.h(), complicationDrawable);
            if (this.g) {
                ComplicationData complicationData = null;
                ComplicationDrawable complicationDrawable2 = this.k.get(complicationComponent.h());
                if (complicationDrawable2 != null) {
                    if (this.g) {
                        if (this.l == null) {
                            ComplicationData.b bVar = new ComplicationData.b(6);
                            bVar.e(Icon.createWithResource(this.a, (int) C0707R.drawable.ic_add_white_24dp));
                            this.l = bVar.c();
                        }
                        complicationData = this.l;
                        complicationDrawable2.setBorderStyleActive(2);
                    }
                    complicationDrawable2.setComplicationData(complicationData);
                }
                invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.e.reset();
        this.e.addOval((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
