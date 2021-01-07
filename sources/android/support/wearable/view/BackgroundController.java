package android.support.wearable.view;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.support.wearable.view.GridViewPager;
import android.view.View;

/* access modifiers changed from: package-private */
@Deprecated
public class BackgroundController implements GridViewPager.e, GridViewPager.d {
    private Direction a = Direction.NONE;
    private final Point b = new Point();
    private final Point c = new Point();
    private final r1<Integer, Drawable> f = new a(3);
    private final r1<Integer, Drawable> n = new b(5);
    private final j o;
    private final j p;
    private final b q;
    private final Point r;
    private final Point s;
    private final Point t;
    private float u;
    private float v;
    private float w;
    private float x;
    private boolean y;

    /* access modifiers changed from: private */
    public enum Direction {
        LEFT(-1, 0),
        UP(0, -1),
        RIGHT(1, 0),
        DOWN(0, 1),
        NONE(0, 0);
        
        private final int x;
        private final int y;

        private Direction(int i, int i2) {
            this.x = i;
            this.y = i2;
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return this.y != 0;
        }
    }

    class a extends r1<Integer, Drawable> {
        a(int i2) {
            super(i2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // defpackage.r1
        public Drawable a(Integer num) {
            BackgroundController.this.getClass();
            num.intValue();
            throw null;
        }
    }

    class b extends r1<Integer, Drawable> {
        b(int i2) {
            super(i2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // defpackage.r1
        public Drawable a(Integer num) {
            Integer num2 = num;
            num2.intValue();
            num2.intValue();
            BackgroundController.this.getClass();
            throw null;
        }
    }

    public BackgroundController() {
        j jVar = new j();
        this.o = jVar;
        j jVar2 = new j();
        this.p = jVar2;
        b bVar = new b();
        this.q = bVar;
        this.r = new Point();
        this.s = new Point();
        this.t = new Point();
        bVar.setFilterBitmap(true);
        jVar2.setFilterBitmap(true);
        jVar.setFilterBitmap(true);
    }

    @Override // android.support.wearable.view.GridViewPager.e
    public void a(int i) {
        if (i == 0) {
            this.a = Direction.NONE;
        }
    }

    @Override // android.support.wearable.view.GridViewPager.e
    public void b(int i, int i2, float f2, float f3, int i3, int i4) {
        float f4;
        Direction direction;
        Direction direction2 = this.a;
        Direction direction3 = Direction.NONE;
        float f5 = 0.0f;
        if (direction2 == direction3 || !this.b.equals(this.c) || !this.r.equals(i2, i)) {
            this.r.set(i2, i);
            Point point = this.b;
            Point point2 = this.c;
            point.set(point2.x, point2.y);
            f4 = ((float) d.a(i - this.b.y, -1, 0)) + f2;
            float a2 = f4 == 0.0f ? ((float) d.a(i2 - this.b.x, -1, 0)) + f3 : 0.0f;
            if (f4 != 0.0f) {
                direction = f4 > 0.0f ? Direction.DOWN : Direction.UP;
            } else {
                if (a2 != 0.0f) {
                    direction = a2 > 0.0f ? Direction.RIGHT : Direction.LEFT;
                }
                this.a = direction3;
                this.y = false;
                this.o.c(null);
                this.p.c(null);
                f5 = a2;
            }
            direction3 = direction;
            this.a = direction3;
            this.y = false;
            this.o.c(null);
            this.p.c(null);
            f5 = a2;
        } else if (this.a.d()) {
            f4 = ((float) d.a(i - this.b.y, -1, 0)) + f2;
        } else {
            f5 = ((float) d.a(i2 - this.b.x, -1, 0)) + f3;
            f4 = 0.0f;
        }
        this.o.d(this.w + f5, this.x + f4);
        if (this.y) {
            this.q.a(this.a.d() ? Math.abs(f4) : Math.abs(f5));
            this.p.d(this.u + f5, this.v + f4);
        }
    }

    public void c(View view) {
        view.setBackground(this.q);
    }
}
