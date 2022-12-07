package com.clovis.dataprovider.models;//package com.clovis.a20221205_ci_nycschools.models;
//
//import androidx.annotation.NonNull;
//import androidx.room.DatabaseConfiguration;
//import androidx.room.InvalidationTracker;
//import androidx.room.RoomDatabase;
//import androidx.sqlite.db.SupportSQLiteOpenHelper;
//
//public class AppDatabase extends RoomDatabase {
////a
//    @NonNull
//    @Override
//    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    protected InvalidationTracker createInvalidationTracker() {
//        return null;
//    }
//
//    @Override
//    public void clearAllTables() {
//
//    }
//
////    @Database(entities = [Post::class], version = 2)
////    abstract class AppDatabase : RoomDatabase() {
////
////        abstract fun psotDao(): PostDao
////
////        companion object {
////            private var instance : AppDatabase? = null
////
////            fun getDataBaseObject(applicationContext: Context) : AppDatabase {
////
////                if(instance == null) instance = Room.databaseBuilder(applicationContext,
////                        AppDatabase::class.java, applicationContext.getString(R.string.data_db))
////                .allowMainThreadQueries()
////                        .build()
////
////                return instance!!
////
////            }
////        }
////    }
//}
