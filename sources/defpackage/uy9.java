package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.converter.ConvertProductValueException;
import com.spotify.mobile.android.converter.a;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: uy9  reason: default package */
public class uy9 implements l<Map<String, String>, Boolean> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Boolean apply(Map<String, String> map) {
        try {
            return Boolean.valueOf(a.a(map.get("filter-age-restricted-content")));
        } catch (ConvertProductValueException e) {
            Logger.e(e, "Unable to extract product state", new Object[0]);
            return Boolean.FALSE;
        }
    }
}
