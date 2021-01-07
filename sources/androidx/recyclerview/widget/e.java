package androidx.recyclerview.widget;

public class e implements w {
    final w a;
    int b = 0;
    int c = -1;
    int f = -1;
    Object n = null;

    public e(w wVar) {
        this.a = wVar;
    }

    @Override // androidx.recyclerview.widget.w
    public void a(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.f;
            if (i <= i3 + i4) {
                this.f = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        e();
        this.c = i;
        this.f = i2;
        this.b = 1;
    }

    @Override // androidx.recyclerview.widget.w
    public void b(int i, int i2) {
        int i3;
        if (this.b != 2 || (i3 = this.c) < i || i3 > i + i2) {
            e();
            this.c = i;
            this.f = i2;
            this.b = 2;
            return;
        }
        this.f += i2;
        this.c = i;
    }

    @Override // androidx.recyclerview.widget.w
    public void c(int i, int i2, Object obj) {
        int i3;
        if (this.b == 3) {
            int i4 = this.c;
            int i5 = this.f;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.n == obj) {
                this.c = Math.min(i, i4);
                this.f = Math.max(i5 + i4, i3) - this.c;
                return;
            }
        }
        e();
        this.c = i;
        this.f = i2;
        this.n = obj;
        this.b = 3;
    }

    @Override // androidx.recyclerview.widget.w
    public void d(int i, int i2) {
        e();
        this.a.d(i, i2);
    }

    public void e() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.a(this.c, this.f);
            } else if (i == 2) {
                this.a.b(this.c, this.f);
            } else if (i == 3) {
                this.a.c(this.c, this.f, this.n);
            }
            this.n = null;
            this.b = 0;
        }
    }
}
