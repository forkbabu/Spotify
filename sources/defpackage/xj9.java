package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: xj9  reason: default package */
public class xj9 {
    private final uj9 a;
    private final zj9 b;
    private final dk9 c;

    public xj9(uj9 uj9, zj9 zj9, dk9 dk9) {
        this.a = uj9;
        this.b = zj9;
        this.c = dk9;
    }

    public boolean a(Optional<tj9> optional) {
        this.a.getClass();
        DebugFlag debugFlag = DebugFlag.PREMIUM_DESTINATION_BADGE;
        if (!optional.isPresent()) {
            return false;
        }
        tj9 tj9 = optional.get();
        if (!(this.b.b() || tj9.startDate() == null || tj9.endDate() == null)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.ENGLISH);
            String startDate = tj9.startDate();
            String endDate = tj9.endDate();
            this.c.getClass();
            String format = simpleDateFormat.format(new Date(Long.valueOf(Calendar.getInstance().getTimeInMillis()).longValue()));
            try {
                Date parse = simpleDateFormat.parse(startDate);
                Date parse2 = simpleDateFormat.parse(endDate);
                Date parse3 = simpleDateFormat.parse(format);
                if (parse == null || parse2 == null || parse3 == null || parse3.getTime() < parse.getTime() || parse3.getTime() > parse2.getTime()) {
                    return false;
                }
                return true;
            } catch (ParseException e) {
                Logger.b("Exception Occurred : %s", e.getMessage());
            }
        }
        return false;
    }
}
