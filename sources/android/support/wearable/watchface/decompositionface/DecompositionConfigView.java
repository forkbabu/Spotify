package android.support.wearable.watchface.decompositionface;

import android.content.Context;
import android.graphics.Rect;
import android.support.wearable.watchface.decomposition.ComplicationComponent;
import android.support.wearable.watchface.decomposition.WatchFaceDecomposition;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class DecompositionConfigView extends ImageView {
    private final b a = new b(getContext());
    private final a b = new a();
    private final GestureDetector.SimpleOnGestureListener c;
    private final GestureDetector f;
    private final Rect n;
    private ArrayList<ComplicationComponent> o;
    private c p;

    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (!(DecompositionConfigView.this.o == null || DecompositionConfigView.this.p == null)) {
                DecompositionConfigView.this.b.d(0, 0, DecompositionConfigView.this.getWidth(), DecompositionConfigView.this.getHeight());
                Iterator it = DecompositionConfigView.this.o.iterator();
                while (it.hasNext()) {
                    ComplicationComponent complicationComponent = (ComplicationComponent) it.next();
                    DecompositionConfigView.this.b.a(complicationComponent.e(), DecompositionConfigView.this.n);
                    if (DecompositionConfigView.this.n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        DecompositionConfigView.this.p.a(complicationComponent.h(), complicationComponent.g());
                        return true;
                    }
                }
            }
            return false;
        }
    }

    class b implements Comparator<ComplicationComponent> {
        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(ComplicationComponent complicationComponent, ComplicationComponent complicationComponent2) {
            return complicationComponent2.b() - complicationComponent.b();
        }
    }

    public interface c {
        void a(int i, int[] iArr);
    }

    public DecompositionConfigView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a();
        this.c = aVar;
        this.f = new GestureDetector(getContext(), aVar);
        this.n = new Rect();
    }

    public int[] getWatchFaceComplicationIds() {
        int[] iArr = new int[this.o.size()];
        for (int i = 0; i < this.o.size(); i++) {
            iArr[i] = this.o.get(i).h();
        }
        return iArr;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f.onTouchEvent(motionEvent);
    }

    public void setDecomposition(WatchFaceDecomposition watchFaceDecomposition) {
        this.a.f(watchFaceDecomposition, true);
        this.a.d(getResources().getConfiguration().isScreenRound());
        setImageDrawable(this.a);
        ArrayList<ComplicationComponent> arrayList = new ArrayList<>(watchFaceDecomposition.a());
        this.o = arrayList;
        Collections.sort(arrayList, new b());
    }

    public void setDisplayTime(long j) {
        this.a.e(j);
        invalidate();
    }

    public void setOnComplicationTapListener(c cVar) {
        this.p = cVar;
    }
}
