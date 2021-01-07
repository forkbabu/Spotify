package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;

public class h {
    public static <T extends RoomDatabase> RoomDatabase.a<T> a(Context context, Class<T> cls, String str) {
        if (str.trim().length() != 0) {
            return new RoomDatabase.a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    public static <T extends RoomDatabase> RoomDatabase.a<T> b(Context context, Class<T> cls) {
        return new RoomDatabase.a<>(context, cls, null);
    }
}
