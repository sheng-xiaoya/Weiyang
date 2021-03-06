package com.wanghaisheng.weiyang.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.wanghaisheng.weiyang.database.Channel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CHANNEL".
*/
public class ChannelDao extends AbstractDao<Channel, Long> {

    public static final String TABLENAME = "CHANNEL";

    /**
     * Properties of entity Channel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Channel_tag = new Property(1, String.class, "channel_tag", false, "CHANNEL_TAG");
        public final static Property Channel_title = new Property(2, String.class, "channel_title", false, "CHANNEL_TITLE");
        public final static Property Channel_json = new Property(3, String.class, "channel_json", false, "CHANNEL_JSON");
    };


    public ChannelDao(DaoConfig config) {
        super(config);
    }
    
    public ChannelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CHANNEL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"CHANNEL_TAG\" TEXT," + // 1: channel_tag
                "\"CHANNEL_TITLE\" TEXT," + // 2: channel_title
                "\"CHANNEL_JSON\" TEXT);"); // 3: channel_json
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CHANNEL\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Channel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String channel_tag = entity.getChannel_tag();
        if (channel_tag != null) {
            stmt.bindString(2, channel_tag);
        }
 
        String channel_title = entity.getChannel_title();
        if (channel_title != null) {
            stmt.bindString(3, channel_title);
        }
 
        String channel_json = entity.getChannel_json();
        if (channel_json != null) {
            stmt.bindString(4, channel_json);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Channel readEntity(Cursor cursor, int offset) {
        Channel entity = new Channel( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // channel_tag
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // channel_title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // channel_json
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Channel entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setChannel_tag(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setChannel_title(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setChannel_json(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Channel entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Channel entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
