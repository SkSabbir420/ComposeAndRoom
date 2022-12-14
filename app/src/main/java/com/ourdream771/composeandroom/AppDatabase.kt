package com.ourdream771.composeandroom

import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import android.content.Context
import androidx.room.Room


import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}









//    companion object{
//        @Volatile
//        private var INSTANCE: AppDatabase? = null
//
//        fun getDatabase(
//            context: Context,
//            scope: CoroutineScope
//        ): AppDatabase {
//            // if the INSTANCE is not null, then return it,
//            // if it is, then create the database
//            return INSTANCE ?: synchronized(this) {
//                val instance = Room.databaseBuilder(
//                    context.applicationContext,
//                    AppDatabase::class.java,
//                    "word_database"
//                )
//                    // Wipes and rebuilds instead of migrating if no Migration object.
//                    // Migration is not part of this codelab.
//                    .fallbackToDestructiveMigration()
//                    .addCallback(WordDatabaseCallback(scope))
//                    .build()
//                INSTANCE = instance
//                // return instance
//                instance
//            }
//        }
//
//        private class WordDatabaseCallback(
//            private val scope: CoroutineScope
//        ) : RoomDatabase.Callback() {
//            /**
//             * Override the onCreate method to populate the database.
//             */
//            override fun onCreate(db: SupportSQLiteDatabase) {
//                super.onCreate(db)
//                // If you want to keep the data through app restarts,
//                // comment out the following line.
//                INSTANCE?.let { database ->
//                    scope.launch(Dispatchers.IO) {
//                        populateDatabase(database.userDao())
//                    }
//                }
//            }
//        }
//
//        /**
//         * Populate the database in a new coroutine.
//         * If you want to start with more words, just add them.
//         */
//        suspend fun populateDatabase(userDao: UserDao) {
//            // Start the app with a clean database every time.
//            // Not needed if you only populate on creation.
//
//            //userDao.deleteAll()
//
//            userDao.insertAll(User(1,"Sabbir","Hosen"))
//        }
//
//
//
//    }

//}