package nl.hva.bucketlist.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import nl.hva.bucketlist.database.dao.BucketItemDao;
import nl.hva.bucketlist.database.entity.BucketItem;

@Database(entities = {BucketItem.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;
    public abstract BucketItemDao bucketItemDao();

    public static AppDatabase getInstance(Context context) {
        if( INSTANCE == null ) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "bucketlist-database")
                    .build();
        }

        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
