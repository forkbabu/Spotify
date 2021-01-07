package defpackage;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.EnumMap;

/* renamed from: yi  reason: default package */
public final class yi {
    private static SparseArray<Priority> a = new SparseArray<>();
    private static EnumMap<Priority, Integer> b;

    static {
        EnumMap<Priority, Integer> enumMap = new EnumMap<>(Priority.class);
        b = enumMap;
        enumMap.put((EnumMap<Priority, Integer>) Priority.DEFAULT, (Priority) 0);
        b.put((EnumMap<Priority, Integer>) Priority.VERY_LOW, (Priority) 1);
        b.put((EnumMap<Priority, Integer>) Priority.HIGHEST, (Priority) 2);
        for (Priority priority : b.keySet()) {
            a.append(b.get(priority).intValue(), priority);
        }
    }

    public static int a(Priority priority) {
        Integer num = b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    public static Priority b(int i) {
        Priority priority = a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(je.p0("Unknown Priority for value ", i));
    }
}
