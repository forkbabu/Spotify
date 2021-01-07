package com.spotify.music.podcast.episode.util;

import android.content.res.Resources;
import com.spotify.music.C0707R;
import com.spotify.music.podcast.episode.util.DurationFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class j {
    private final DateFormat a = DateFormat.getDateInstance(2);
    private final SimpleDateFormat b = new SimpleDateFormat("MMM dd", Locale.getDefault());
    private final SimpleDateFormat c = new SimpleDateFormat("EEE", Locale.getDefault());
    private final Resources d;
    private final cqe e;
    private final DurationFormatter f;

    /* access modifiers changed from: package-private */
    public class a implements b {
        private final g a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;
        private boolean f;
        private DateFormat g;
        private DateFormat h;

        public a(g gVar) {
            this.a = gVar;
        }

        private String g(Calendar calendar, Calendar calendar2) {
            if (calendar.get(1) == calendar2.get(1)) {
                return j.this.b.format(calendar2.getTime());
            }
            return j.this.a.format(calendar2.getTime());
        }

        private String h(int i2) {
            return j.this.f.a(this.f ? DurationFormatter.Format.LONG_MINUTE_AND_SECOND : DurationFormatter.Format.LONG_HOUR_AND_MINUTE, i2);
        }

        private String i(Calendar calendar, Calendar calendar2) {
            if (calendar.get(6) - calendar2.get(6) == 1) {
                return j.this.d.getString(C0707R.string.subtitle_yesterday);
            }
            return j.this.c.format(calendar2.getTime());
        }

        private boolean j(Calendar calendar, Calendar calendar2) {
            int i2 = calendar.get(6) - calendar2.get(6);
            if (!(calendar.get(1) == calendar2.get(1)) || i2 <= 0 || i2 > 7) {
                return false;
            }
            return true;
        }

        private boolean k(Calendar calendar, Calendar calendar2) {
            if (calendar2.get(0) == calendar.get(0) && calendar2.get(1) == calendar.get(1) && calendar2.get(6) == calendar.get(6)) {
                return true;
            }
            return false;
        }

        @Override // com.spotify.music.podcast.episode.util.j.b
        public b a(boolean z) {
            this.c = z;
            return this;
        }

        @Override // com.spotify.music.podcast.episode.util.j.b
        public b b(boolean z) {
            this.d = z;
            return this;
        }

        @Override // com.spotify.music.podcast.episode.util.j.b
        public String build() {
            String str;
            String str2;
            String str3;
            String str4;
            Integer e2 = this.a.e();
            int intValue = e2 != null ? e2.intValue() : -1;
            int a2 = ric.a(this.a.a(), this.d, this.a.b(), intValue);
            Calendar e3 = j.this.e.e();
            Calendar calendar = (Calendar) e3.clone();
            calendar.setTimeInMillis(((long) this.a.d()) * 1000);
            boolean z = this.b;
            if ((!z || this.g == null || this.h == null) ? false : true) {
                if (k(e3, calendar)) {
                    str4 = j.this.d.getString(C0707R.string.subtitle_today);
                } else if (j(e3, calendar)) {
                    str4 = i(e3, calendar);
                } else if (e3.get(1) == calendar.get(1)) {
                    str4 = this.g.format(calendar.getTime());
                } else {
                    str4 = this.h.format(calendar.getTime());
                }
                str = str4.toUpperCase(Locale.getDefault());
            } else {
                if (z && this.e) {
                    str = g(e3, calendar).toUpperCase(Locale.getDefault());
                } else if (z) {
                    if (k(e3, calendar)) {
                        str3 = j.this.d.getString(C0707R.string.subtitle_today);
                    } else if (j(e3, calendar)) {
                        str3 = i(e3, calendar);
                    } else {
                        str3 = g(e3, calendar);
                    }
                    str = str3.toUpperCase(Locale.getDefault());
                } else {
                    str = this.a.c();
                }
            }
            if (this.c) {
                return a2 == 2 ? j.this.d.getString(C0707R.string.subtitle_played) : str;
            }
            if (a2 != 1) {
                if (!(this.d && a2 != 2 && intValue > 0)) {
                    if (a2 == 2) {
                        str2 = j.this.d.getString(C0707R.string.subtitle_played);
                    } else {
                        str2 = h(this.a.b());
                    }
                    return j.this.d.getString(C0707R.string.subtitle_general_structure, str, str2);
                }
            }
            str2 = j.this.d.getString(C0707R.string.subtitle_time_left, h(intValue));
            return j.this.d.getString(C0707R.string.subtitle_general_structure, str, str2);
        }

        @Override // com.spotify.music.podcast.episode.util.j.b
        public b c(boolean z) {
            this.b = z;
            return this;
        }

        @Override // com.spotify.music.podcast.episode.util.j.b
        public b d(boolean z) {
            this.f = z;
            return this;
        }

        @Override // com.spotify.music.podcast.episode.util.j.b
        public b e(String str, String str2) {
            this.g = new SimpleDateFormat(str, Locale.getDefault());
            this.h = new SimpleDateFormat(str2, Locale.getDefault());
            return this;
        }

        @Override // com.spotify.music.podcast.episode.util.j.b
        public b f(boolean z) {
            this.e = z;
            return this;
        }
    }

    public interface b {
        b a(boolean z);

        b b(boolean z);

        String build();

        b c(boolean z);

        b d(boolean z);

        b e(String str, String str2);

        b f(boolean z);
    }

    public j(Resources resources, cqe cqe, c cVar) {
        this.d = resources;
        this.e = cqe;
        this.f = cVar;
    }

    public b g(String str, int i, int i2, Integer num, boolean z) {
        return new a(new b(str, i, i2, num, z));
    }
}
