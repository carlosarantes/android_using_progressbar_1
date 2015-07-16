package com.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class FilmDAO {
	
	private final String TABLENAME = "genre";
	private final DBManager connectionInstance;
	private SQLiteDatabase writable;
	private SQLiteDatabase readable;
	private Cursor cursor;
	private ContentValues contentValues;
	
	public FilmDAO(DBManager db){
		connectionInstance = db;
		writable = db.getWritableDatabase();
		readable = db.getReadableDatabase();
	}
	
}
