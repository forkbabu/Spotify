package org.threeten.bp.temporal;

import org.threeten.bp.DayOfWeek;

public final class d {

    /* access modifiers changed from: private */
    public static final class b implements c {
        private final int a;
        private final int b;

        b(int i, DayOfWeek dayOfWeek, a aVar) {
            yif.J(dayOfWeek, "dayOfWeek");
            this.a = i;
            this.b = dayOfWeek.h();
        }

        @Override // org.threeten.bp.temporal.c
        public a g(a aVar) {
            int r = aVar.r(ChronoField.DAY_OF_WEEK);
            int i = this.a;
            if (i < 2 && r == this.b) {
                return aVar;
            }
            if ((i & 1) == 0) {
                int i2 = r - this.b;
                return aVar.v((long) (i2 >= 0 ? 7 - i2 : -i2), ChronoUnit.DAYS);
            }
            int i3 = this.b - r;
            return aVar.p((long) (i3 >= 0 ? 7 - i3 : -i3), ChronoUnit.DAYS);
        }
    }

    public static c a(DayOfWeek dayOfWeek) {
        return new b(0, dayOfWeek, null);
    }

    public static c b(DayOfWeek dayOfWeek) {
        return new b(1, dayOfWeek, null);
    }
}
